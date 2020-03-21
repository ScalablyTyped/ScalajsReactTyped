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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFill extends js.Object {
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object CellPropertiesFill {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
  ): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFill]
  }
}

