package com.legend.groovy

// By default list will be of ArrayList Type
l = [1,2,3]
println l
println l.class

// If we want to change the type
LinkedList l = [1,2,3]
println l
println l.class

// Groovy have overloaded operator
// To add we can use << symbol

l << 4
println l

// We can append another list to the same list

l=l+[5,6,7]
println l

// we can remove from the list
l=l-[3,5]
println l

// We can use closure with the list
l.each { println it }

// To reverse the list
l.reverseEach { println it }

// To calculate each permutation
l.eachPermutation { println it}