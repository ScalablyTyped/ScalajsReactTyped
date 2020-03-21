package typingsJapgolly.bugsnagJs.clientMod

import typingsJapgolly.bugsnagJs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionPayload extends js.Object {
  var app: js.UndefOr[js.Object] = js.undefined
  var device: js.UndefOr[js.Object] = js.undefined
  var notifier: AnonName
  var sessions: js.Array[ISession]
  var user: js.UndefOr[js.Object] = js.undefined
}

object ISessionPayload {
  @scala.inline
  def apply(
    notifier: AnonName,
    sessions: js.Array[ISession],
    app: js.Object = null,
    device: js.Object = null,
    user: js.Object = null
  ): ISessionPayload = {
    val __obj = js.Dynamic.literal(notifier = notifier.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionPayload]
  }
}

