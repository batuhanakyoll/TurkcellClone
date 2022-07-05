package com.batuhanakyol.turkcell

import java.io.Serializable

data class  Kampanyalar(var kampanyaId : Int ,
                        var kampanyaAdı : String ,
                        var kampanyaAdı2 : String,
                        var kampanyaResmi : String ,
                        var kampanyaInt : String ,
                        var kampanyaDakika : String ,
                        ) : Serializable {


}