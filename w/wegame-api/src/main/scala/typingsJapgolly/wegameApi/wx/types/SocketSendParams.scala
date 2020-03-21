package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketSendParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SocketSendParams {
  @scala.inline
  def apply(
    data: String | scala.scalajs.js.typedarray.ArrayBuffer,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): SocketSendParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SocketSendParams]
  }
}

