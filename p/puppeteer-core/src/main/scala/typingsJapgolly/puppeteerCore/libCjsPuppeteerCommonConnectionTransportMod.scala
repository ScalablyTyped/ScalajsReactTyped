package typingsJapgolly.puppeteerCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonConnectionTransportMod {
  
  trait ConnectionTransport extends StObject {
    
    def close(): Unit
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    def send(message: String): Unit
  }
  object ConnectionTransport {
    
    inline def apply(close: Callback, send: String => Callback): ConnectionTransport = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, send = js.Any.fromFunction1((t0: String) => send(t0).runNow()))
      __obj.asInstanceOf[ConnectionTransport]
    }
    
    extension [Self <: ConnectionTransport](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOnclose(value: Callback): Self = StObject.set(x, "onclose", value.toJsFn)
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOnmessage(value: /* message */ String => Callback): Self = StObject.set(x, "onmessage", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
      
      inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      inline def setSend(value: String => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
