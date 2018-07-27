package com.vin.test.bst;

//Recursive Java program to print lca of two nodes

//A binary tree node
class Node1 
{
 int data;
 Node2 left, right;

 Node1(int item) 
 {
     data = item;
     left = right = null;
 }
}

class LCABinaryTree 
{
 Node2 root;
   
 /* Function to find LCA of n1 and n2. The function assumes that both
    n1 and n2 are present in BST */
 Node2 lca(Node2 node, int n1, int n2) 
 {
     if (node == null)
         return null;

     // If both n1 and n2 are smaller than root, then LCA lies in left
     if (node.data > n1 && node.data > n2)
         return lca(node.left, n1, n2);

     // If both n1 and n2 are greater than root, then LCA lies in right
     if (node.data < n1 && node.data < n2) 
         return lca(node.right, n1, n2);

     return node;
 }

 /* Driver program to test lca() */
 public static void main(String args[]) 
 {
     // Let us construct the BST shown in the above figure
     LCABinaryTree tree = new LCABinaryTree();
     tree.root = new Node2(20);
     tree.root.left = new Node2(8);
     tree.root.right = new Node2(22);
     tree.root.left.left = new Node2(4);
     tree.root.left.right = new Node2(12);
     tree.root.left.right.left = new Node2(10);
     tree.root.left.right.right = new Node2(14);

     int n1 = 10, n2 = 14;
     Node2 t = tree.lca(tree.root, n1, n2);
     System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

     n1 = 14;
     n2 = 8;
     t = tree.lca(tree.root, n1, n2);
     System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

     n1 = 10;
     n2 = 22;
     t = tree.lca(tree.root, n1, n2);
     System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

 }
}
