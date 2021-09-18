function convert(degree) {
  var x;
  if (degree == "C") {
    x = document.getElementById("c").value * 9 / 5 + 32;
    document.getElementById("f").value = Math.round(x);
  } else {
    x = (document.getElementById("f").value -32) * 5 / 9;
    document.getElementById("c").value = Math.round(x);
  }
}

function largestnum(event) {
  let num1 = document.getElementById("num1").value;
  let num2 = document.getElementById("num2").value;
  let num3 = document.getElementById("num3").value;
  let num4 = document.getElementById("num4").value;
  let num5 = document.getElementById("num5").value;

  const largest = Math.max(num1, num2, num3, num4, num5);

  alert("The largest number is " + largest);
}


document.getElementById("submit").addEventListener("click", largestnum, false);