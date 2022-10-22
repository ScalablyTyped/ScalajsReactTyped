package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitTestSource extends StObject {
  
  def cancel(): Unit
}
object XRHitTestSource {
  
  inline def apply(cancel: Callback): XRHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[XRHitTestSource]
  }
  
  extension [Self <: XRHitTestSource](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
