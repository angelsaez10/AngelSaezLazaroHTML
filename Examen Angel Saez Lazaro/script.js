// ANGEL SAEZ LAZARO

function cambiaColor() {
    let color = document.getElementById("color").value;
    document.body.style.backgroundColor = color;
}

function restablecerColor() {
    document.body.style.backgroundColor = "#ffffff"; 
    document.getElementById("color").value = "#ffffff";
}

function verDatos(){
    let datos=document.getElementById("datos1").value
    let dates=document.getElementById("datos2").value
    let datus=document.getElementById("datos3").value
    alert("Nombre: "+datos+"\n"+"Apellidos: "+dates+"\n"+"Contraseña: "+datus)
}

function actualizarPuntuacion() {
    let rango = document.getElementById("rango").value;
    document.getElementById("numero").value = rango; 
}


