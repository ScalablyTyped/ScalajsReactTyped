package typingsJapgolly.atlassianConnectJs.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.atlassianConnectJs.AP.RequestOptions
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsBooleans.`true`
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.CONNECT
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.DELETE
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.GET
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.HEAD
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.OPTIONS
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.PATCH
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.POST
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  success :(response : std.ArrayBuffer): void | undefined,   binaryAttachment :true} & {  type :'GET' | 'HEAD' | 'POST' | 'PUT' | 'DELETE' | 'CONNECT' | 'OPTIONS' | 'PATCH' | undefined,   cache :boolean | undefined,   data :string | object | undefined,   contentType :string | undefined,   headers :{  Accept :string,   If-Match :string,   If-None-Match :string} | undefined,   error :(xhr : std.XMLHttpRequest, statusText : string, errorThrown : any): void | undefined,   experimental :boolean | undefined} */
trait successresponseArrayBuffe
  extends StObject
     with RequestOptions {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: `true`
  
  /**
    * If the request should be cached.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content-type string value of the entity body, above; required when data is supplied.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The body of the request; required if type is 'POST' or 'PUT'. Optionally, for 'GET' this will append the object as key=value pairs to the end of the URL query string.
    */
  var data: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * An optional callback function executed when a HTTP status error code is returned.
    */
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ Any, Unit]
  ] = js.undefined
  
  /**
    * If this is set to true, the developer acknowledges that the API endpoint which is being called may be in beta state, and thus may also have a shorter deprecation cycle than stable APIs.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object containing headers to set; supported headers are: 'Accept', 'If-Match' and 'If-None-Match'.
    */
  var headers: js.UndefOr[Accept] = js.undefined
  
  /**
    * An optional callback function executed on a 200 success status code.
    */
  var success: js.UndefOr[js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]] = js.undefined
  
  /**
    * The HTTP method name.
    */
  var `type`: js.UndefOr[GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH] = js.undefined
}
object successresponseArrayBuffe {
  
  inline def apply(): successresponseArrayBuffe = {
    val __obj = js.Dynamic.literal(binaryAttachment = true)
    __obj.asInstanceOf[successresponseArrayBuffe]
  }
  
  extension [Self <: successresponseArrayBuffe](x: Self) {
    
    inline def setBinaryAttachment(value: `true`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: (/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ Any) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: /* xhr */ XMLHttpRequest, t1: /* statusText */ String, t2: /* errorThrown */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setHeaders(value: Accept): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSuccess(value: /* response */ js.typedarray.ArrayBuffer => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* response */ js.typedarray.ArrayBuffer) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
