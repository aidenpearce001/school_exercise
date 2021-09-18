let history = [0];

function multyply(event) {

  let last = performance.now();
  history.push(last)
  // console.log(history);
  // console.log(last);
  // console.log(history[0])
  console.log(last - history[0])
  document.getElementById("log").innerHTML = "Time between 2 clicks : " + (last - history[0]);
  history.shift();
}

document.getElementById("click1").addEventListener("click", multyply, false);



