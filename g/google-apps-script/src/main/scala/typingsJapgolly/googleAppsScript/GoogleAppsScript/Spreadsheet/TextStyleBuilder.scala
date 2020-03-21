package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for text styles.
  */
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setBold(bold: Boolean): TextStyleBuilder
  def setFontFamily(fontFamily: String): TextStyleBuilder
  def setFontSize(fontSize: Integer): TextStyleBuilder
  def setForegroundColor(cssString: String): TextStyleBuilder
  def setItalic(italic: Boolean): TextStyleBuilder
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder
  def setUnderline(underline: Boolean): TextStyleBuilder
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[TextStyle],
    setBold: Boolean => CallbackTo[TextStyleBuilder],
    setFontFamily: String => CallbackTo[TextStyleBuilder],
    setFontSize: Integer => CallbackTo[TextStyleBuilder],
    setForegroundColor: String => CallbackTo[TextStyleBuilder],
    setItalic: Boolean => CallbackTo[TextStyleBuilder],
    setStrikethrough: Boolean => CallbackTo[TextStyleBuilder],
    setUnderline: Boolean => CallbackTo[TextStyleBuilder]
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setBold")(js.Any.fromFunction1((t0: scala.Boolean) => setBold(t0).runNow()))
    __obj.updateDynamic("setFontFamily")(js.Any.fromFunction1((t0: java.lang.String) => setFontFamily(t0).runNow()))
    __obj.updateDynamic("setFontSize")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setFontSize(t0).runNow()))
    __obj.updateDynamic("setForegroundColor")(js.Any.fromFunction1((t0: java.lang.String) => setForegroundColor(t0).runNow()))
    __obj.updateDynamic("setItalic")(js.Any.fromFunction1((t0: scala.Boolean) => setItalic(t0).runNow()))
    __obj.updateDynamic("setStrikethrough")(js.Any.fromFunction1((t0: scala.Boolean) => setStrikethrough(t0).runNow()))
    __obj.updateDynamic("setUnderline")(js.Any.fromFunction1((t0: scala.Boolean) => setUnderline(t0).runNow()))
    __obj.asInstanceOf[TextStyleBuilder]
  }
}

