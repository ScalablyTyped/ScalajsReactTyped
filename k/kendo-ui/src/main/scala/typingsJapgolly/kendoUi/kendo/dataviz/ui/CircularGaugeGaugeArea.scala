package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircularGaugeGaugeArea extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[CircularGaugeGaugeAreaBorder] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[CircularGaugeGaugeAreaMargin] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object CircularGaugeGaugeArea {
  
  inline def apply(): CircularGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularGaugeGaugeArea]
  }
  
  extension [Self <: CircularGaugeGaugeArea](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: CircularGaugeGaugeAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: CircularGaugeGaugeAreaMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
