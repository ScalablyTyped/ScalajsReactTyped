package typingsJapgolly.babylonjs

import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRTrackedImageInit extends StObject {
  
  var image: ImageBitmap
  
  var widthInMeters: Double
}
object XRTrackedImageInit {
  
  inline def apply(image: ImageBitmap, widthInMeters: Double): XRTrackedImageInit = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], widthInMeters = widthInMeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRTrackedImageInit]
  }
  
  extension [Self <: XRTrackedImageInit](x: Self) {
    
    inline def setImage(value: ImageBitmap): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setWidthInMeters(value: Double): Self = StObject.set(x, "widthInMeters", value.asInstanceOf[js.Any])
  }
}
