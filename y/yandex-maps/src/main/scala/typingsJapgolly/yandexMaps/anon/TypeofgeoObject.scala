package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.yandexMaps.mod.GeoObject_
import typingsJapgolly.yandexMaps.mod.IGeometry
import typingsJapgolly.yandexMaps.mod.geoObject.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgeoObject extends StObject {
  
  var Balloon: Instantiable1[
    /* geoObject */ GeoObject_[IGeometry, js.Object], 
    typingsJapgolly.yandexMaps.mod.geoObject.Balloon
  ]
  
  var Hint: Instantiable1[
    /* geoObject */ GeoObject_[IGeometry, js.Object], 
    typingsJapgolly.yandexMaps.mod.geoObject.Hint
  ]
  
  var Sequence: Instantiable1[
    /* geoObject */ GeoObject_[IGeometry, js.Object], 
    typingsJapgolly.yandexMaps.mod.geoObject.Sequence
  ]
}
object TypeofgeoObject {
  
  inline def apply(
    Balloon: Instantiable1[
      /* geoObject */ GeoObject_[IGeometry, js.Object], 
      typingsJapgolly.yandexMaps.mod.geoObject.Balloon
    ],
    Hint: Instantiable1[
      /* geoObject */ GeoObject_[IGeometry, js.Object], 
      typingsJapgolly.yandexMaps.mod.geoObject.Hint
    ],
    Sequence: Instantiable1[/* geoObject */ GeoObject_[IGeometry, js.Object], Sequence]
  ): TypeofgeoObject = {
    val __obj = js.Dynamic.literal(Balloon = Balloon.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], Sequence = Sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgeoObject]
  }
  
  extension [Self <: TypeofgeoObject](x: Self) {
    
    inline def setBalloon(
      value: Instantiable1[
          /* geoObject */ GeoObject_[IGeometry, js.Object], 
          typingsJapgolly.yandexMaps.mod.geoObject.Balloon
        ]
    ): Self = StObject.set(x, "Balloon", value.asInstanceOf[js.Any])
    
    inline def setHint(
      value: Instantiable1[
          /* geoObject */ GeoObject_[IGeometry, js.Object], 
          typingsJapgolly.yandexMaps.mod.geoObject.Hint
        ]
    ): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Instantiable1[/* geoObject */ GeoObject_[IGeometry, js.Object], Sequence]): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
  }
}
