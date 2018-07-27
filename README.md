# Time complexity

Big O(n)
means time taken by the program to run is equivalent to the number of input
Big O(n^2)
means time taken by the program is n square times

# log n // to be found out

Big O notation gives upper bound  
Omega notation lower bound  
Theta notation uppper and lower bound  

# Big O notation:  
for a function fn(n) the Big O of n is defined as below  

Big O(g(n)) = { if there exists a constant c and n0 for fn(n) such that fn(n) <= c*g(n) for all n>=n0 }  

ex: fn(n) = 5n^2 + 2n + 1 then g(n ) will be = Big O(n^2)  
	g(n)  = n^2  
c(5+2+1) =8 ; fn(n) < = 8n^2 (8* g(n)); n>1 & n0=1 
this is upper limit for the time complexity  

# Omega notation :  
for a function fn(n) the omega of n is defined as below  
Omega ( g(n) ) = {if there exists a constants c and n0 for fn(n) such that c*g(n) <= fn(n) for all n>=n0}  
fn(n) = 5n^2 + 2n + 1 = Omega(n2)  
g(n) = n^2  
c =  5 and n > 0  
fn(n) > c * g(n) (5n^2)  
This is the lower limit  

# Theta notation :
for a function fn(n) the theta of n is defined as below   
Theta( g(n) ) = {if there exists a constants c1 , c2 and n0 for fn(n) such that c1*g(n) <= fn(n) <= c2*g(n) for all n>=n0}  
fn(n) = 5n^2+2n+1 = Theta(n^2)  
g(n) = n^2  
c1= 5, c2 = 8 ,n0=1  

For simple statements  
 Big O(1)
For single loop
 Big O(n)
For two loops
 Big O(n^2)


asymptomptic notation  
Quadratic growth  

Time complexity should always be calculated for  
	Very large input  
	Worst case  
For Big O rule  
	Drop the lower order terms  
	Drop constant multipliers  
------------------------  
# To calculate the time complexity formula  
	All assignments will be one time unit  
	All logical comparison will be one time unit  
	All arithmetic operation is a one time unit  
	All return statements will be one time unit  

Time and space complexity