package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask extends StObject {
  
  var duration: Double
  
  var mask: Boolean
  
  def onClose(): Unit
}
object Mask {
  
  inline def apply(duration: Double, mask: Boolean, onClose: Callback): Mask = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = onClose.toJsFn)
    __obj.asInstanceOf[Mask]
  }
  
  extension [Self <: Mask](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
  }
}
