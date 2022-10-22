package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpNameValueHeaderValue extends StObject {
  
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue
  
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpNameValueHeaderValue {
  
  inline def apply(items: HttpNameValueHeaderValue, returnValue: Double): ItemsHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpNameValueHeaderValue]
  }
  
  extension [Self <: ItemsHttpNameValueHeaderValue](x: Self) {
    
    inline def setItems(value: HttpNameValueHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
