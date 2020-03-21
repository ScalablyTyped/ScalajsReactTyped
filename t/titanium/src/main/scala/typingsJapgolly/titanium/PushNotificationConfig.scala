package typingsJapgolly.titanium

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying push notification options to
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  */
trait PushNotificationConfig extends js.Object {
  /**
  	 * Callback function invoked upon receiving a new push notification.
  	 */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, _]] = js.undefined
  /**
  	 * Callback function called when an error occurs during registration.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, _]] = js.undefined
  /**
  	 * Callback function called when the push registration is successfully completed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, _]] = js.undefined
  /**
  	 * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
  	 */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object PushNotificationConfig {
  @scala.inline
  def apply(
    callback: /* param0 */ PushNotificationData => CallbackTo[js.Any] = null,
    error: /* param0 */ PushNotificationErrorArg => CallbackTo[js.Any] = null,
    success: /* param0 */ PushNotificationSuccessArg => CallbackTo[js.Any] = null,
    types: js.Array[Double] = null
  ): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.PushNotificationData) => callback(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.PushNotificationErrorArg) => error(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.PushNotificationSuccessArg) => success(t0).runNow()))
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationConfig]
  }
}

