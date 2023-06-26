package com.legend.groovy

println 'Starting with def Data Type'
def a = 10

println a
println a.class

println 'Moving To String Data Type'
s = 'hello'
println s

name = "Legend"
s = "Hello ${name}"
println s

s='''
The three line declaration of string is used to 
define string in multiple lines
In this way we can avoid using "backslash n" at the end of each line
and write ,multiple lines of comment easily
'''
println s

emailPattern = /[a-z0-9]+@[a-z]+\.[a-z]{2,3}/
println emailPattern.getClass()
println "test@gmail.com" ==~ emailPattern