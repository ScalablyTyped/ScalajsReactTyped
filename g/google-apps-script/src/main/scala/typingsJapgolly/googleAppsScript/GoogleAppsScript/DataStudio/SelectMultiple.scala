package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains select multiple information for the config. Its properties determine how the select
  * multiple is displayed in Data Studio.
  *
  * Usage:
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectMultiple()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait SelectMultiple extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectMultiple
  def setAllowOverride(allowOverride: Boolean): SelectMultiple
  def setHelpText(helpText: String): SelectMultiple
  def setId(id: String): SelectMultiple
  def setIsDynamic(isDynamic: Boolean): SelectMultiple
  def setName(name: String): SelectMultiple
}

object SelectMultiple {
  @scala.inline
  def apply(
    addOption: OptionBuilder => CallbackTo[SelectMultiple],
    setAllowOverride: Boolean => CallbackTo[SelectMultiple],
    setHelpText: String => CallbackTo[SelectMultiple],
    setId: String => CallbackTo[SelectMultiple],
    setIsDynamic: Boolean => CallbackTo[SelectMultiple],
    setName: String => CallbackTo[SelectMultiple]
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOption")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.OptionBuilder) => addOption(t0).runNow()))
    __obj.updateDynamic("setAllowOverride")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowOverride(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsDynamic")(js.Any.fromFunction1((t0: scala.Boolean) => setIsDynamic(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[SelectMultiple]
  }
}

