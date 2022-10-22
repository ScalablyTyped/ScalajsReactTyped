package typingsJapgolly.openui5.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  /**
    * Whether or not to send the request asynchronously. Default: false In case sMethod is "GET", the request
    * is always asynchronous. Please be advised that this feature is officially unsupported as using asynchronous
    * requests can lead to data inconsistencies if the application does not make sure that the request was
    * completed before continuing to work with the data.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified the sPath has to be relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * a callback function which is called when the request failed. The handler can have the parameter: `oError`
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A string containing the type of method to call this function with
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * a callback function which is called when the data has been successfully retrieved. The handler can have
    * the following parameters: `oData` and `response`.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object Method {
  
  inline def apply(): Method = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method]
  }
  
  extension [Self <: Method](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
