package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpConnectionOptionHeaderValue extends StObject {
  
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue
  
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpConnectionOptionHeaderValue {
  
  inline def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): ItemsHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpConnectionOptionHeaderValue]
  }
  
  extension [Self <: ItemsHttpConnectionOptionHeaderValue](x: Self) {
    
    inline def setItems(value: HttpConnectionOptionHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
