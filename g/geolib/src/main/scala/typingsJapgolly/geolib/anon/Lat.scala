package typingsJapgolly.geolib.anon

import typingsJapgolly.geolib.esTypesMod.GeolibInputLatitude
import typingsJapgolly.geolib.esTypesMod.GeolibLatitudeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat
  extends StObject
     with GeolibInputLatitude {
  
  var lat: GeolibLatitudeInputValue
}
object Lat {
  
  inline def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  extension [Self <: Lat](x: Self) {
    
    inline def setLat(value: GeolibLatitudeInputValue): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
  }
}
