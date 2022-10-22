package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.allArgumentPoints
import typingsJapgolly.devextreme.devextremeStrings.allSeriesPoints
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.onlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesRangeBarSeries
  extends StObject
     with dxChartSeriesTypesCommonSeries {
  
  /**
    * Configures data aggregation for the series.
    */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesAggregation] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  
  /**
    * Configures point labels.
    */
  @JSName("label")
  var label_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesLabel] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a range bar.
    */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
}
object dxChartSeriesTypesRangeBarSeries {
  
  inline def apply(): dxChartSeriesTypesRangeBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeBarSeries]
  }
  
  extension [Self <: dxChartSeriesTypesRangeBarSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesRangeBarSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesRangeBarSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
