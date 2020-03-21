package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonEncryptedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: String
  @JSName("success")
  def success_MGetShareInfoOptions(res: AnonEncryptedData): Unit
}

object GetShareInfoOptions {
  @scala.inline
  def apply(
    shareTicket: String,
    success: AnonEncryptedData => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.weixinApp.AnonEncryptedData) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
}

