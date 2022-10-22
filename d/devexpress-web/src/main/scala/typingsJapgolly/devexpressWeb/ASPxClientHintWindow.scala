package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
trait ASPxClientHintWindow extends StObject {
  
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  def SetContent(html: Any, options: ASPxClientHintOptions): Unit
  
  /**
    * Set the hint's loading animation
    */
  def SetContentLoading(): Unit
  
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit
}
object ASPxClientHintWindow {
  
  inline def apply(
    SetContent: (Any, ASPxClientHintOptions) => Callback,
    SetContentLoading: Callback,
    UpdatePosition: Callback
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal(SetContent = js.Any.fromFunction2((t0: Any, t1: ASPxClientHintOptions) => (SetContent(t0, t1)).runNow()), SetContentLoading = SetContentLoading.toJsFn, UpdatePosition = UpdatePosition.toJsFn)
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
  
  extension [Self <: ASPxClientHintWindow](x: Self) {
    
    inline def setSetContent(value: (Any, ASPxClientHintOptions) => Callback): Self = StObject.set(x, "SetContent", js.Any.fromFunction2((t0: Any, t1: ASPxClientHintOptions) => (value(t0, t1)).runNow()))
    
    inline def setSetContentLoading(value: Callback): Self = StObject.set(x, "SetContentLoading", value.toJsFn)
    
    inline def setUpdatePosition(value: Callback): Self = StObject.set(x, "UpdatePosition", value.toJsFn)
  }
}
