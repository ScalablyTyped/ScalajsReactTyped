package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonDataReadonlyArray
import typingsJapgolly.wegameApi.wegameApiStrings.en
import typingsJapgolly.wegameApi.wegameApiStrings.zh_CN
import typingsJapgolly.wegameApi.wegameApiStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
trait NewUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[String]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonDataReadonlyArray, Unit]] = js.undefined
}

object NewUserInfoParam {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    lang: en | zh_CN | zh_TW = null,
    openIdList: js.Array[String] = null,
    success: /* res */ AnonDataReadonlyArray => Callback = null
  ): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (openIdList != null) __obj.updateDynamic("openIdList")(openIdList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonDataReadonlyArray) => success(t0).runNow()))
    __obj.asInstanceOf[NewUserInfoParam]
  }
}

