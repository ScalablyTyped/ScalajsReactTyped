package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.Checker
import typingsJapgolly.officeJs.officeJsStrings.CrissCross
import typingsJapgolly.officeJs.officeJsStrings.Down
import typingsJapgolly.officeJs.officeJsStrings.Gray16
import typingsJapgolly.officeJs.officeJsStrings.Gray25
import typingsJapgolly.officeJs.officeJsStrings.Gray50
import typingsJapgolly.officeJs.officeJsStrings.Gray75
import typingsJapgolly.officeJs.officeJsStrings.Gray8
import typingsJapgolly.officeJs.officeJsStrings.Grid
import typingsJapgolly.officeJs.officeJsStrings.Horizontal
import typingsJapgolly.officeJs.officeJsStrings.LightDown
import typingsJapgolly.officeJs.officeJsStrings.LightHorizontal
import typingsJapgolly.officeJs.officeJsStrings.LightUp
import typingsJapgolly.officeJs.officeJsStrings.LightVertical
import typingsJapgolly.officeJs.officeJsStrings.LinearGradient
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.RectangularGradient
import typingsJapgolly.officeJs.officeJsStrings.SemiGray75
import typingsJapgolly.officeJs.officeJsStrings.Solid
import typingsJapgolly.officeJs.officeJsStrings.Up
import typingsJapgolly.officeJs.officeJsStrings.Vertical
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

