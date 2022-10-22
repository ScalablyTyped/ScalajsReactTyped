package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductUnitPricingBaseMeasure extends StObject {
  
  /** The unit of the denominator. */
  var unit: js.UndefOr[String] = js.undefined
  
  /** The denominator of the unit price. */
  var value: js.UndefOr[String] = js.undefined
}
object ProductUnitPricingBaseMeasure {
  
  inline def apply(): ProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductUnitPricingBaseMeasure]
  }
  
  extension [Self <: ProductUnitPricingBaseMeasure](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
