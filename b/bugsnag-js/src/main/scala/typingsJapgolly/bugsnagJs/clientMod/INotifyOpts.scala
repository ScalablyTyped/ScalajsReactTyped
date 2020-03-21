package typingsJapgolly.bugsnagJs.clientMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bugsnagJs.bugsnagJsStrings.error
import typingsJapgolly.bugsnagJs.bugsnagJsStrings.info
import typingsJapgolly.bugsnagJs.bugsnagJsStrings.warning
import typingsJapgolly.bugsnagJs.commonMod.BeforeSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyOpts extends js.Object {
  var beforeSend: js.UndefOr[BeforeSend] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[js.Object] = js.undefined
  var metaData: js.UndefOr[js.Object] = js.undefined
  var request: js.UndefOr[js.Object] = js.undefined
  var severity: js.UndefOr[info | warning | error] = js.undefined
  var user: js.UndefOr[js.Object] = js.undefined
}

object INotifyOpts {
  @scala.inline
  def apply(
    beforeSend: /* report */ typingsJapgolly.bugsnagJs.reportMod.default => CallbackTo[Boolean | Unit] = null,
    context: String = null,
    device: js.Object = null,
    metaData: js.Object = null,
    request: js.Object = null,
    severity: info | warning | error = null,
    user: js.Object = null
  ): INotifyOpts = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1((t0: /* report */ typingsJapgolly.bugsnagJs.reportMod.default) => beforeSend(t0).runNow()))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyOpts]
  }
}

