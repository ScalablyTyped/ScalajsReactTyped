package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for creating options for SelectSingles and SelectMultiples.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
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
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait OptionBuilder extends js.Object {
  def setLabel(label: String): OptionBuilder
  def setValue(value: String): OptionBuilder
}

object OptionBuilder {
  @scala.inline
  def apply(setLabel: String => CallbackTo[OptionBuilder], setValue: String => CallbackTo[OptionBuilder]): OptionBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[OptionBuilder]
  }
}

