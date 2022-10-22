package typingsJapgolly.googleMapReact.anon

import typingsJapgolly.googleMapReact.mod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: Lat
  
  var newBounds: Bounds
  
  var zoom: Double
}
object Center {
  
  inline def apply(center: Lat, newBounds: Bounds, zoom: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], newBounds = newBounds.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: Lat): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setNewBounds(value: Bounds): Self = StObject.set(x, "newBounds", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
