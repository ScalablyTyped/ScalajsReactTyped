package typingsJapgolly.officeJsPreview.Excel

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

/**
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFill extends StObject {
  
  /**
    * Represents the `format.fill.color` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the `format.fill.pattern` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  
  /**
    * Represents the `format.fill.patternColor` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the `format.fill.tintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}
object CellPropertiesFill {
  
  inline def apply(): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFill]
  }
  
  extension [Self <: CellPropertiesFill](x: Self) {
    
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
