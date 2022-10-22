package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.TooltipModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltip[TType /* <: ChartType */] extends StObject {
  
  var chart: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any]
  
  var tooltip: TooltipModel[TType]
}
object ChartTooltip {
  
  inline def apply[TType /* <: ChartType */](
    chart: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any],
    tooltip: TooltipModel[TType]
  ): ChartTooltip[TType] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltip[TType]]
  }
  
  extension [Self <: ChartTooltip[?], TType /* <: ChartType */](x: Self & ChartTooltip[TType]) {
    
    inline def setChart(
      value: typingsJapgolly.chartJs.mod.Chart[ChartType, typingsJapgolly.chartJs.mod.DefaultDataPoint[ChartType], Any]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: TooltipModel[TType]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
