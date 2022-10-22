package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FramebufferHeight extends StObject {
  
  var framebufferHeight: Double
  
  var framebufferWidth: Double
}
object FramebufferHeight {
  
  inline def apply(framebufferHeight: Double, framebufferWidth: Double): FramebufferHeight = {
    val __obj = js.Dynamic.literal(framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebufferHeight]
  }
  
  extension [Self <: FramebufferHeight](x: Self) {
    
    inline def setFramebufferHeight(value: Double): Self = StObject.set(x, "framebufferHeight", value.asInstanceOf[js.Any])
    
    inline def setFramebufferWidth(value: Double): Self = StObject.set(x, "framebufferWidth", value.asInstanceOf[js.Any])
  }
}
