package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.yandexMaps.mod.IGeoObject
import typingsJapgolly.yandexMaps.mod.IGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictk
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var geoObjects: js.Array[IGeoObject[IGeometry]]
}
object Dictk {
  
  inline def apply(geoObjects: js.Array[IGeoObject[IGeometry]]): Dictk = {
    val __obj = js.Dynamic.literal(geoObjects = geoObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  extension [Self <: Dictk](x: Self) {
    
    inline def setGeoObjects(value: js.Array[IGeoObject[IGeometry]]): Self = StObject.set(x, "geoObjects", value.asInstanceOf[js.Any])
    
    inline def setGeoObjectsVarargs(value: IGeoObject[IGeometry]*): Self = StObject.set(x, "geoObjects", js.Array(value*))
  }
}
