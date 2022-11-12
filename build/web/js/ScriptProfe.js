

 function sendForm2(){
	const XHR = new XMLHttpRequest();
	  var formData = new URLSearchParams(new FormData(document.getElementById('form'))).toString();

	  // Define what happens in case of error
	  XHR.addEventListener('error', (event) => {
	    alert('Oops! Something went wrong.');
	  });

	  // Set up our request
	  XHR.open('POST', 'profesorController', true);
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



function showMessage(message){
  Swal.fire({
  title: message,
  width: 600,
  padding: '3em',
  color: '#716add',
  background: '#fff url(./images/truckWallpaperAlert.png)',
  backdrop: `
    rgba(0,0,123,0.4)
    url("https://images.vexels.com/media/users/3/206006/isolated/preview/3538885ee4f6d3de4aeb1a3aa6c644bf-dibujos-animados-lindo-libro-de-texto.png")
    left top
    no-repeat
  `   
});
}

