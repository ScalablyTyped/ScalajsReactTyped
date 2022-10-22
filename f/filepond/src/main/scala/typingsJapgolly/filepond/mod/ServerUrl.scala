package typingsJapgolly.filepond.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.FormData
import typingsJapgolly.filepond.filepondStrings.DELETE
import typingsJapgolly.filepond.filepondStrings.GET
import typingsJapgolly.filepond.filepondStrings.POST
import typingsJapgolly.filepond.filepondStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerUrl extends StObject {
  
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  
  var method: js.UndefOr[GET | POST | PUT | DELETE] = js.undefined
  
  /**
    * Called with the formdata object right before it is sent,
    * return extended formdata object to make changes.
    */
  var ondata: js.UndefOr[js.Function1[/* data */ FormData, FormData]] = js.undefined
  
  /**
    * Called when server error is received, receives the response
    * body, useful to select the relevant error data.
    */
  var onerror: js.UndefOr[js.Function1[/* responseBody */ Any, Any]] = js.undefined
  
  /**
    * Called when server response is received, useful for getting
    * the unique file id from the server response.
    */
  var onload: js.UndefOr[js.Function1[/* response */ Any, Double | String]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: String
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ServerUrl {
  
  inline def apply(url: String): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerUrl]
  }
  
  extension [Self <: ServerUrl](x: Self) {
    
    inline def setHeaders(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOndata(value: /* data */ FormData => FormData): Self = StObject.set(x, "ondata", js.Any.fromFunction1(value))
    
    inline def setOndataUndefined: Self = StObject.set(x, "ondata", js.undefined)
    
    inline def setOnerror(value: /* responseBody */ Any => Any): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnload(value: /* response */ Any => Double | String): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
