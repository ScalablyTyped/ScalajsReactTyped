package typingsJapgolly.jqueryJsonrpcclient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CloseEvent
import org.scalajs.dom.Event
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.WebSocket
import typingsJapgolly.jquery.JQuery.AjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonRpcClientOptions
  extends StObject
     with AjaxSettings[Any] {
  
  var ajaxUrl: String
  
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[Unit], WebSocket]] = js.undefined
  
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var onclose: js.UndefOr[js.Function1[/* ev */ CloseEvent, Unit]] = js.undefined
  
  var onerror: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onmessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, Unit]] = js.undefined
  
  var onopen: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var socketUrl: js.UndefOr[String] = js.undefined
}
object JsonRpcClientOptions {
  
  inline def apply(ajaxUrl: String): JsonRpcClientOptions = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcClientOptions]
  }
  
  extension [Self <: JsonRpcClientOptions](x: Self) {
    
    inline def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
    
    inline def setGetSockect(value: /* onmessageCb */ js.Function0[Unit] => WebSocket): Self = StObject.set(x, "getSockect", js.Any.fromFunction1(value))
    
    inline def setGetSockectUndefined: Self = StObject.set(x, "getSockect", js.undefined)
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOnclose(value: /* ev */ CloseEvent => Callback): Self = StObject.set(x, "onclose", js.Any.fromFunction1((t0: /* ev */ CloseEvent) => value(t0).runNow()))
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setOnerror(value: /* ev */ Event => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* ev */ Event) => value(t0).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnmessage(value: /* ev */ MessageEvent => Callback): Self = StObject.set(x, "onmessage", js.Any.fromFunction1((t0: /* ev */ MessageEvent) => value(t0).runNow()))
    
    inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
    
    inline def setOnopen(value: /* ev */ Event => Callback): Self = StObject.set(x, "onopen", js.Any.fromFunction1((t0: /* ev */ Event) => value(t0).runNow()))
    
    inline def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
    
    inline def setSocketUrl(value: String): Self = StObject.set(x, "socketUrl", value.asInstanceOf[js.Any])
    
    inline def setSocketUrlUndefined: Self = StObject.set(x, "socketUrl", js.undefined)
  }
}
