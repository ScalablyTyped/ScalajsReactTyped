package typingsJapgolly.koaProxies

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[
        js.Function3[
          /* error */ Any, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
    
    var proxyReq: js.UndefOr[
        js.Function3[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
    
    var proxyRes: js.UndefOr[
        js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(
        value: (/* error */ Any, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Callback
      ): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: /* error */ Any, t1: /* req */ IncomingMessage, t2: /* res */ ServerResponse[IncomingMessage]) => (value(t0, t1, t2)).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProxyReq(
        value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Callback
      ): Self = StObject.set(x, "proxyReq", js.Any.fromFunction3((t0: /* proxyReq */ ClientRequest, t1: /* req */ IncomingMessage, t2: /* res */ ServerResponse[IncomingMessage]) => (value(t0, t1, t2)).runNow()))
      
      inline def setProxyReqUndefined: Self = StObject.set(x, "proxyReq", js.undefined)
      
      inline def setProxyRes(
        value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Callback
      ): Self = StObject.set(x, "proxyRes", js.Any.fromFunction3((t0: /* proxyRes */ IncomingMessage, t1: /* req */ IncomingMessage, t2: /* res */ ServerResponse[IncomingMessage]) => (value(t0, t1, t2)).runNow()))
      
      inline def setProxyResUndefined: Self = StObject.set(x, "proxyRes", js.undefined)
    }
  }
}
