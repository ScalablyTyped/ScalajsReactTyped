package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a viewport, or rectangular region, of a graphics surface.
  *
  * ref: https://immersive-web.github.io/webxr/#xrviewport-interface
  */
trait XRViewport extends StObject {
  
  val height: Double
  
  val width: Double
  
  val x: Double
  
  val y: Double
}
object XRViewport {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): XRViewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewport]
  }
  
  extension [Self <: XRViewport](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
