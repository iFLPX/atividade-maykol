function calcular() {
    const numero1 = Number(document.getElementById("numero1").value);
    const numero2 = Number(document.getElementById("numero2").value);
    const operacao = document.getElementById("operacao").value;

    let resultado;

    switch (operacao) {
        case "+":
            resultado = numero1 + numero2;
            break;

        case "-":
            resultado = numero1 - numero2;
            break;

        case "*":
            resultado = numero1 * numero2;
            break;

        case "/":
            if (numero2 === 0) {
                alert("Não é possível dividir por zero!");
                return;
            }

            resultado = numero1 / numero2;
            break;
    }

    localStorage.setItem("resultado", resultado);

    window.location.href = "resultado.html";
}