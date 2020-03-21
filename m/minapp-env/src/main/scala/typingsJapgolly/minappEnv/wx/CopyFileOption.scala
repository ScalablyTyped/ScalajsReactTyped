package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CopyFileCompleteCallback] = js.undefined
  /** 目标文件路径 */
  var destPath: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CopyFileFailCallback] = js.undefined
  /** 源文件路径，只可以是普通文件 */
  var srcPath: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CopyFileSuccessCallback] = js.undefined
}

object CopyFileOption {
  @scala.inline
  def apply(
    destPath: String,
    srcPath: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ CopyFileFailCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): CopyFileOption = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.CopyFileFailCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[CopyFileOption]
  }
}

