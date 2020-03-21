package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification shown to the user as a response to interacting with a UI element.
  *
  *     var action = CardService.newAction().setFunctionName("notificationCallback");
  *     CardService.newTextButton().setText('Save').setOnClickAction(action);
  *
  *     // ...
  *
  *     function notificationCallback() {
  *       return CardService.newActionResponseBuilder()
  *           .setNotification(CardService.newNotification()
  *               .setText("Some info to display to user"))
  *           .build();
  *     }
  */
trait Notification extends js.Object {
  def setText(text: String): Notification
}

object Notification {
  @scala.inline
  def apply(setText: String => CallbackTo[Notification]): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[Notification]
  }
}

