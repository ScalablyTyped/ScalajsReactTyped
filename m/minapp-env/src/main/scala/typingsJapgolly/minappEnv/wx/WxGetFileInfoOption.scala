package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.minappEnvStrings.md5_
import typingsJapgolly.minappEnv.minappEnvStrings.sha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxGetFileInfoOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WxGetFileInfoCompleteCallback] = js.undefined
  /** 计算文件摘要的算法
    *
    * 可选值：
    * - 'md5': md5 算法;
    * - 'sha1': sha1 算法; */
  var digestAlgorithm: js.UndefOr[md5_ | sha1] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WxGetFileInfoFailCallback] = js.undefined
  /** 本地文件路径 */
  var filePath: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WxGetFileInfoSuccessCallback] = js.undefined
}

object WxGetFileInfoOption {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    digestAlgorithm: md5_ | sha1 = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* result */ WxGetFileInfoSuccessCallbackResult => Callback = null
  ): WxGetFileInfoOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.WxGetFileInfoSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[WxGetFileInfoOption]
  }
}

