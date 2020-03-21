package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a theme color.
  */
trait ThemeColor extends js.Object {
  def getColorType(): ColorType
  def getThemeColorType(): ThemeColorType
}

object ThemeColor {
  @scala.inline
  def apply(getColorType: CallbackTo[ColorType], getThemeColorType: CallbackTo[ThemeColorType]): ThemeColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColorType")(getColorType.toJsFn)
    __obj.updateDynamic("getThemeColorType")(getThemeColorType.toJsFn)
    __obj.asInstanceOf[ThemeColor]
  }
}

