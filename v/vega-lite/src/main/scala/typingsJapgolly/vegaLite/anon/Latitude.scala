package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latitude extends StObject {
  
  val latitude: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val latitude2: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val longitude: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val longitude2: typingsJapgolly.vegaLite.vegaLiteInts.`1`
}
object Latitude {
  
  inline def apply(): Latitude = {
    val __obj = js.Dynamic.literal(latitude = 1, latitude2 = 1, longitude = 1, longitude2 = 1)
    __obj.asInstanceOf[Latitude]
  }
  
  extension [Self <: Latitude](x: Self) {
    
    inline def setLatitude(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitude2(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude2(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
  }
}
