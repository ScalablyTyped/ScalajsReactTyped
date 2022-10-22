package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ state in sharedb.sharedb/lib/sharedb.ConnectionState ]: (reason : string): void} */
trait ConnectionStateEventMap extends StObject {
  
  def closed(reason: String): Unit
  @JSName("closed")
  var closed_Original: js.Function1[/* reason */ String, Unit]
  
  def connected(reason: String): Unit
  @JSName("connected")
  var connected_Original: js.Function1[/* reason */ String, Unit]
  
  def connecting(reason: String): Unit
  @JSName("connecting")
  var connecting_Original: js.Function1[/* reason */ String, Unit]
  
  def disconnected(reason: String): Unit
  @JSName("disconnected")
  var disconnected_Original: js.Function1[/* reason */ String, Unit]
  
  def stopped(reason: String): Unit
  @JSName("stopped")
  var stopped_Original: js.Function1[/* reason */ String, Unit]
}
object ConnectionStateEventMap {
  
  inline def apply(
    closed: /* reason */ String => japgolly.scalajs.react.Callback,
    connected: /* reason */ String => japgolly.scalajs.react.Callback,
    connecting: /* reason */ String => japgolly.scalajs.react.Callback,
    disconnected: /* reason */ String => japgolly.scalajs.react.Callback,
    stopped: /* reason */ String => japgolly.scalajs.react.Callback
  ): ConnectionStateEventMap = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1((t0: /* reason */ String) => closed(t0).runNow()), connected = js.Any.fromFunction1((t0: /* reason */ String) => connected(t0).runNow()), connecting = js.Any.fromFunction1((t0: /* reason */ String) => connecting(t0).runNow()), disconnected = js.Any.fromFunction1((t0: /* reason */ String) => disconnected(t0).runNow()), stopped = js.Any.fromFunction1((t0: /* reason */ String) => stopped(t0).runNow()))
    __obj.asInstanceOf[ConnectionStateEventMap]
  }
  
  extension [Self <: ConnectionStateEventMap](x: Self) {
    
    inline def setClosed(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "closed", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setConnected(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setConnecting(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connecting", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setDisconnected(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setStopped(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "stopped", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
  }
}
