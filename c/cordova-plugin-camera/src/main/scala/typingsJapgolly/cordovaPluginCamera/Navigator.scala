package typingsJapgolly.cordovaPluginCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * This plugin provides an API for taking pictures and for choosing images from the system's image library.
    */
  var camera: Camera
}
object Navigator {
  
  inline def apply(camera: Camera): Navigator = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
  }
}
