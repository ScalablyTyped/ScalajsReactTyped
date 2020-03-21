package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var destPath: String
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var srcPath: String
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CopyfileParams {
  @scala.inline
  def apply(
    destPath: String,
    srcPath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: js.UndefOr[Callback] = js.undefined
  ): CopyfileParams = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[CopyfileParams]
  }
}

