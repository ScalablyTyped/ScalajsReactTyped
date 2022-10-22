package typingsJapgolly.raygun.buildTypesMod

import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOptions extends StObject {
  
  var callback: Callback[IncomingMessage]
  
  var http: HTTPOptions
  
  var message: String
}
object SendOptions {
  
  inline def apply(callback: Callback[IncomingMessage], http: HTTPOptions, message: String): SendOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  
  extension [Self <: SendOptions](x: Self) {
    
    inline def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackFunction1(value: /* t */ IncomingMessage | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* t */ IncomingMessage | Null) => value(t0).runNow()))
    
    inline def setCallbackFunction2(
      value: (/* e */ js.Error | Null, /* t */ IncomingMessage | Null) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* e */ js.Error | Null, t1: /* t */ IncomingMessage | Null) => (value(t0, t1)).runNow()))
    
    inline def setHttp(value: HTTPOptions): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
