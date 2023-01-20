fun main(){
    println("dashSeparateTest guion :"+" "+dashSeparateTest())
    println("dashSeparateTest1 guion error:"+" "+dashSeparateTest1())
    println("sizeLicPlateTes digitos:"+" "+sizeLicPlateTest())
    println("sizeLicPlateTest2 digitos error:"+" "+sizeLicPlateTest2())
    println("getProvinceTest provincias :"+" "+ getProvinceTest())
    println("getProvinceTest1 provincias desconocido:"+" "+ getProvinceTest1())
}

fun sizeLicPlate(licPlate: String):Boolean{
    val tam = 8
    val  placa = licPlate.length
    return placa == tam
}
fun dashSeparate(licPlate: String):Boolean{
    val guion = "-"
    return licPlate.substring(3,4) == guion
}
fun getProvince(licPlate: String):String{
    val provincia = when (licPlate.substring(0,1)){
        "A" -> ("Azuay")
        "P" -> ("Pichincha")
        "Y" -> ("Santa Elena")
        else -> ("Desconocido")
    }
    /*return ("Tu plca es: "+provincia)*/
    return (provincia)
}

fun sizeLicPlateTest(): Boolean {
    val res = sizeLicPlate("AAV-8989")
    val esp= true
    return ( esp == res)
}

fun sizeLicPlateTest2(): Boolean {
    val res = sizeLicPlate("PAS-2003")
    val esp= true
    return ( esp == res)
}
fun dashSeparateTest(): Boolean {
    val res = dashSeparate("AAV-2003")
    val esp= true
    return ( esp == res)
}

fun dashSeparateTest1(): Boolean {
    val res = dashSeparate("AAV-2003")
    val esp= true
    return ( esp == res)
}

fun getProvinceTest(): Boolean {
    val esp = "Pichincha"
    val res = getProvince("PAV-2003")
    return( esp == res)
}

fun getProvinceTest1(): Boolean {
    val esp = "Desconocido"
    val res = getProvince("XAV-2003")
    return (esp == res)
}