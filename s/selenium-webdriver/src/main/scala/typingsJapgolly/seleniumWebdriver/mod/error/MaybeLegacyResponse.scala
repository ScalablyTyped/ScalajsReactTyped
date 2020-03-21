package typingsJapgolly.seleniumWebdriver.mod.error

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.seleniumWebdriver.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeLegacyResponse extends js.Object {
  var getAlertText: js.UndefOr[js.Function0[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[AnonMessage] = js.undefined
}

object MaybeLegacyResponse {
  @scala.inline
  def apply(
    getAlertText: js.UndefOr[CallbackTo[String]] = js.undefined,
    message: String = null,
    status: Int | Double = null,
    value: AnonMessage = null
  ): MaybeLegacyResponse = {
    val __obj = js.Dynamic.literal()
    getAlertText.foreach(p => __obj.updateDynamic("getAlertText")(p.toJsFn))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeLegacyResponse]
  }
}

