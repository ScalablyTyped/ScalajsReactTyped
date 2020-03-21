package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonDigest
import typingsJapgolly.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileinfoParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function1[/* res */ AnonDigest, Unit]] = js.undefined
}

object FileinfoParams {
  @scala.inline
  def apply(
    filePath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: /* res */ AnonDigest => Callback = null
  ): FileinfoParams = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonDigest) => success(t0).runNow()))
    __obj.asInstanceOf[FileinfoParams]
  }
}

