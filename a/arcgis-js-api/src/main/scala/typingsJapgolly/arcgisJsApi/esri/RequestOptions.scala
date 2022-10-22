package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-prompt`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.anonymous
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.auto
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blob
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.delete
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.document
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.head
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.image
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.immediate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.json
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.native
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.post
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.put
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xml
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with Object {
  
  /**
    * Indicates if and how requests to ArcGIS Services are authenticated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var authMode: js.UndefOr[auto | anonymous | immediate | `no-prompt`] = js.undefined
  
  /**
    * If uploading a file, specify the form data or element used to submit the file here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[FormData | HTMLFormElement | String] = js.undefined
  
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Headers to use for the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[Any] = js.undefined
  
  /**
    * Indicates if the request should be made using the HTTP DELETE, HEAD, POST, or PUT method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[auto | delete | head | post | put] = js.undefined
  
  /**
    * Query parameters for the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var query: js.UndefOr[Any] = js.undefined
  
  /**
    * Response format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var responseType: js.UndefOr[json | text | `array-buffer` | blob | image | native | document | xml] = js.undefined
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the request should use the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if cross-site `Access-Control` requests should use credentials.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object RequestOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setAuthMode(value: auto | anonymous | immediate | `no-prompt`): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    inline def setBody(value: FormData | HTMLFormElement | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCacheBust(value: Boolean): Self = StObject.set(x, "cacheBust", value.asInstanceOf[js.Any])
    
    inline def setCacheBustUndefined: Self = StObject.set(x, "cacheBust", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: auto | delete | head | post | put): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResponseType(value: json | text | `array-buffer` | blob | image | native | document | xml): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
    
    inline def setUseProxyUndefined: Self = StObject.set(x, "useProxy", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
