package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.FillPattern
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

/** An interface for updating data on the RangeFill object, for use in `rangeFill.set({ ... })`. */
trait RangeFillUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object RangeFillUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
  ): RangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFillUpdateData]
  }
}

