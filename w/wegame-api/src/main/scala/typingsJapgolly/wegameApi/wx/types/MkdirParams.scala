package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dirPath: String
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object MkdirParams {
  @scala.inline
  def apply(
    dirPath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): MkdirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[MkdirParams]
  }
}

