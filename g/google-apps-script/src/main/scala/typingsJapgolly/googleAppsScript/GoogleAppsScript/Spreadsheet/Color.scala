package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a color.
  */
trait Color extends js.Object {
  def asRgbColor(): RgbColor
  def asThemeColor(): ThemeColor
  def getColorType(): ColorType
}

object Color {
  @scala.inline
  def apply(
    asRgbColor: CallbackTo[RgbColor],
    asThemeColor: CallbackTo[ThemeColor],
    getColorType: CallbackTo[ColorType]
  ): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asRgbColor")(asRgbColor.toJsFn)
    __obj.updateDynamic("asThemeColor")(asThemeColor.toJsFn)
    __obj.updateDynamic("getColorType")(getColorType.toJsFn)
    __obj.asInstanceOf[Color]
  }
}

