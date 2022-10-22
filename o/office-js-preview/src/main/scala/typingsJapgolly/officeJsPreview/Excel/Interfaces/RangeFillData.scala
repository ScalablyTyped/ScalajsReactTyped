package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.FillPattern
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Checker
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CrissCross
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Down
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Gray16
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Gray25
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Gray50
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Gray75
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Gray8
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Grid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Horizontal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LightDown
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LightHorizontal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LightUp
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LightVertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LinearGradient
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RectangularGradient
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SemiGray75
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Solid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Up
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeFill.toJSON()`. */
trait RangeFillData extends StObject {
  
  /**
    * HTML color code representing the color of the background, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange")
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The pattern of a range. See `Excel.FillPattern` for details. LinearGradient and RectangularGradient are not supported.
    A `null` value indicates that the entire range doesn't have a uniform pattern setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  
  /**
    * The HTML color code representing the color of the range pattern, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a double that lightens or darkens a pattern color for the range fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the range doesn't have uniform `patternTintAndShade` settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a double that lightens or darkens a color for the range fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the range doesn't have uniform `tintAndShade` settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}
object RangeFillData {
  
  inline def apply(): RangeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFillData]
  }
  
  extension [Self <: RangeFillData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: String): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    inline def setPatternTintAndShade(value: Double): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    inline def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}
