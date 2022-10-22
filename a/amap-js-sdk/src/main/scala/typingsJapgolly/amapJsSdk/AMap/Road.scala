package typingsJapgolly.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Road extends StObject {
  
  var direction: String
  
  var distance: Double
  
  var id: String
  
  var location: LngLat
  
  var name: String
}
object Road {
  
  inline def apply(direction: String, distance: Double, id: String, location: LngLat, name: String): Road = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Road]
  }
  
  extension [Self <: Road](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
