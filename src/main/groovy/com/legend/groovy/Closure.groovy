package com.legend.groovy

c={
    println 'Closure are super simple'
}
c.call()

// we can pass arguments
// and arguments can have default value to handle null pointer exception
c1={ n=2->
    println(n%2==0?"even":"odd")
}
c1.call(4)
// for the below default value will be used
c1.call()

//Execute the closure 4 times
4.times { n->print n}
println()
4.times {print it}