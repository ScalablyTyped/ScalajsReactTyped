package typingsJapgolly.reactNativePushNotification.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativePushNotification.AnonOs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.undefined
  var onRegister: js.UndefOr[js.Function1[/* token */ AnonOs, Unit]] = js.undefined
  var permissions: js.UndefOr[PushNotificationPermissions] = js.undefined
  var popInitialNotification: js.UndefOr[Boolean] = js.undefined
  var requestPermissions: js.UndefOr[Boolean] = js.undefined
  var senderID: js.UndefOr[String] = js.undefined
}

object PushNotificationOptions {
  @scala.inline
  def apply(
    onNotification: /* notification */ PushNotification => Callback = null,
    onRegister: /* token */ AnonOs => Callback = null,
    permissions: PushNotificationPermissions = null,
    popInitialNotification: js.UndefOr[Boolean] = js.undefined,
    requestPermissions: js.UndefOr[Boolean] = js.undefined,
    senderID: String = null
  ): PushNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (onNotification != null) __obj.updateDynamic("onNotification")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.reactNativePushNotification.mod.PushNotification) => onNotification(t0).runNow()))
    if (onRegister != null) __obj.updateDynamic("onRegister")(js.Any.fromFunction1((t0: /* token */ typingsJapgolly.reactNativePushNotification.AnonOs) => onRegister(t0).runNow()))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (!js.isUndefined(popInitialNotification)) __obj.updateDynamic("popInitialNotification")(popInitialNotification.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPermissions)) __obj.updateDynamic("requestPermissions")(requestPermissions.asInstanceOf[js.Any])
    if (senderID != null) __obj.updateDynamic("senderID")(senderID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationOptions]
  }
}

