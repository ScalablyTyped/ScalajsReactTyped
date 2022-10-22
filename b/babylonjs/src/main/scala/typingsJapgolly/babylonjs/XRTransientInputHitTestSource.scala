package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRTransientInputHitTestSource extends StObject {
  
  def cancel(): Unit
}
object XRTransientInputHitTestSource {
  
  inline def apply(cancel: Callback): XRTransientInputHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[XRTransientInputHitTestSource]
  }
  
  extension [Self <: XRTransientInputHitTestSource](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
