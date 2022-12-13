//la funcion feeByTimeParked calcula el costo por el tiempo estacionado
fun feeByTimeParked (vararg time:Int) :Int {
    //Calculo costo de estacionamiento por minutos
   var calculatedFee = if (time[1] >0 ) 6 else 0
    //Calculo costo de estacionamiento por horas, incluye descuento
   calculatedFee += if (time[0] >=3){
       time[0]*8
    }else{
       time[0]*10
    }
    return calculatedFee
}
fun main(){
    //cargo
    var fee =0
    //Obtenemos los minutos totales en los que el cliente estuvo estacionado
    //Input
    val totalMinutesParked = readln().toInt()
    //minutos convertidos a horas
    val convertedHoursParked = totalMinutesParked/60
    //minutos restantes al convertir los minutos totales entre horas
    val residueMinutesParked = totalMinutesParked%60
    fee = feeByTimeParked(convertedHoursParked,residueMinutesParked)
    println("Tiempo estacionado: $convertedHoursParked Horas y $residueMinutesParked min: Total = $fee")
}


/*
*
* En un estacionamiento se cuenta con los siguientes precios
Por Hora = $10
Por Fracción = $6
Promoción = $8 la hora (La promoción aplica a partir de la tercera hora)

Ejemplo 2 Horas y media:  Total = $26
Ejemplo 3 Horas y 15 min:  Total = $30 (3 horas x $8 y la fracción
*
*  */