function multyply(event) {
  let num1 = document.getElementById("num1").value;
  let num2 = document.getElementById("num2").value;
  
  document.getElementById('log').innerHTML = "";
  document.getElementById('log').innerHTML += '<br>Result : ' + num1*num2;
}

function divide(event) {
  let num1 = document.getElementById("num1").value;
  let num2 = document.getElementById("num2").value;

  document.getElementById('log').innerHTML = "";
    
  if (num2 == 0) {
    alert('Cant divide by Zero');
  }
  else {
    document.getElementById('log').innerHTML += '<br>Result : ' + num1/num2;
  }
}

document.getElementById("multiply").addEventListener("click", multyply, false);
document.getElementById("divide").addEventListener("click", divide, false);