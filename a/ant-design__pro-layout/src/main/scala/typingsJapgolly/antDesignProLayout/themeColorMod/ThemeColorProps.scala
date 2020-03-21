package typingsJapgolly.antDesignProLayout.themeColorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antDesignProLayout.AnonColor
import typingsJapgolly.antDesignProLayout.AnonDefaultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorProps extends js.Object {
  var colors: js.UndefOr[js.Array[AnonColor]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: String
  def formatMessage(data: AnonDefaultMessage): String
  def onChange(color: String): Unit
}

object ThemeColorProps {
  @scala.inline
  def apply(
    formatMessage: AnonDefaultMessage => CallbackTo[String],
    onChange: String => Callback,
    value: String,
    colors: js.Array[AnonColor] = null,
    title: String = null
  ): ThemeColorProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: typingsJapgolly.antDesignProLayout.AnonDefaultMessage) => formatMessage(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorProps]
  }
}

