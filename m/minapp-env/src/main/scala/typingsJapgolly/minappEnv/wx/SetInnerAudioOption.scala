package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetInnerAudioOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetInnerAudioOptionCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetInnerAudioOptionFailCallback] = js.undefined
  /** 是否与其他音频混播，设置为 true 之后，不会终止其他应用或微信内的音乐 */
  var mixWithOther: js.UndefOr[Boolean] = js.undefined
  /** （仅在 iOS 生效）是否遵循静音开关，设置为 false 之后，即使是在静音模式下，也能播放声音 */
  var obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetInnerAudioOptionSuccessCallback] = js.undefined
}

object SetInnerAudioOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    mixWithOther: js.UndefOr[Boolean] = js.undefined,
    obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): SetInnerAudioOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (!js.isUndefined(mixWithOther)) __obj.updateDynamic("mixWithOther")(mixWithOther.asInstanceOf[js.Any])
    if (!js.isUndefined(obeyMuteSwitch)) __obj.updateDynamic("obeyMuteSwitch")(obeyMuteSwitch.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[SetInnerAudioOption]
  }
}

