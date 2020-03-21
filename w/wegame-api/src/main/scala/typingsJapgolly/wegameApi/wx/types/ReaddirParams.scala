package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonErrMsg
import typingsJapgolly.wegameApi.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dirPath: String
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonFiles, Unit]] = js.undefined
}

object ReaddirParams {
  @scala.inline
  def apply(
    dirPath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: /* res */ AnonFiles => Callback = null
  ): ReaddirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonFiles) => success(t0).runNow()))
    __obj.asInstanceOf[ReaddirParams]
  }
}

