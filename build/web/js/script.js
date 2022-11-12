/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
function sendForm() {
          const XHR = new XMLHttpRequest();
          var formData = new URLSearchParams(new FormData(document.getElementById('form'))).toString();

          // Define what happens in case of error
          XHR.addEventListener('error', (event) => {
                    alert('Oops! Something went wrong.');
          });

          // Set up our request
          XHR.open('POST', 'SaveUser', true);
          XHR.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

          XHR.onload = () => {
                    if (XHR.readyState === XHR.DONE && XHR.status === 200) {
                              console.log("response => " + XHR.response);
                              showMessage("Registrado");

                    }
          };

          XHR.send(formData);
          console.log(formData);
}
function showMessage(message) {
          Swal.fire({
                    title: message,
                    width: 600,
                    padding: '3em',
                    color: '#716add',
                    background: 'linear-gradient(90deg, rgba(238,174,202,1) 0%, rgba(182,212,247,1) 100%)',
                    backdrop: `
    rgba(0,0,123,0.4)
    left top
    no-repeat
  `
          });
}

