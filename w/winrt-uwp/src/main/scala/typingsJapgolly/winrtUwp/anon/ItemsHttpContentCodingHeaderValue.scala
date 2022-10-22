package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpContentCodingHeaderValue extends StObject {
  
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: HttpContentCodingHeaderValue
  
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: Double
}
object ItemsHttpContentCodingHeaderValue {
  
  inline def apply(items: HttpContentCodingHeaderValue, returnValue: Double): ItemsHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpContentCodingHeaderValue]
  }
  
  extension [Self <: ItemsHttpContentCodingHeaderValue](x: Self) {
    
    inline def setItems(value: HttpContentCodingHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
