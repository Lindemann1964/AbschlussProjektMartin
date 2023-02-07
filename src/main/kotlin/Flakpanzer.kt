class Flakpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,
    var freundFeind:Boolean
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){

}


//* Pz, SpähPz, SchützenPz, BergePz, JagdPz, FlakPz, PanzerHbz, TransportPz....//