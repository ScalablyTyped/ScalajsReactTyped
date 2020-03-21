package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains checkbox information for the config. Its properties determine how the checkbox is
  * displayed in Data Studio.
  *
  *     var checkbox = config.newCheckbox()
  *       .setId("use_https")
  *       .setName("Use Https?")
  *       .setHelpText("Whether or not https should be used.")
  *       .setAllowOverride(true);
  */
trait Checkbox extends js.Object {
  def setAllowOverride(allowOverride: Boolean): Checkbox
  def setHelpText(helpText: String): Checkbox
  def setId(id: String): Checkbox
  def setIsDynamic(isDynamic: Boolean): Checkbox
  def setName(name: String): Checkbox
}

object Checkbox {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => CallbackTo[Checkbox],
    setHelpText: String => CallbackTo[Checkbox],
    setId: String => CallbackTo[Checkbox],
    setIsDynamic: Boolean => CallbackTo[Checkbox],
    setName: String => CallbackTo[Checkbox]
  ): Checkbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAllowOverride")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowOverride(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsDynamic")(js.Any.fromFunction1((t0: scala.Boolean) => setIsDynamic(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[Checkbox]
  }
}

