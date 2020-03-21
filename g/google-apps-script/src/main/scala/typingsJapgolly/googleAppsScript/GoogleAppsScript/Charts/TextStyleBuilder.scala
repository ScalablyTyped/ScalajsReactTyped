package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder used to create TextStyle objects. It allows configuration of the text's
  * properties such as name, color, and size.
  *
  * The following example shows how to create a text style using the builder. For a more complete
  * example, refer to the documentation for TextStyle.
  *
  *     // Creates a new text style that uses 26-point, blue, Ariel font.
  *     var textStyleBuilder = Charts.newTextStyle()
  *         .setColor('#0000FF').setFontName('Ariel').setFontSize(26);
  *     var style = textStyleBuilder.build();
  */
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setColor(cssValue: String): TextStyleBuilder
  def setFontName(fontName: String): TextStyleBuilder
  def setFontSize(fontSize: Double): TextStyleBuilder
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[TextStyle],
    setColor: String => CallbackTo[TextStyleBuilder],
    setFontName: String => CallbackTo[TextStyleBuilder],
    setFontSize: Double => CallbackTo[TextStyleBuilder]
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: java.lang.String) => setColor(t0).runNow()))
    __obj.updateDynamic("setFontName")(js.Any.fromFunction1((t0: java.lang.String) => setFontName(t0).runNow()))
    __obj.updateDynamic("setFontSize")(js.Any.fromFunction1((t0: scala.Double) => setFontSize(t0).runNow()))
    __obj.asInstanceOf[TextStyleBuilder]
  }
}

