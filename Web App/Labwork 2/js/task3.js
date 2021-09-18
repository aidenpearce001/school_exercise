function even_odd(event) {
    const _range = document.getElementById("range").value;
  
    for (var x=0; x<=_range; x++) {
      if (x === 0) {
        document.getElementById('log').innerHTML += x+ ' is even<br>';
        console.log(x +  " is even");
      }
      else if (x % 2 === 0) {
        document.getElementById('log').innerHTML += x+ ' is even<br>'; 
      }
      else {
        document.getElementById('log').innerHTML += x+ ' is odd<br>';
      }
    }
  }

document.getElementById("submit1").addEventListener("click", even_odd, false);