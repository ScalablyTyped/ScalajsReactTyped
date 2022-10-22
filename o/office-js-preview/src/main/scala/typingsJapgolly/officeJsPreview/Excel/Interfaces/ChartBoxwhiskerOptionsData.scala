package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartBoxQuartileCalculation
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Exclusive
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartBoxwhiskerOptions.toJSON()`. */
trait ChartBoxwhiskerOptionsData extends StObject {
  
  /**
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.undefined
  
  /**
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}
object ChartBoxwhiskerOptionsData {
  
  inline def apply(): ChartBoxwhiskerOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsData]
  }
  
  extension [Self <: ChartBoxwhiskerOptionsData](x: Self) {
    
    inline def setQuartileCalculation(value: ChartBoxQuartileCalculation | Inclusive | Exclusive): Self = StObject.set(x, "quartileCalculation", value.asInstanceOf[js.Any])
    
    inline def setQuartileCalculationUndefined: Self = StObject.set(x, "quartileCalculation", js.undefined)
    
    inline def setShowInnerPoints(value: Boolean): Self = StObject.set(x, "showInnerPoints", value.asInstanceOf[js.Any])
    
    inline def setShowInnerPointsUndefined: Self = StObject.set(x, "showInnerPoints", js.undefined)
    
    inline def setShowMeanLine(value: Boolean): Self = StObject.set(x, "showMeanLine", value.asInstanceOf[js.Any])
    
    inline def setShowMeanLineUndefined: Self = StObject.set(x, "showMeanLine", js.undefined)
    
    inline def setShowMeanMarker(value: Boolean): Self = StObject.set(x, "showMeanMarker", value.asInstanceOf[js.Any])
    
    inline def setShowMeanMarkerUndefined: Self = StObject.set(x, "showMeanMarker", js.undefined)
    
    inline def setShowOutlierPoints(value: Boolean): Self = StObject.set(x, "showOutlierPoints", value.asInstanceOf[js.Any])
    
    inline def setShowOutlierPointsUndefined: Self = StObject.set(x, "showOutlierPoints", js.undefined)
  }
}
