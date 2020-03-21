package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetStorageCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetStorageFailCallback] = js.undefined
  /** 本地缓存中指定的 key */
  var key: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetStorageSuccessCallback] = js.undefined
}

object GetStorageOption {
  @scala.inline
  def apply(
    key: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* result */ GetStorageSuccessCallbackResult => Callback = null
  ): GetStorageOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.GetStorageSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[GetStorageOption]
  }
}

