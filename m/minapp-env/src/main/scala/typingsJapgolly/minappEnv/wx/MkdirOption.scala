package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[MkdirCompleteCallback] = js.undefined
  /** 创建的目录路径 */
  var dirPath: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[MkdirFailCallback] = js.undefined
  /** 是否在递归创建该目录的上级目录后再创建该目录。如果对应的上级目录已经存在，则不创建该上级目录。如 dirPath 为 a/b/c/d 且 recursive 为 true，将创建 a 目录，再在 a 目录下创建 b 目录，以此类推直至创建 a/b/c 目录下的 d 目录。
    *
    * 最低基础库： `2.3.0` */
  var recursive: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[MkdirSuccessCallback] = js.undefined
}

object MkdirOption {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ MkdirFailCallbackResult => Callback = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): MkdirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.MkdirFailCallbackResult) => fail(t0).runNow()))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[MkdirOption]
  }
}

