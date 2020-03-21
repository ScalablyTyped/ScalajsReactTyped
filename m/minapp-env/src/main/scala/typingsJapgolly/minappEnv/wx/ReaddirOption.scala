package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReaddirCompleteCallback] = js.undefined
  /** 要读取的目录路径 */
  var dirPath: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ReaddirFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReaddirSuccessCallback] = js.undefined
}

object ReaddirOption {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ ReaddirFailCallbackResult => Callback = null,
    success: /* result */ ReaddirSuccessCallbackResult => Callback = null
  ): ReaddirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.ReaddirFailCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.ReaddirSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[ReaddirOption]
  }
}

