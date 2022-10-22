package typingsJapgolly.peerjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataConnectionEvents extends StObject {
  
  /**
    * Emitted when data is received from the remote peer.
    */
  def data(data: Any): Unit
  
  /**
    * Emitted when the connection is established and ready-to-use.
    */
  def open(): Unit
}
object DataConnectionEvents {
  
  inline def apply(data: Any => Callback, open: Callback): DataConnectionEvents = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction1((t0: Any) => data(t0).runNow()), open = open.toJsFn)
    __obj.asInstanceOf[DataConnectionEvents]
  }
  
  extension [Self <: DataConnectionEvents](x: Self) {
    
    inline def setData(value: Any => Callback): Self = StObject.set(x, "data", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
