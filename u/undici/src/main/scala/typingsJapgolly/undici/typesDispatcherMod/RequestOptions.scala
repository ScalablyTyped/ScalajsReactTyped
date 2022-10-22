package typingsJapgolly.undici.typesDispatcherMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.undici.anon.Headers
import typingsJapgolly.undici.undiciStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with DispatchOptions {
  
  /** Default: 0 */
  var maxRedirections: js.UndefOr[Double] = js.undefined
  
  /** Default: `null` */
  var onInfo: js.UndefOr[js.Function1[/* info */ Headers, Unit]] = js.undefined
  
  /** Default: `null` */
  var opaque: js.UndefOr[Any] = js.undefined
  
  /** Default: `null` */
  var responseHeader: js.UndefOr[raw | Null] = js.undefined
  
  /** Default: `null` */
  var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
}
object RequestOptions {
  
  inline def apply(method: HttpMethod, path: String): RequestOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    
    inline def setOnInfo(value: /* info */ Headers => Callback): Self = StObject.set(x, "onInfo", js.Any.fromFunction1((t0: /* info */ Headers) => value(t0).runNow()))
    
    inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
    
    inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
    
    inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
