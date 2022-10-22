package typingsJapgolly.httpProxyMiddleware

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHandlersResponseInterceptorMod {
  
  @JSImport("http-proxy-middleware/dist/handlers/response-interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def responseInterceptor(interceptor: Interceptor): js.Function3[
    /* proxyRes */ IncomingMessage, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("responseInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* proxyRes */ IncomingMessage, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ]]
  
  type Interceptor = js.Function4[
    /* buffer */ Buffer, 
    /* proxyRes */ IncomingMessage, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[Buffer | String]
  ]
}
