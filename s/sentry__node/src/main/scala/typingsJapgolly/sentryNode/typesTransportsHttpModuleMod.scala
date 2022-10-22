package typingsJapgolly.sentryNode

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.sentryNode.sentryNodeStrings.data
import typingsJapgolly.sentryNode.sentryNodeStrings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsHttpModuleMod {
  
  @js.native
  trait HTTPModule extends StObject {
    
    /**
      * Request wrapper
      * @param options These are {@see TransportOptions}
      * @param callback Callback when request is finished
      */
    def request(options: HTTPModuleRequestOptions): Writable = js.native
    def request(
      options: HTTPModuleRequestOptions,
      callback: js.Function1[/* res */ HTTPModuleRequestIncomingMessage, Unit]
    ): Writable = js.native
  }
  
  trait HTTPModuleRequestIncomingMessage extends StObject {
    
    var headers: IncomingHttpHeaders
    
    def on(event: data | end, listener: js.Function0[Unit]): Unit
    
    def setEncoding(encoding: String): Unit
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object HTTPModuleRequestIncomingMessage {
    
    inline def apply(
      headers: IncomingHttpHeaders,
      on: (data | end, js.Function0[Unit]) => Callback,
      setEncoding: String => Callback
    ): HTTPModuleRequestIncomingMessage = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: data | end, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), setEncoding = js.Any.fromFunction1((t0: String) => setEncoding(t0).runNow()))
      __obj.asInstanceOf[HTTPModuleRequestIncomingMessage]
    }
    
    extension [Self <: HTTPModuleRequestIncomingMessage](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (data | end, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: data | end, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetEncoding(value: String => Callback): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type HTTPModuleRequestOptions = RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions | String | URL_
}
