package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that displays one or more "keys" around a text "value". The possible keys include an
  * icon, a label above and a label below. Setting the text content and one of the keys is required
  * using setContent(text) and one of setIcon(icon), setIconUrl(url), setTopLabel(text),
  * or setBottomLabel(text).
  *
  *     var imageKeyValue = CardService.newKeyValue()
  *         .setIconUrl("https://icon.png")
  *         .setContent("KeyValue widget with an image on the left and text on the right");
  *
  *     var textKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Text key")
  *         .setContent("KeyValue widget with text key on top and cotent below");
  *
  *     var multilineKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Top label - single line)")
  *         .setContent("Content can be multiple lines")
  *         .setMultiline(true)
  *         .setBottomLabel("Bottom label - single line");
  */
trait KeyValue extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): KeyValue
  def setBottomLabel(text: String): KeyValue
  def setButton(button: Button): KeyValue
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue
  def setContent(text: String): KeyValue
  def setIcon(icon: Icon): KeyValue
  def setIconAltText(altText: String): KeyValue
  def setIconUrl(url: String): KeyValue
  def setMultiline(multiline: Boolean): KeyValue
  def setOnClickAction(action: Action): KeyValue
  def setOnClickOpenLinkAction(action: Action): KeyValue
  def setOpenLink(openLink: OpenLink): KeyValue
  def setSwitch(switchToSet: Switch): KeyValue
  def setTopLabel(text: String): KeyValue
}

object KeyValue {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CallbackTo[KeyValue],
    setBottomLabel: String => CallbackTo[KeyValue],
    setButton: Button => CallbackTo[KeyValue],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[KeyValue],
    setContent: String => CallbackTo[KeyValue],
    setIcon: Icon => CallbackTo[KeyValue],
    setIconAltText: String => CallbackTo[KeyValue],
    setIconUrl: String => CallbackTo[KeyValue],
    setMultiline: Boolean => CallbackTo[KeyValue],
    setOnClickAction: Action => CallbackTo[KeyValue],
    setOnClickOpenLinkAction: Action => CallbackTo[KeyValue],
    setOpenLink: OpenLink => CallbackTo[KeyValue],
    setSwitch: Switch => CallbackTo[KeyValue],
    setTopLabel: String => CallbackTo[KeyValue]
  ): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setBottomLabel")(js.Any.fromFunction1((t0: java.lang.String) => setBottomLabel(t0).runNow()))
    __obj.updateDynamic("setButton")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Button) => setButton(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Icon) => setIcon(t0).runNow()))
    __obj.updateDynamic("setIconAltText")(js.Any.fromFunction1((t0: java.lang.String) => setIconAltText(t0).runNow()))
    __obj.updateDynamic("setIconUrl")(js.Any.fromFunction1((t0: java.lang.String) => setIconUrl(t0).runNow()))
    __obj.updateDynamic("setMultiline")(js.Any.fromFunction1((t0: scala.Boolean) => setMultiline(t0).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.updateDynamic("setSwitch")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Switch) => setSwitch(t0).runNow()))
    __obj.updateDynamic("setTopLabel")(js.Any.fromFunction1((t0: java.lang.String) => setTopLabel(t0).runNow()))
    __obj.asInstanceOf[KeyValue]
  }
}

