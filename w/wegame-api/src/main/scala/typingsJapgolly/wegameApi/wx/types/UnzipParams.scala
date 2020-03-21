package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnzipParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  var targetPath: String
  var zipFilePath: String
}

object UnzipParams {
  @scala.inline
  def apply(
    targetPath: String,
    zipFilePath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: js.UndefOr[Callback] = js.undefined
  ): UnzipParams = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[UnzipParams]
  }
}

