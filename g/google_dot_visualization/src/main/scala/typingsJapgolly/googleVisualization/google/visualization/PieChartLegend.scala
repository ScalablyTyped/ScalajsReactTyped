package typingsJapgolly.googleVisualization.google.visualization

import typingsJapgolly.googleVisualization.googleVisualizationStrings.bottom
import typingsJapgolly.googleVisualization.googleVisualizationStrings.labeled
import typingsJapgolly.googleVisualization.googleVisualizationStrings.left
import typingsJapgolly.googleVisualization.googleVisualizationStrings.none
import typingsJapgolly.googleVisualization.googleVisualizationStrings.right
import typingsJapgolly.googleVisualization.googleVisualizationStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartLegend extends StObject {
  
  var alignment: js.UndefOr[ChartLegendAlignment] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var numberFormat: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[bottom | labeled | left | none | right | top] = js.undefined
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
}
object PieChartLegend {
  
  inline def apply(): PieChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartLegend]
  }
  
  extension [Self <: PieChartLegend](x: Self) {
    
    inline def setAlignment(value: ChartLegendAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(value: bottom | labeled | left | none | right | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
