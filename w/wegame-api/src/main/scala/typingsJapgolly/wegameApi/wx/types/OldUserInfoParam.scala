package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonEncryptedData
import typingsJapgolly.wegameApi.wegameApiStrings.en
import typingsJapgolly.wegameApi.wegameApiStrings.zh_CN
import typingsJapgolly.wegameApi.wegameApiStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * wx.getUserInfo的旧版本API参数，随时会被删除，不推荐使用
  */
trait OldUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonEncryptedData, Unit]] = js.undefined
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object OldUserInfoParam {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    lang: en | zh_CN | zh_TW = null,
    success: /* res */ AnonEncryptedData => Callback = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): OldUserInfoParam = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonEncryptedData) => success(t0).runNow()))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldUserInfoParam]
  }
}

