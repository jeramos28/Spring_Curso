// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

    const request = await fetch('usuarios',{
      method: 'GET',
          headers:{
        'Accept': 'application/json',
        'Content-Type': 'application/json'
  }
});
  const usuarios = await request.json();

  let listadohtml = '';
  for (let usuario of usuarios){
      let usuariohtml = '<tr> <td>'+ usuario.nombre +'</td> <td>'+ usuario.apellido +'</td> <td>'+ usuario.email +'</td> <td><a href="#" class="btn btn-danger btclassNamecle btn-sm"> <i class="fas fa-trash"></iclassName </a></td> </tr>'
      listadohtml += usuariohtml;
  }

document.querySelector('#usuarios tbody').outerHTML= listadohtml;
}
