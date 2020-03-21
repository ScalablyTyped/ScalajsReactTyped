package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.Anon0
import typingsJapgolly.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function1[/* res */ Anon0, Unit]] = js.undefined
}

object ReadfileParams {
  @scala.inline
  def apply(
    filePath: String,
    complete: js.UndefOr[Callback] = js.undefined,
    encoding: FileContentEncoding = null,
    fail: /* res */ AnonErrMsg => Callback = null,
    success: /* res */ Anon0 => Callback = null
  ): ReadfileParams = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.Anon0) => success(t0).runNow()))
    __obj.asInstanceOf[ReadfileParams]
  }
}

