let valorAtual = "";
let valorAnterior = "";
let operador = "";

function adicionarNumero(numero) {
    valorAtual += numero;
    atualizarTela();
}

function adicionarDecimal() {
    if (!valorAtual.includes(".")) {
        valorAtual += ".";
        atualizarTela();
    }
}

function selecionarOperador(op) {
    if (valorAtual === "") return;

    if (valorAnterior !== "") {
        calcular();
    }

    operador = op;
    valorAnterior = valorAtual;
    valorAtual = "";
}

function calcular() {
    if (valorAnterior === "" || valorAtual === "" || operador === "") {
        return;
    }

    const numero1 = parseFloat(valorAnterior);
    const numero2 = parseFloat(valorAtual);
    let resultado;

    switch (operador) {
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
                limpar();
                return;
            }
            resultado = numero1 / numero2;
            break;
    }

    valorAtual = resultado.toString();
    valorAnterior = "";
    operador = "";

    atualizarTela();
}

function limpar() {
    valorAtual = "";
    valorAnterior = "";
    operador = "";

    atualizarTela();
}

function atualizarTela() {
    document.getElementById("tela").value = valorAtual || "0";
}
