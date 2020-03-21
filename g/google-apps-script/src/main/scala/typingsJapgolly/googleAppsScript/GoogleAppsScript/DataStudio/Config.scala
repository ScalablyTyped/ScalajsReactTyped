package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
trait Config extends js.Object {
  def build(): Config
  def newCheckbox(): Checkbox
  def newInfo(): Info
  def newOptionBuilder(): OptionBuilder
  def newSelectMultiple(): SelectMultiple
  def newSelectSingle(): SelectSingle
  def newTextArea(): TextArea
  def newTextInput(): TextInput
  def printJson(): String
  def setDateRangeRequired(dateRangeRequired: Boolean): Config
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config
}

object Config {
  @scala.inline
  def apply(
    build: CallbackTo[Config],
    newCheckbox: CallbackTo[Checkbox],
    newInfo: CallbackTo[Info],
    newOptionBuilder: CallbackTo[OptionBuilder],
    newSelectMultiple: CallbackTo[SelectMultiple],
    newSelectSingle: CallbackTo[SelectSingle],
    newTextArea: CallbackTo[TextArea],
    newTextInput: CallbackTo[TextInput],
    printJson: CallbackTo[String],
    setDateRangeRequired: Boolean => CallbackTo[Config],
    setIsSteppedConfig: Boolean => CallbackTo[Config]
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("newCheckbox")(newCheckbox.toJsFn)
    __obj.updateDynamic("newInfo")(newInfo.toJsFn)
    __obj.updateDynamic("newOptionBuilder")(newOptionBuilder.toJsFn)
    __obj.updateDynamic("newSelectMultiple")(newSelectMultiple.toJsFn)
    __obj.updateDynamic("newSelectSingle")(newSelectSingle.toJsFn)
    __obj.updateDynamic("newTextArea")(newTextArea.toJsFn)
    __obj.updateDynamic("newTextInput")(newTextInput.toJsFn)
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setDateRangeRequired")(js.Any.fromFunction1((t0: scala.Boolean) => setDateRangeRequired(t0).runNow()))
    __obj.updateDynamic("setIsSteppedConfig")(js.Any.fromFunction1((t0: scala.Boolean) => setIsSteppedConfig(t0).runNow()))
    __obj.asInstanceOf[Config]
  }
}

