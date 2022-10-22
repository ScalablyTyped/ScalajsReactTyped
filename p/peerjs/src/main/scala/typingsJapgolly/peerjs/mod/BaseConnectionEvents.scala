package typingsJapgolly.peerjs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.RTCIceConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseConnectionEvents extends StObject {
  
  /**
    * Emitted when either you or the remote peer closes the connection.
    */
  def close(): Unit
  
  def error(error: js.Error): Unit
  
  def iceStateChanged(state: RTCIceConnectionState): Unit
}
object BaseConnectionEvents {
  
  inline def apply(close: Callback, error: js.Error => Callback, iceStateChanged: RTCIceConnectionState => Callback): BaseConnectionEvents = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), iceStateChanged = js.Any.fromFunction1((t0: RTCIceConnectionState) => iceStateChanged(t0).runNow()))
    __obj.asInstanceOf[BaseConnectionEvents]
  }
  
  extension [Self <: BaseConnectionEvents](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setIceStateChanged(value: RTCIceConnectionState => Callback): Self = StObject.set(x, "iceStateChanged", js.Any.fromFunction1((t0: RTCIceConnectionState) => value(t0).runNow()))
  }
}
