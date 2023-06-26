package com.legend.groovy

int product(int  x,int y) {
    return x*y
}
println product(5,10)

// we can reduce the syntax further more
// But the below is not recommended
def product1(x,y) {
    x*y
}
result = product1 10,5
println result

// We can have default values for the arguments
int product2(int  x=3,int y) {
    return x*y
}
println product2(10)

// We can pass named parameters as well

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}
display(name:'Iphone',price:1000)
// we can even remove the brackets also
display name:'Iphone 14 pro max',price:1400
