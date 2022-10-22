package typingsJapgolly.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groupname extends StObject {
  
  var group_name: String
  
  var image: Height
  
  var location: Altitude
  
  var timestamp: Double
  
  var `type`: String
}
object Groupname {
  
  inline def apply(group_name: String, image: Height, location: Altitude, timestamp: Double, `type`: String): Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupname]
  }
  
  extension [Self <: Groupname](x: Self) {
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Height): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
