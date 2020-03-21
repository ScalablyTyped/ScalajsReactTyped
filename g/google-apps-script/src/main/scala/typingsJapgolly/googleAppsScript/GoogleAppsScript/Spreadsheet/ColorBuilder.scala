package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
trait ColorBuilder extends js.Object {
  def asRgbColor(): RgbColor
  def asThemeColor(): ThemeColor
  def build(): Color
  def getColorType(): ColorType
  def setRgbColor(cssString: String): ColorBuilder
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder
}

object ColorBuilder {
  @scala.inline
  def apply(
    asRgbColor: CallbackTo[RgbColor],
    asThemeColor: CallbackTo[ThemeColor],
    build: CallbackTo[Color],
    getColorType: CallbackTo[ColorType],
    setRgbColor: String => CallbackTo[ColorBuilder],
    setThemeColor: ThemeColorType => CallbackTo[ColorBuilder]
  ): ColorBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asRgbColor")(asRgbColor.toJsFn)
    __obj.updateDynamic("asThemeColor")(asThemeColor.toJsFn)
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("getColorType")(getColorType.toJsFn)
    __obj.updateDynamic("setRgbColor")(js.Any.fromFunction1((t0: java.lang.String) => setRgbColor(t0).runNow()))
    __obj.updateDynamic("setThemeColor")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType) => setThemeColor(t0).runNow()))
    __obj.asInstanceOf[ColorBuilder]
  }
}

