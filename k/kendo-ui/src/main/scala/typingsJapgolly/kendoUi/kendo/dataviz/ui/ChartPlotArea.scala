package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPlotArea extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[ChartPlotAreaBorder] = js.undefined
  
  var margin: js.UndefOr[Double | ChartPlotAreaMargin] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double | ChartPlotAreaPadding] = js.undefined
}
object ChartPlotArea {
  
  inline def apply(): ChartPlotArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotArea]
  }
  
  extension [Self <: ChartPlotArea](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: ChartPlotAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setMargin(value: Double | ChartPlotAreaMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPadding(value: Double | ChartPlotAreaPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
