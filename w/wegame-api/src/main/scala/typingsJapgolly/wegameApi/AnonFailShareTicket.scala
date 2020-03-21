package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shareTicket: String
  var success: js.UndefOr[js.Function1[/* res */ AnonEncryptedDataErrMsg, Unit]] = js.undefined
}

object AnonFailShareTicket {
  @scala.inline
  def apply(
    shareTicket: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonEncryptedDataErrMsg => Callback = null
  ): AnonFailShareTicket = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonEncryptedDataErrMsg) => success(t0).runNow()))
    __obj.asInstanceOf[AnonFailShareTicket]
  }
}

