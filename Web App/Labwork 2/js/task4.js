function checkpass(event) {
  let password = document.getElementById("Password").value;
  let repassword = document.getElementById("rePassword").value;
    
  if (password !== repassword) {
    alert('The Re-type Password Not Match');
  }
  else {
    alert('Sign Up Complete')
  }
}

document.getElementById("submit").addEventListener("click", checkpass, false);