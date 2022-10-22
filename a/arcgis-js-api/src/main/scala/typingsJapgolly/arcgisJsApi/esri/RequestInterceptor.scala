package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInterceptor
  extends StObject
     with Object {
  
  /**
    * Makes changes to the response after the request is sent, but before it's returned to the caller.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var after: js.UndefOr[AfterInterceptorCallback] = js.undefined
  
  /**
    * Make changes to the request URL or options before the request is sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var before: js.UndefOr[BeforeInterceptorCallback] = js.undefined
  
  /**
    * When an error occurs during the request processing, this function is called with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) object giving the details about what happened.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var error: js.UndefOr[ErrorCallback] = js.undefined
  
  /**
    * Sets or adds headers into `requestOptions.headers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var headers: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets or adds query parameters into `requestOptions.query`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var query: js.UndefOr[Any] = js.undefined
  
  /**
    * Hardcodes the [response](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var responseData: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the URL(s) to apply to the interceptors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var urls: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
}
object RequestInterceptor {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestInterceptor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestInterceptor]
  }
  
  extension [Self <: RequestInterceptor](x: Self) {
    
    inline def setAfter(value: /* response */ RequestResponse => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* response */ RequestResponse) => value(t0).runNow()))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* params */ Any => Any): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setError(value: /* error */ Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ Error) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResponseData(value: Any): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
    
    inline def setResponseDataUndefined: Self = StObject.set(x, "responseData", js.undefined)
    
    inline def setUrls(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
