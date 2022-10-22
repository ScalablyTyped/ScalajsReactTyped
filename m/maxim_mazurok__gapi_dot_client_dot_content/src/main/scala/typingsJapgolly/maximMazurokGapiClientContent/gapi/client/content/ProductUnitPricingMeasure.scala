package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductUnitPricingMeasure extends StObject {
  
  /** The unit of the measure. */
  var unit: js.UndefOr[String] = js.undefined
  
  /** The measure of an item. */
  var value: js.UndefOr[Double] = js.undefined
}
object ProductUnitPricingMeasure {
  
  inline def apply(): ProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductUnitPricingMeasure]
  }
  
  extension [Self <: ProductUnitPricingMeasure](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
