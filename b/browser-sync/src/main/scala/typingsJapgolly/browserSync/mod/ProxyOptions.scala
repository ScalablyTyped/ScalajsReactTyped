package typingsJapgolly.browserSync.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
  var error: js.UndefOr[
    js.Function3[
      /* err */ ErrnoException, 
      /* req */ IncomingMessage, 
      /* res */ ServerResponse[IncomingMessage], 
      Unit
    ]
  ] = js.undefined
  
  var middleware: js.UndefOr[MiddlewareHandler] = js.undefined
  
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
  ] = js.undefined
  
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.undefined
  
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var ws: js.UndefOr[Boolean] = js.undefined
}
object ProxyOptions {
  
  inline def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  
  extension [Self <: ProxyOptions](x: Self) {
    
    inline def setError(
      value: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Callback
    ): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: /* err */ ErrnoException, t1: /* req */ IncomingMessage, t2: /* res */ ServerResponse[IncomingMessage]) => (value(t0, t1, t2)).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMiddleware(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* next */ js.Function0[Unit]) => Any
    ): Self = StObject.set(x, "middleware", js.Any.fromFunction3(value))
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setProxyReq(
      value: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
    ): Self = StObject.set(x, "proxyReq", value.asInstanceOf[js.Any])
    
    inline def setProxyReqFunction1(value: /* res */ IncomingMessage => Callback): Self = StObject.set(x, "proxyReq", js.Any.fromFunction1((t0: /* res */ IncomingMessage) => value(t0).runNow()))
    
    inline def setProxyReqUndefined: Self = StObject.set(x, "proxyReq", js.undefined)
    
    inline def setProxyReqVarargs(value: (js.Function1[/* res */ IncomingMessage, Unit])*): Self = StObject.set(x, "proxyReq", js.Array(value*))
    
    inline def setProxyRes(value: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]): Self = StObject.set(x, "proxyRes", value.asInstanceOf[js.Any])
    
    inline def setProxyResFunction3(
      value: (/* proxyRes */ ServerResponse[IncomingMessage] | IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* req */ IncomingMessage) => Callback
    ): Self = StObject.set(x, "proxyRes", js.Any.fromFunction3((t0: /* proxyRes */ ServerResponse[IncomingMessage] | IncomingMessage, t1: /* res */ ServerResponse[IncomingMessage], t2: /* req */ IncomingMessage) => (value(t0, t1, t2)).runNow()))
    
    inline def setProxyResUndefined: Self = StObject.set(x, "proxyRes", js.undefined)
    
    inline def setProxyResVarargs(value: ProxyResponseMiddleware*): Self = StObject.set(x, "proxyRes", js.Array(value*))
    
    inline def setReqHeaders(value: /* config */ js.Object => Hash[js.Object]): Self = StObject.set(x, "reqHeaders", js.Any.fromFunction1(value))
    
    inline def setReqHeadersUndefined: Self = StObject.set(x, "reqHeaders", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    
    inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
  }
}
