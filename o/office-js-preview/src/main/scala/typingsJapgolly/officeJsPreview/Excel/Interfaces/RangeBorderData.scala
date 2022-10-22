package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.BorderIndex
import typingsJapgolly.officeJsPreview.Excel.BorderLineStyle
import typingsJapgolly.officeJsPreview.Excel.BorderWeight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Hairline
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Medium
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SlantDashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Thick
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Thin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeBorder.toJSON()`. */
trait RangeBorderData extends StObject {
  
  /**
    * HTML color code representing the color of the border line, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Constant value that indicates the specific side of the border. See `Excel.BorderIndex` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ] = js.undefined
  
  /**
    * One of the constants of line style specifying the line style for the border. See `Excel.BorderLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.undefined
  
  /**
    * Specifies a double that lightens or darkens a color for the range border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the border doesn't have a uniform `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Specifies the weight of the border around a range. See `Excel.BorderWeight` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.undefined
}
object RangeBorderData {
  
  inline def apply(): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderData]
  }
  
  extension [Self <: RangeBorderData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSideIndex(
      value: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
    ): Self = StObject.set(x, "sideIndex", value.asInstanceOf[js.Any])
    
    inline def setSideIndexUndefined: Self = StObject.set(x, "sideIndex", js.undefined)
    
    inline def setStyle(
      value: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintAndShade(value: scala.Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setWeight(value: BorderWeight | Hairline | Thin | Medium | Thick): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
