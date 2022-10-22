package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsHttpLanguageRangeWithQualityHeaderValue extends StObject {
  
  /** An array of HttpLanguageRangeWithQualityHeaderValue items that start at startIndex in the HttpLanguageRangeWithQualityHeaderValueCollection . */ var items: HttpLanguageRangeWithQualityHeaderValue
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsHttpLanguageRangeWithQualityHeaderValue {
  
  inline def apply(items: HttpLanguageRangeWithQualityHeaderValue, returnValue: Double): ItemsHttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpLanguageRangeWithQualityHeaderValue]
  }
  
  extension [Self <: ItemsHttpLanguageRangeWithQualityHeaderValue](x: Self) {
    
    inline def setItems(value: HttpLanguageRangeWithQualityHeaderValue): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
