package typingsJapgolly.undici.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.Record
import typingsJapgolly.undici.typesDispatcherMod.AbortSignal
import typingsJapgolly.undici.typesDispatcherMod.HttpMethod
import typingsJapgolly.undici.typesDispatcherMod.^
import typingsJapgolly.undici.typesFormdataMod.FormData
import typingsJapgolly.undici.undiciStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  dispatcher :undici.undici/types/dispatcher.^ | undefined} & std.Omit<undici.undici/types/dispatcher.RequestOptions, 'origin' | 'path' | 'method'> & std.Partial<std.Pick<undici.undici/types/dispatcher.RequestOptions, 'method'>> */
trait dispatcherundefinedOmitRe extends StObject {
  
  var body: js.UndefOr[String | Buffer | js.typedarray.Uint8Array | Readable | Null | FormData] = js.undefined
  
  var bodyTimeout: js.UndefOr[Double | Null] = js.undefined
  
  var dispatcher: js.UndefOr[^] = js.undefined
  
  var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
  
  var headersTimeout: js.UndefOr[Double | Null] = js.undefined
  
  var idempotent: js.UndefOr[Boolean] = js.undefined
  
  var maxRedirections: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  var onInfo: js.UndefOr[js.Function1[/* info */ Headers, Unit]] = js.undefined
  
  var opaque: js.UndefOr[Any] = js.undefined
  
  var query: js.UndefOr[Record[String, Any]] = js.undefined
  
  var responseHeader: js.UndefOr[raw | Null] = js.undefined
  
  var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
  
  var throwOnError: js.UndefOr[Boolean] = js.undefined
  
  var upgrade: js.UndefOr[Boolean | String | Null] = js.undefined
}
object dispatcherundefinedOmitRe {
  
  inline def apply(): dispatcherundefinedOmitRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dispatcherundefinedOmitRe]
  }
  
  extension [Self <: dispatcherundefinedOmitRe](x: Self) {
    
    inline def setBody(value: String | Buffer | js.typedarray.Uint8Array | Readable | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyTimeout(value: Double): Self = StObject.set(x, "bodyTimeout", value.asInstanceOf[js.Any])
    
    inline def setBodyTimeoutNull: Self = StObject.set(x, "bodyTimeout", null)
    
    inline def setBodyTimeoutUndefined: Self = StObject.set(x, "bodyTimeout", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDispatcher(value: ^): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
    
    inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
    
    inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersTimeout(value: Double): Self = StObject.set(x, "headersTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeadersTimeoutNull: Self = StObject.set(x, "headersTimeout", null)
    
    inline def setHeadersTimeoutUndefined: Self = StObject.set(x, "headersTimeout", js.undefined)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
    
    inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    
    inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnInfo(value: /* info */ Headers => Callback): Self = StObject.set(x, "onInfo", js.Any.fromFunction1((t0: /* info */ Headers) => value(t0).runNow()))
    
    inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
    
    inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
    
    inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
    
    inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
    
    inline def setUpgrade(value: Boolean | String): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeNull: Self = StObject.set(x, "upgrade", null)
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
  }
}
