package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text input information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newTextInput()
  *       .setId("info1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput
  def setHelpText(helpText: String): TextInput
  def setId(id: String): TextInput
  def setIsDynamic(isDynamic: Boolean): TextInput
  def setName(name: String): TextInput
  def setPlaceholder(placeholder: String): TextInput
}

object TextInput {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => CallbackTo[TextInput],
    setHelpText: String => CallbackTo[TextInput],
    setId: String => CallbackTo[TextInput],
    setIsDynamic: Boolean => CallbackTo[TextInput],
    setName: String => CallbackTo[TextInput],
    setPlaceholder: String => CallbackTo[TextInput]
  ): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAllowOverride")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowOverride(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsDynamic")(js.Any.fromFunction1((t0: scala.Boolean) => setIsDynamic(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setPlaceholder")(js.Any.fromFunction1((t0: java.lang.String) => setPlaceholder(t0).runNow()))
    __obj.asInstanceOf[TextInput]
  }
}

