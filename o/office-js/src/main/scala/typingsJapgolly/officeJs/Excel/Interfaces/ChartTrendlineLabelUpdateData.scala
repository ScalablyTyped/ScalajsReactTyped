package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartTextHorizontalAlignment
import typingsJapgolly.officeJs.Excel.ChartTextVerticalAlignment
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendlineLabel object, for use in `chartTrendlineLabel.set({ ... })`. */
trait ChartTrendlineLabelUpdateData extends StObject {
  
  /**
    * Specifies if the trendline label automatically generates appropriate text based on context.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The format of the chart trendline label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartTrendlineLabelFormatUpdateData] = js.undefined
  
  /**
    * String value that represents the formula of the chart trendline label using A1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the horizontal alignment of the chart trendline label. See `Excel.ChartTextHorizontalAlignment` for details.
    This property is valid only when `TextOrientation` of a trendline label is -90, 90, or 180.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  
  /**
    * Represents the distance, in points, from the left edge of the chart trendline label to the left edge of the chart area. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String value that represents the format code for the trendline label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    * String representing the text of the trendline label on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the angle to which the text is oriented for the chart trendline label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the distance, in points, from the top edge of the chart trendline label to the top of the chart area. Value is `null` if the chart trendline label is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the vertical alignment of the chart trendline label. See `Excel.ChartTextVerticalAlignment` for details.
    This property is valid only when `TextOrientation` of a trendline label is 0.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
}
object ChartTrendlineLabelUpdateData {
  
  inline def apply(): ChartTrendlineLabelUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLabelUpdateData]
  }
  
  extension [Self <: ChartTrendlineLabelUpdateData](x: Self) {
    
    inline def setAutoText(value: Boolean): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setFormat(value: ChartTrendlineLabelFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
