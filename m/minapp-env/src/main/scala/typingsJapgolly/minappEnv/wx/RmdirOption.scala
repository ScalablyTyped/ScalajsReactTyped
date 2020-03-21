package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmdirOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RmdirCompleteCallback] = js.undefined
  /** 要删除的目录路径 */
  var dirPath: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RmdirFailCallback] = js.undefined
  /** 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    *
    * 最低基础库： `2.3.0` */
  var recursive: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RmdirSuccessCallback] = js.undefined
}

object RmdirOption {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ RmdirFailCallbackResult => Callback = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): RmdirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.RmdirFailCallbackResult) => fail(t0).runNow()))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[RmdirOption]
  }
}

