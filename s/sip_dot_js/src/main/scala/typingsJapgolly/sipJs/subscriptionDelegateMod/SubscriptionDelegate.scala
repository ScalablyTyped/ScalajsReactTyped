package typingsJapgolly.sipJs.subscriptionDelegateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    * @param notification - A notification. See {@link Notification} for details.
    */
  def onNotify(notification: Notification): Unit
}

object SubscriptionDelegate {
  @scala.inline
  def apply(onNotify: Notification => Callback): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onNotify")(js.Any.fromFunction1((t0: typingsJapgolly.sipJs.notificationMod.Notification) => onNotify(t0).runNow()))
    __obj.asInstanceOf[SubscriptionDelegate]
  }
}

