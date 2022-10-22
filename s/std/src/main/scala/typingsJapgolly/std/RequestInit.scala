package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInit extends StObject {
  
  /** A BodyInit object or null to set request's body. */
  /* standard dom */
  var body: js.UndefOr[BodyInit | Null] = js.undefined
  
  /** A string indicating how the request will interact with the browser's cache to set request's cache. */
  /* standard dom */
  var cache: js.UndefOr[org.scalajs.dom.RequestCache] = js.undefined
  
  /** A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials. */
  /* standard dom */
  var credentials: js.UndefOr[org.scalajs.dom.RequestCredentials] = js.undefined
  
  /** A Headers object, an object literal, or an array of two-item arrays to set request's headers. */
  /* standard dom */
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  /** A cryptographic hash of the resource to be fetched by request. Sets request's integrity. */
  /* standard dom */
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  
  /** A boolean to set request's keepalive. */
  /* standard dom */
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  
  /** A string to set request's method. */
  /* standard dom */
  var method: js.UndefOr[java.lang.String] = js.undefined
  
  /** A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode. */
  /* standard dom */
  var mode: js.UndefOr[org.scalajs.dom.RequestMode] = js.undefined
  
  /** A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect. */
  /* standard dom */
  var redirect: js.UndefOr[org.scalajs.dom.RequestRedirect] = js.undefined
  
  /** A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer. */
  /* standard dom */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  
  /** A referrer policy to set request's referrerPolicy. */
  /* standard dom */
  var referrerPolicy: js.UndefOr[org.scalajs.dom.ReferrerPolicy] = js.undefined
  
  /** An AbortSignal to set request's signal. */
  /* standard dom */
  var signal: js.UndefOr[org.scalajs.dom.AbortSignal | Null] = js.undefined
  
  /** Can only be null. Used to disassociate request from any Window. */
  /* standard dom */
  var window: js.UndefOr[Null] = js.undefined
}
object RequestInit {
  
  inline def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  extension [Self <: RequestInit](x: Self) {
    
    inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCache(value: org.scalajs.dom.RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCredentials(value: org.scalajs.dom.RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[java.lang.String, java.lang.String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIntegrity(value: java.lang.String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setKeepalive(value: scala.Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setMethod(value: java.lang.String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: org.scalajs.dom.RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRedirect(value: org.scalajs.dom.RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: org.scalajs.dom.ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
