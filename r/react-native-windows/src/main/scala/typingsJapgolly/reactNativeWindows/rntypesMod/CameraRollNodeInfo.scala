package typingsJapgolly.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraRollNodeInfo extends StObject {
  
  var group_name: String
  
  var image: Image
  
  var location: Any
  
  var timestamp: Double
}
object CameraRollNodeInfo {
  
  inline def apply(group_name: String, image: Image, location: Any, timestamp: Double): CameraRollNodeInfo = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollNodeInfo]
  }
  
  extension [Self <: CameraRollNodeInfo](x: Self) {
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
