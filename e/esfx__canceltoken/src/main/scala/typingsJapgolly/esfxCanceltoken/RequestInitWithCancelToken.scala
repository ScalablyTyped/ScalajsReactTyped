package typingsJapgolly.esfxCanceltoken

import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import typingsJapgolly.esfxCanceltoken.mod.CancelToken
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.RequestInit, 'signal'> */
trait RequestInitWithCancelToken extends StObject {
  
  var body: js.UndefOr[BodyInit | Null] = js.undefined
  
  var cache: js.UndefOr[RequestCache] = js.undefined
  
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var keepalive: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[RequestMode] = js.undefined
  
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  
  var referrer: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  
  var signal: js.UndefOr[AbortSignal | Null | CancelToken] = js.undefined
  
  var window: js.UndefOr[Null] = js.undefined
}
object RequestInitWithCancelToken {
  
  inline def apply(): RequestInitWithCancelToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInitWithCancelToken]
  }
  
  extension [Self <: RequestInitWithCancelToken](x: Self) {
    
    inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setSignal(value: AbortSignal | CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
