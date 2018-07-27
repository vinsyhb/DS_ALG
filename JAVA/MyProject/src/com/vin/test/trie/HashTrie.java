package com.vin.test.trie;

import java.util.HashMap;
import java.util.Map;

public class HashTrie {
	private static class TrieNode {
		private Map<Character, TrieNode> children;
		boolean isLeafNode;
		int count;
		
		public TrieNode() {
			children = new HashMap<Character, TrieNode>();
			count = 0;
		}

		public TrieNode getChild(char ch) {
			return children.get(ch);
		}
		
		public TrieNode setChild(char ch) {
			return children.put(ch, new TrieNode());
		}

		public boolean isLeafNode() {
			return isLeafNode;
		}

		public void setLeafNode(boolean isLeafNode) {
			this.isLeafNode = isLeafNode;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}	
	}

	private TrieNode root;

	public HashTrie() {
		root = new TrieNode();
	}

	public boolean insert(String str) {
		TrieNode head = root;
		head.setCount(head.getCount()+1);
		for(char ch : str.toCharArray()){
			
			if(head.getChild(ch) == null){
				head.setChild(ch);
			}			
			head = head.getChild(ch);
			head.setCount(head.getCount()+1);
		}
		if(head.isLeafNode()){			
			return false;
		}
		head.setLeafNode(true);
		return true;
	}
	
	public boolean searchCompleteWord(String str) {
		TrieNode head = root;
		for(char ch : str.toCharArray()){
			head = head.getChild(ch);
			if(head == null){
				return false;
			}
		}
		return head.isLeafNode();
	}
	
	/**
	 * count number of words starting with str
	 * @param str
	 * @return
	 */
	public int searchPartialWord(String str) {
		TrieNode head = root;
		for(char ch : str.toCharArray()){
			head = head.getChild(ch);
			if(head == null){
				return 0;
			}
		}
		return head.getCount();
	}
}