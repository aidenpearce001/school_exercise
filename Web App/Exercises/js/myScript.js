function myFunction() { 
    document.getElementById("demo").innerHTML= "Welcome to the World of JavaScript";
}	

// EX38
// document.getElementById("display").innerHTML= "Hi " + name + " How are you?";

// EX39
var s1 = window.prompt("Please enter the first number: ");
var s2= window.prompt("Please enter the second number: ");
var n1=parseInt(s1);
var n2=parseInt(s2);
var sum=n1+n2;
document.write("The first number is: " + s1 + "<br\>");
document.write("The second number is: " + s2 + "<br\>");
document.write("Our sum is: " + sum + "<br\>");

console.log(sum)
// EX40
var strValue = "4" + 3 + 1;
var strValueTwo = 4 + 3 + "1";	
var firstResult = "35" - 3;
// var v2 = ++v; ??
// var v3 = v++; ??
document.write(strValue + "<br\>");
document.write(strValueTwo + "<br\>" );
document.write(firstResult + "<br\>");
// document.write(v2 + "<br\>"); ??
// document.write(v3 + "<br\>"); ??


