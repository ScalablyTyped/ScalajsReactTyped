package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndZoomTool extends StObject {
  
  def close(): Unit
  
  def ondrawend(event: typingsJapgolly.baidumapWebSdk.anon.Bounds): Unit
  
  def open(): Boolean
}
object DragAndZoomTool {
  
  inline def apply(
    close: japgolly.scalajs.react.Callback,
    ondrawend: typingsJapgolly.baidumapWebSdk.anon.Bounds => japgolly.scalajs.react.Callback,
    open: CallbackTo[Boolean]
  ): DragAndZoomTool = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, ondrawend = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Bounds) => ondrawend(t0).runNow()), open = open.toJsFn)
    __obj.asInstanceOf[DragAndZoomTool]
  }
  
  extension [Self <: DragAndZoomTool](x: Self) {
    
    inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOndrawend(value: typingsJapgolly.baidumapWebSdk.anon.Bounds => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ondrawend", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Bounds) => value(t0).runNow()))
    
    inline def setOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "open", value.toJsFn)
  }
}
