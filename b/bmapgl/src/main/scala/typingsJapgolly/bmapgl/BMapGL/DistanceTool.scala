package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bmapgl.anon.Distance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceTool extends StObject {
  
  def close(): Unit
  
  def ondrawend(event: Distance): Unit
  
  def open(): Boolean
}
object DistanceTool {
  
  inline def apply(
    close: japgolly.scalajs.react.Callback,
    ondrawend: Distance => japgolly.scalajs.react.Callback,
    open: CallbackTo[Boolean]
  ): DistanceTool = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, ondrawend = js.Any.fromFunction1((t0: Distance) => ondrawend(t0).runNow()), open = open.toJsFn)
    __obj.asInstanceOf[DistanceTool]
  }
  
  extension [Self <: DistanceTool](x: Self) {
    
    inline def setClose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setOndrawend(value: Distance => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ondrawend", js.Any.fromFunction1((t0: Distance) => value(t0).runNow()))
    
    inline def setOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "open", value.toJsFn)
  }
}
