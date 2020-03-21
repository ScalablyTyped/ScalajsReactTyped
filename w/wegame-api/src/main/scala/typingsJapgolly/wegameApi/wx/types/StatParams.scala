package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonErrMsg
import typingsJapgolly.wegameApi.AnonStat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var path: String
  var success: js.UndefOr[js.Function1[/* res */ AnonStat, Unit]] = js.undefined
}

object StatParams {
  @scala.inline
  def apply(
    path: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: /* res */ AnonStat => Callback = null
  ): StatParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonStat) => success(t0).runNow()))
    __obj.asInstanceOf[StatParams]
  }
}

