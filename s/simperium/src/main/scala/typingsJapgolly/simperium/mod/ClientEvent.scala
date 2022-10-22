package typingsJapgolly.simperium.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.simperium.simperiumInts.`0`
import typingsJapgolly.simperium.simperiumInts.`1`
import typingsJapgolly.simperium.simperiumInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEvent
  extends StObject
     with SimperiumEvent {
  
  def `access-token`(token: String): Unit
  
  def close(): Unit
  
  def connect(): Unit
  
  def disconnect(): Unit
  
  def error(error: js.Error): Unit
  
  def message(message: String): Unit
  
  @JSName("message:h")
  def messageColonh(count: Double): Unit
  
  @JSName("message:log")
  def messageColonlog(logLevel: `0` | `1` | `2`): Unit
  
  def reconnect(attempt: Double): Unit
  
  def send(msg: String): Unit
  
  def unauthorized(details: FailedAuthDetails): Unit
}
object ClientEvent {
  
  inline def apply(
    `access-token`: String => Callback,
    close: Callback,
    connect: Callback,
    disconnect: Callback,
    error: js.Error => Callback,
    message: String => Callback,
    messageColonh: Double => Callback,
    messageColonlog: `0` | `1` | `2` => Callback,
    reconnect: Double => Callback,
    send: String => Callback,
    unauthorized: FailedAuthDetails => Callback
  ): ClientEvent = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, connect = connect.toJsFn, disconnect = disconnect.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), message = js.Any.fromFunction1((t0: String) => message(t0).runNow()), reconnect = js.Any.fromFunction1((t0: Double) => reconnect(t0).runNow()), send = js.Any.fromFunction1((t0: String) => send(t0).runNow()), unauthorized = js.Any.fromFunction1((t0: FailedAuthDetails) => unauthorized(t0).runNow()))
    __obj.updateDynamic("access-token")(js.Any.fromFunction1((t0: String) => `access-token`(t0).runNow()))
    __obj.updateDynamic("message:h")(js.Any.fromFunction1((t0: Double) => messageColonh(t0).runNow()))
    __obj.updateDynamic("message:log")(js.Any.fromFunction1((t0: `0` | `1` | `2`) => messageColonlog(t0).runNow()))
    __obj.asInstanceOf[ClientEvent]
  }
  
  extension [Self <: ClientEvent](x: Self) {
    
    inline def `setAccess-token`(value: String => Callback): Self = StObject.set(x, "access-token", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setMessage(value: String => Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setMessageColonh(value: Double => Callback): Self = StObject.set(x, "message:h", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setMessageColonlog(value: `0` | `1` | `2` => Callback): Self = StObject.set(x, "message:log", js.Any.fromFunction1((t0: `0` | `1` | `2`) => value(t0).runNow()))
    
    inline def setReconnect(value: Double => Callback): Self = StObject.set(x, "reconnect", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSend(value: String => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUnauthorized(value: FailedAuthDetails => Callback): Self = StObject.set(x, "unauthorized", js.Any.fromFunction1((t0: FailedAuthDetails) => value(t0).runNow()))
  }
}
