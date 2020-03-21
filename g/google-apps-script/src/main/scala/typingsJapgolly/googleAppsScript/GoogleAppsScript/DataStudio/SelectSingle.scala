package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains select single information for the config. Its properties determine how the select single
  * is displayed in Data Studio.
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectSingle()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle
  def setAllowOverride(allowOverride: Boolean): SelectSingle
  def setHelpText(helpText: String): SelectSingle
  def setId(id: String): SelectSingle
  def setIsDynamic(isDynamic: Boolean): SelectSingle
  def setName(name: String): SelectSingle
}

object SelectSingle {
  @scala.inline
  def apply(
    addOption: OptionBuilder => CallbackTo[SelectSingle],
    setAllowOverride: Boolean => CallbackTo[SelectSingle],
    setHelpText: String => CallbackTo[SelectSingle],
    setId: String => CallbackTo[SelectSingle],
    setIsDynamic: Boolean => CallbackTo[SelectSingle],
    setName: String => CallbackTo[SelectSingle]
  ): SelectSingle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOption")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.OptionBuilder) => addOption(t0).runNow()))
    __obj.updateDynamic("setAllowOverride")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowOverride(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsDynamic")(js.Any.fromFunction1((t0: scala.Boolean) => setIsDynamic(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.asInstanceOf[SelectSingle]
  }
}

