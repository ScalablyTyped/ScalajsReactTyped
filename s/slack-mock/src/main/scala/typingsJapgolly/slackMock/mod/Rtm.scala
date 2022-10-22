package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RTM
trait Rtm[T] extends StObject {
  
  var calls: js.Array[RtmCall[T]]
  
  var clients: js.Array[WebSocket]
  
  def reset(): Unit
  
  def send(token: String, message: T): js.Promise[Unit]
  
  def startServer(token: String): Unit
  
  def stopServer(token: String): Unit
}
object Rtm {
  
  inline def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[WebSocket],
    reset: Callback,
    send: (String, T) => js.Promise[Unit],
    startServer: String => Callback,
    stopServer: String => Callback
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], reset = reset.toJsFn, send = js.Any.fromFunction2(send), startServer = js.Any.fromFunction1((t0: String) => startServer(t0).runNow()), stopServer = js.Any.fromFunction1((t0: String) => stopServer(t0).runNow()))
    __obj.asInstanceOf[Rtm[T]]
  }
  
  extension [Self <: Rtm[?], T](x: Self & Rtm[T]) {
    
    inline def setCalls(value: js.Array[RtmCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: RtmCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setClients(value: js.Array[WebSocket]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsVarargs(value: WebSocket*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: (String, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    inline def setStartServer(value: String => Callback): Self = StObject.set(x, "startServer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStopServer(value: String => Callback): Self = StObject.set(x, "stopServer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
