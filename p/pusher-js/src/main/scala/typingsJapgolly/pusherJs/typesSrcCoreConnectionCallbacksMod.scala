package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcCoreConnectionHandshakeHandshakePayloadMod.HandshakePayload
import typingsJapgolly.pusherJs.typesSrcCoreConnectionProtocolActionMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionCallbacksMod {
  
  trait ConnectionCallbacks extends StObject {
    
    def activity(): Unit
    
    def closed(): Unit
    
    def error(error: Any): Unit
    
    def message(message: Any): Unit
    
    def ping(): Unit
  }
  object ConnectionCallbacks {
    
    inline def apply(
      activity: Callback,
      closed: Callback,
      error: Any => Callback,
      message: Any => Callback,
      ping: Callback
    ): ConnectionCallbacks = {
      val __obj = js.Dynamic.literal(activity = activity.toJsFn, closed = closed.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), message = js.Any.fromFunction1((t0: Any) => message(t0).runNow()), ping = ping.toJsFn)
      __obj.asInstanceOf[ConnectionCallbacks]
    }
    
    extension [Self <: ConnectionCallbacks](x: Self) {
      
      inline def setActivity(value: Callback): Self = StObject.set(x, "activity", value.toJsFn)
      
      inline def setClosed(value: Callback): Self = StObject.set(x, "closed", value.toJsFn)
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setMessage(value: Any => Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPing(value: Callback): Self = StObject.set(x, "ping", value.toJsFn)
    }
  }
  
  @js.native
  trait ErrorCallbacks extends StObject {
    
    def backoff(result: HandshakePayload): Unit = js.native
    def backoff(result: Action): Unit = js.native
    
    def refused(result: HandshakePayload): Unit = js.native
    def refused(result: Action): Unit = js.native
    
    def retry(result: HandshakePayload): Unit = js.native
    def retry(result: Action): Unit = js.native
    
    def tls_only(result: HandshakePayload): Unit = js.native
    def tls_only(result: Action): Unit = js.native
  }
  
  trait HandshakeCallbacks extends StObject {
    
    def connected(handshake: HandshakePayload): Unit
  }
  object HandshakeCallbacks {
    
    inline def apply(connected: HandshakePayload => Callback): HandshakeCallbacks = {
      val __obj = js.Dynamic.literal(connected = js.Any.fromFunction1((t0: HandshakePayload) => connected(t0).runNow()))
      __obj.asInstanceOf[HandshakeCallbacks]
    }
    
    extension [Self <: HandshakeCallbacks](x: Self) {
      
      inline def setConnected(value: HandshakePayload => Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: HandshakePayload) => value(t0).runNow()))
    }
  }
}
