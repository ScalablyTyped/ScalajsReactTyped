package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartMarkerStyle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Circle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Diamond
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Picture
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Plus
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Square
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Star
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Triangle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPoint.toJSON()`. */
trait ChartPointData extends StObject {
  
  /**
    * Returns the data label of a chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelData] = js.undefined
  
  /**
    * Encapsulates the format properties chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatData] = js.undefined
  
  /**
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representation of the marker background color of a data point (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * HTML color code representation of the marker foreground color of a data point (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Represents marker size of a data point.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents marker style of a chart data point. See `Excel.ChartMarkerStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  
  /**
    * Returns the value of a chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object ChartPointData {
  
  inline def apply(): ChartPointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointData]
  }
  
  extension [Self <: ChartPointData](x: Self) {
    
    inline def setDataLabel(value: ChartDataLabelData): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    inline def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    inline def setFormat(value: ChartPointFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHasDataLabel(value: Boolean): Self = StObject.set(x, "hasDataLabel", value.asInstanceOf[js.Any])
    
    inline def setHasDataLabelUndefined: Self = StObject.set(x, "hasDataLabel", js.undefined)
    
    inline def setMarkerBackgroundColor(value: String): Self = StObject.set(x, "markerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerBackgroundColorUndefined: Self = StObject.set(x, "markerBackgroundColor", js.undefined)
    
    inline def setMarkerForegroundColor(value: String): Self = StObject.set(x, "markerForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerForegroundColorUndefined: Self = StObject.set(x, "markerForegroundColor", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMarkerStyle(
      value: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
    ): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    inline def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
