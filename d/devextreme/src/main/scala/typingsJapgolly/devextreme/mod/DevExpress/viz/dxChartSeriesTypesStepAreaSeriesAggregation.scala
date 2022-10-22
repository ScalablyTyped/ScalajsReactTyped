package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.mod.DevExpress.viz.dxChart.ChartSingleValueSeriesAggregationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStepAreaSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesStepAreaSeriesAggregation: js.UndefOr[ChartSingleValueSeriesAggregationMethod] = js.undefined
}
object dxChartSeriesTypesStepAreaSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesStepAreaSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesStepAreaSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ChartSingleValueSeriesAggregationMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
