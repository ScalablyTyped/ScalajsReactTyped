package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.minappEnvStrings.facial
import typingsJapgolly.minappEnv.minappEnvStrings.fingerPrint
import typingsJapgolly.minappEnv.minappEnvStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOption extends js.Object {
  /** 认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var checkAuthMode: Array[fingerPrint | facial | speech]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CheckIsSoterEnrolledInDeviceCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CheckIsSoterEnrolledInDeviceFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CheckIsSoterEnrolledInDeviceSuccessCallback] = js.undefined
}

object CheckIsSoterEnrolledInDeviceOption {
  @scala.inline
  def apply(
    checkAuthMode: Array[fingerPrint | facial | speech],
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* result */ CheckIsSoterEnrolledInDeviceSuccessCallbackResult => Callback = null
  ): CheckIsSoterEnrolledInDeviceOption = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.CheckIsSoterEnrolledInDeviceSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOption]
  }
}

