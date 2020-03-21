package typingsJapgolly.titanium

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying token retrieval options to [retrieveDeviceToken](Modules.CloudPush.retrieveDeviceToken).
  */
trait CloudPushNotificationConfig extends js.Object {
  /**
  	 * Callback function called when an error occurs during registration.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ CloudPushNotificationErrorArg, _]] = js.undefined
  /**
  	 * Callback function called when the push registration is successfully completed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CloudPushNotificationSuccessArg, _]] = js.undefined
}

object CloudPushNotificationConfig {
  @scala.inline
  def apply(
    error: /* param0 */ CloudPushNotificationErrorArg => CallbackTo[js.Any] = null,
    success: /* param0 */ CloudPushNotificationSuccessArg => CallbackTo[js.Any] = null
  ): CloudPushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.CloudPushNotificationErrorArg) => error(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.CloudPushNotificationSuccessArg) => success(t0).runNow()))
    __obj.asInstanceOf[CloudPushNotificationConfig]
  }
}

