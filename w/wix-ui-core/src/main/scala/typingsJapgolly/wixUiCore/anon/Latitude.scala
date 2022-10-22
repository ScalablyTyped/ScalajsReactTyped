package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latitude extends StObject {
  
  var latitude: Any
  
  var longitude: Any
}
object Latitude {
  
  inline def apply(latitude: Any, longitude: Any): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latitude]
  }
  
  extension [Self <: Latitude](x: Self) {
    
    inline def setLatitude(value: Any): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Any): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
