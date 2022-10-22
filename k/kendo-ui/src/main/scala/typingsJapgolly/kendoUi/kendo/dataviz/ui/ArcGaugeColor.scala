package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeColor extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
}
object ArcGaugeColor {
  
  inline def apply(): ArcGaugeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeColor]
  }
  
  extension [Self <: ArcGaugeColor](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
