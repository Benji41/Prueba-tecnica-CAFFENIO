fun main(){
    //texto de ejemplo
    val text = "Gracias por tu compra benjamin te esperamos pronto, tu orden generó \$20 pesos de monedero"
    //delimitador de caracteres
    val cap =20
    //objeto para manipular el texto
    var worker = text
    //resultado
    var result = ""


    while (worker != "") {
        if (worker.length > cap){
            //si el caracter seguido del 20 es diferente de ' '
            if (worker[cap] != ' ') {
                //obten el indice mas cercano al caracter[cap]
                val indexOfLastWhiteSpace = worker.subSequence(0, cap).lastIndexOf(' ')
                //recorta desde el inicio hasta el indice del caracter inferior al espacio y lo agrega a resultado
                result += worker.substring(0, indexOfLastWhiteSpace) + "\n"
                //elimina los primeros caracteres hasta el indice del caracter del espacio cercano
                worker = worker.drop(indexOfLastWhiteSpace + 1)
            } else {
                //recorta hasta antes del cap y lo agrega a resultado
                result += worker.substring(0, cap)+"\n"
                //recorta la oracion incluyendo el espacio
                worker = worker.drop(cap+1)
            }
        }else{
            //agrega finalmente el restante del texto al resultado
            result+=worker
            worker=worker.drop(worker.length)
        }
    }
    println("Resultado: \n$result")
}


/*
*
* El resultado debe ser:
"Gracias por tu"
"compra candidato te"
"esperamos pronto, tu"
"orden generó $20"
"pesos de monedero"
*
* */