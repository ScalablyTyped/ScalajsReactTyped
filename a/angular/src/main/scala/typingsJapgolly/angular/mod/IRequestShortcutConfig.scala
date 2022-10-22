package typingsJapgolly.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
trait IRequestShortcutConfig
  extends StObject
     with IHttpProviderDefaults {
  
  /**
    * {string|Object}
    * Data to be sent as the request message data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Name of the parameter added (by AngularJS) to the request to specify the name (in the server response) of the JSON-P callback to invoke.
    * If unspecified, $http.defaults.jsonpCallbackParam will be used by default. This property is only applicable to JSON-P requests.
    */
  var jsonpCallbackParam: js.UndefOr[String] = js.undefined
  
  /**
    * {Object.<string|Object>}
    * Map of strings or objects which will be turned to ?key1=value1&key2=value2 after the url. If the value is not a string, it will be JSONified.
    */
  var params: js.UndefOr[Any] = js.undefined
  
  /**
    * See [XMLHttpRequest.responseType]https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest#xmlhttprequest-responsetype
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /**
    * Timeout in milliseconds, or promise that should abort the request when resolved.
    */
  var timeout: js.UndefOr[Double | IPromise[Any]] = js.undefined
}
object IRequestShortcutConfig {
  
  inline def apply(): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
  
  extension [Self <: IRequestShortcutConfig](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setJsonpCallbackParam(value: String): Self = StObject.set(x, "jsonpCallbackParam", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallbackParamUndefined: Self = StObject.set(x, "jsonpCallbackParam", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setTimeout(value: Double | IPromise[Any]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
