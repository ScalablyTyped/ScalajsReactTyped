package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSocketMessageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 需要发送的内容
    */
  var data: js.UndefOr[String | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(
    complete: /* result */ GeneralCallbackResult => Callback = null,
    data: String | scala.scalajs.js.typedarray.ArrayBuffer = null,
    fail: /* result */ GeneralCallbackResult => Callback = null,
    success: /* result */ GeneralCallbackResult => Callback = null
  ): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => complete(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
}

