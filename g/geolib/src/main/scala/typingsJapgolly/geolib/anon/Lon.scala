package typingsJapgolly.geolib.anon

import typingsJapgolly.geolib.esTypesMod.GeolibInputLongitude
import typingsJapgolly.geolib.esTypesMod.GeolibLongitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lon
  extends StObject
     with GeolibInputLongitude {
  
  var lon: GeolibLongitudeInputValue
}
object Lon {
  
  inline def apply(lon: GeolibLongitudeInputValue): Lon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  
  extension [Self <: Lon](x: Self) {
    
    inline def setLon(value: GeolibLongitudeInputValue): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
