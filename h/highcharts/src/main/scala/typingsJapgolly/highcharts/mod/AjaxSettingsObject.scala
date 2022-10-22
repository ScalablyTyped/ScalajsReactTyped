package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.json
import typingsJapgolly.highcharts.highchartsStrings.octet
import typingsJapgolly.highcharts.highchartsStrings.text
import typingsJapgolly.highcharts.highchartsStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxSettingsObject extends StObject {
  
  /**
    * The payload to send.
    */
  var data: js.UndefOr[String | Dictionary[Any]] = js.undefined
  
  /**
    * The data type expected.
    */
  var dataType: js.UndefOr[json | octet | text | xml] = js.undefined
  
  /**
    * Function to call on error.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The headers; keyed on header name.
    */
  var headers: js.UndefOr[Dictionary[String]] = js.undefined
  
  /**
    * Function to call on success.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The HTTP method to use. For example GET or POST.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to call.
    */
  var url: String
}
object AjaxSettingsObject {
  
  inline def apply(url: String): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
  
  extension [Self <: AjaxSettingsObject](x: Self) {
    
    inline def setData(value: String | Dictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: json | octet | text | xml): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
