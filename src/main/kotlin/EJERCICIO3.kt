fun isVersionActualSuperior(actualVersion:String,versionToCompare:String):Boolean{
    //Convertimos ambos parametros a listas, cada elemento es separado por un punto, ademas utilizando una funcion lambda convertimos cada elemento de la lista a entero
    val actualVersionList  = actualVersion.split('.').map { it.toInt() }
    val versionToCompareList = versionToCompare.split('.').map { it.toInt() }
    return when{
        //verificamos que el primer elemento de la lista de la version actual es mayor
        actualVersionList[0] > versionToCompareList[0] -> true
        //verificamos que el primer elemento de ambas listas son iguales ademas de que el segundo elemento de la version actual sea mayor
        actualVersionList[0] == versionToCompareList[0]  && actualVersionList[1] > versionToCompareList[1]-> true
        //verificamos que los primeros dos elementos de ambas listas son iguales y que el ultimo elemento de la version actual sea mayor
        actualVersionList[0] == versionToCompareList[0]  && actualVersionList[1] == versionToCompareList[1] && actualVersionList[2] >= versionToCompareList[2]-> true
        //si no se cumplen ninguno de estas condicionales retorna falso
        else -> false
    }
}
fun main(){
    println(isVersionActualSuperior("1.10.1", "1.9.0"))
    println(isVersionActualSuperior("1.10.1", "1.10.1"))
    println(isVersionActualSuperior("1.10.1", "1.12.0"))
    println(isVersionActualSuperior("1.10.1", "1.10.2"))
    println(isVersionActualSuperior("1.10.1", "2.0.0"))
}

/*
* Las versiones de software contienen la siguiente nomenclatura "1.10.1" donde cada valor de izquierda a derecha significa que es superior comparado por orden.

Hacer una función que reciba dos versiones con esa nomenclatura 1ro es la versión actual de la aplicación y el segundo la versión contra la que se va evaluar y regresa true si es superior o igual, o false si es inferior la versión actual.

Ejemplo: parametro1 actual de la app, parámetro 2 contra la que se va evaluar => Resultado
"1.10.1", "1.9.0" =>  true
"1.10.1", "1.10.1" => true
"1.10.1", "1.12.0" => false
"1.10.1", "1.10.2" => false
"1.10.1", "2.0.0" => false

* */