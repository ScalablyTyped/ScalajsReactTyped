package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text area information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  * Usage:
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var textArea1 = config.newTextArea()
  *       .setId("textArea1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextArea
  def setHelpText(helpText: String): TextArea
  def setId(id: String): TextArea
  def setIsDynamic(isDynamic: Boolean): TextArea
  def setName(name: String): TextArea
  def setPlaceholder(placeholder: String): TextArea
}

object TextArea {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => CallbackTo[TextArea],
    setHelpText: String => CallbackTo[TextArea],
    setId: String => CallbackTo[TextArea],
    setIsDynamic: Boolean => CallbackTo[TextArea],
    setName: String => CallbackTo[TextArea],
    setPlaceholder: String => CallbackTo[TextArea]
  ): TextArea = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAllowOverride")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowOverride(t0).runNow()))
    __obj.updateDynamic("setHelpText")(js.Any.fromFunction1((t0: java.lang.String) => setHelpText(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsDynamic")(js.Any.fromFunction1((t0: scala.Boolean) => setIsDynamic(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setPlaceholder")(js.Any.fromFunction1((t0: java.lang.String) => setPlaceholder(t0).runNow()))
    __obj.asInstanceOf[TextArea]
  }
}

