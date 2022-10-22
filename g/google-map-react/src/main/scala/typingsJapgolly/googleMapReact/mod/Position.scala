package typingsJapgolly.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var lat: Double
  
  var lng: Double
  
  var weight: js.UndefOr[Double] = js.undefined
}
object Position {
  
  inline def apply(lat: Double, lng: Double): Position = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
