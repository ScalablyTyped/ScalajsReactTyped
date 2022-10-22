package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sharedb.sharedb/lib/sharedb.ConnectionStateEventMap & {connection error (error : sharedb.sharedb/lib/sharedb.Error): void, doc (doc : sharedb.sharedb/lib/sharedb.Doc<any>): void, error (error : sharedb.sharedb/lib/sharedb.Error): void, pong (): void, receive (request : sharedb.sharedb/lib/sharedb.ConnectionReceiveRequest): void, send (message : any): void, state (newState : sharedb.sharedb/lib/sharedb.ConnectionState, reason : string): void} */
trait ConnectionEventMap extends StObject {
  
  def closed(reason: String): Unit
  @JSName("closed")
  var closed_Original: js.Function1[/* reason */ String, Unit]
  
  def connected(reason: String): Unit
  @JSName("connected")
  var connected_Original: js.Function1[/* reason */ String, Unit]
  
  def connecting(reason: String): Unit
  @JSName("connecting")
  var connecting_Original: js.Function1[/* reason */ String, Unit]
  
  def `connection error`(error: Error): Unit
  
  def disconnected(reason: String): Unit
  @JSName("disconnected")
  var disconnected_Original: js.Function1[/* reason */ String, Unit]
  
  def doc(doc: Doc[Any]): Unit
  
  def error(error: Error): Unit
  
  def pong(): Unit
  
  def receive(request: ConnectionReceiveRequest): Unit
  
  def send(message: Any): Unit
  
  def state(newState: ConnectionState, reason: String): Unit
  
  def stopped(reason: String): Unit
  @JSName("stopped")
  var stopped_Original: js.Function1[/* reason */ String, Unit]
}
object ConnectionEventMap {
  
  inline def apply(
    closed: /* reason */ String => japgolly.scalajs.react.Callback,
    connected: /* reason */ String => japgolly.scalajs.react.Callback,
    connecting: /* reason */ String => japgolly.scalajs.react.Callback,
    `connection error`: Error => japgolly.scalajs.react.Callback,
    disconnected: /* reason */ String => japgolly.scalajs.react.Callback,
    doc: Doc[Any] => japgolly.scalajs.react.Callback,
    error: Error => japgolly.scalajs.react.Callback,
    pong: japgolly.scalajs.react.Callback,
    receive: ConnectionReceiveRequest => japgolly.scalajs.react.Callback,
    send: Any => japgolly.scalajs.react.Callback,
    state: (ConnectionState, String) => japgolly.scalajs.react.Callback,
    stopped: /* reason */ String => japgolly.scalajs.react.Callback
  ): ConnectionEventMap = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1((t0: /* reason */ String) => closed(t0).runNow()), connected = js.Any.fromFunction1((t0: /* reason */ String) => connected(t0).runNow()), connecting = js.Any.fromFunction1((t0: /* reason */ String) => connecting(t0).runNow()), disconnected = js.Any.fromFunction1((t0: /* reason */ String) => disconnected(t0).runNow()), doc = js.Any.fromFunction1((t0: Doc[Any]) => doc(t0).runNow()), error = js.Any.fromFunction1((t0: Error) => error(t0).runNow()), pong = pong.toJsFn, receive = js.Any.fromFunction1((t0: ConnectionReceiveRequest) => receive(t0).runNow()), send = js.Any.fromFunction1((t0: Any) => send(t0).runNow()), state = js.Any.fromFunction2((t0: ConnectionState, t1: String) => (state(t0, t1)).runNow()), stopped = js.Any.fromFunction1((t0: /* reason */ String) => stopped(t0).runNow()))
    __obj.updateDynamic("connection error")(js.Any.fromFunction1((t0: Error) => (`connection error`(t0)).runNow()))
    __obj.asInstanceOf[ConnectionEventMap]
  }
  
  extension [Self <: ConnectionEventMap](x: Self) {
    
    inline def setClosed(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "closed", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setConnected(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setConnecting(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connecting", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def `setConnection error`(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "connection error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
    
    inline def setDisconnected(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def setDoc(value: Doc[Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "doc", js.Any.fromFunction1((t0: Doc[Any]) => value(t0).runNow()))
    
    inline def setError(value: Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
    
    inline def setPong(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "pong", value.toJsFn)
    
    inline def setReceive(value: ConnectionReceiveRequest => japgolly.scalajs.react.Callback): Self = StObject.set(x, "receive", js.Any.fromFunction1((t0: ConnectionReceiveRequest) => value(t0).runNow()))
    
    inline def setSend(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setState(value: (ConnectionState, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "state", js.Any.fromFunction2((t0: ConnectionState, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStopped(value: /* reason */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "stopped", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
  }
}
