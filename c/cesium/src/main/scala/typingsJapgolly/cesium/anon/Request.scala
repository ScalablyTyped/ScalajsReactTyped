package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Resource
import typingsJapgolly.cesium.mod.Resource.RetryCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var data: Any
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[typingsJapgolly.cesium.mod.Proxy] = js.undefined
  
  var queryParameters: js.UndefOr[Any] = js.undefined
  
  var request: js.UndefOr[typingsJapgolly.cesium.mod.Request] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  
  var templateValues: js.UndefOr[Any] = js.undefined
  
  var url: String
}
object Request {
  
  inline def apply(data: Any, url: String): Request = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setProxy(value: typingsJapgolly.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryParameters(value: Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setRequest(value: typingsJapgolly.cesium.mod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryCallback(
      value: (/* resource */ js.UndefOr[Resource], /* error */ js.UndefOr[js.Error]) => Boolean | js.Promise[Boolean]
    ): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    inline def setTemplateValues(value: Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
