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

// Moving On to Set
// By default it uses LinkedHashSet
s=['java','js','python'] as Set
println s
println s.class

// Moving on to Map
// By default it uses LinkedHashMap
m=[courseName:'Gradle',rating:'4',price:'10']
println m
println m.getClass()

// we can have closures on map
m.each {k,v ->
    println k
    println v
}

// To access the value in the map
println m.courseName
println m['courseName']
println m.get('courseName')

// we can add key values to the map
m.review='Its decent'
println(m.review)