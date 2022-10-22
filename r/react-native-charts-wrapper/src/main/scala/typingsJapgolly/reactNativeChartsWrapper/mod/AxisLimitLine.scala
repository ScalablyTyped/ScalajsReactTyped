package typingsJapgolly.reactNativeChartsWrapper.mod

import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_BOTTOM
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TOP
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_BOTTOM
import typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLimitLine extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelPosition: js.UndefOr[LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM] = js.undefined
  
  var limit: Double
  
  var lineColor: js.UndefOr[Color] = js.undefined
  
  var lineDashLengths: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var valueFont: js.UndefOr[String] = js.undefined
  
  var valueTextColor: js.UndefOr[Color] = js.undefined
}
object AxisLimitLine {
  
  inline def apply(limit: Double): AxisLimitLine = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLimitLine]
  }
  
  extension [Self <: AxisLimitLine](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelPosition(value: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLineColor(value: Color): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineDashLengths(value: js.Array[Double]): Self = StObject.set(x, "lineDashLengths", value.asInstanceOf[js.Any])
    
    inline def setLineDashLengthsUndefined: Self = StObject.set(x, "lineDashLengths", js.undefined)
    
    inline def setLineDashLengthsVarargs(value: Double*): Self = StObject.set(x, "lineDashLengths", js.Array(value*))
    
    inline def setLineDashPhase(value: Double): Self = StObject.set(x, "lineDashPhase", value.asInstanceOf[js.Any])
    
    inline def setLineDashPhaseUndefined: Self = StObject.set(x, "lineDashPhase", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setValueFont(value: String): Self = StObject.set(x, "valueFont", value.asInstanceOf[js.Any])
    
    inline def setValueFontUndefined: Self = StObject.set(x, "valueFont", js.undefined)
    
    inline def setValueTextColor(value: Color): Self = StObject.set(x, "valueTextColor", value.asInstanceOf[js.Any])
    
    inline def setValueTextColorUndefined: Self = StObject.set(x, "valueTextColor", js.undefined)
  }
}
