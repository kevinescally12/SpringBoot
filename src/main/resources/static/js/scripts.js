function agregarActorSelect(select) {
    let index = select.selectedIndex;
    let option = select.options[index];
    let id = option.value;
    let nombre = option.text;
    let imagen = option.getAttribute('data-url');  // Obtener la URL de la imagen

    // Evitar agregar el option "Seleccionar actor"
    if (id === "0") return;

    option.disabled = "disabled";
    select.selectedIndex = 0;

    agregarActor(id, nombre, imagen);

    let idsActoresInput = document.getElementById('idsActores');
    let currentIds = idsActoresInput.value ? idsActoresInput.value.split(',') : [];

    if (!currentIds.includes(id)) {
        currentIds.push(id);
        idsActoresInput.value = currentIds.join(',');
    }
}

function agregarActor(id, nombre, imagen) {
    let htmlString = `
    <div class="card col-md-3 m-2" style="width: 10rem">
        <img src="${imagen}" class="card-img-top" alt="${nombre}" style="height: 150px; object-fit: cover;">
        <div class="card-body">
            <p class="card-text">${nombre}</p>
            <button type="button" class="btn btn-danger btn-sm" data-id="${id}" onclick="eliminarActor(this); return false;">Eliminar</button>
        </div>
    </div>`;

    $('#protagonistas_container').append(htmlString);
}

function eliminarActor(btn) {
    let id = btn.getAttribute('data-id');
    let node = btn.parentElement.parentElement;
    
    let idsActoresInput = document.getElementById('idsActores');
    let arrayIdx = idsActoresInput.value.split(',').filter(idActor => idActor !== id);
    idsActoresInput.value = arrayIdx.join(',');
    
    $(`#protagonistas option[value='${id}']`).prop('disabled', false);
    
    $(node).remove();
}

function previsualizar() {
    let reader = new FileReader();

    reader.readAsDataURL(document.getElementById("archivo").files[0]);

    reader.onload = function(e) {
        let vista = document.getElementById("vista_previa");
        vista.classList.remove("d-none");
        vista.style.backgroundImage = "url('" + e.target.result + "')";
    }
}
