package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.oauth
import typingsJapgolly.uniApp.uniAppStrings.payment
import typingsJapgolly.uniApp.uniAppStrings.push
import typingsJapgolly.uniApp.uniAppStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProviderOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 服务类型，可取值“oauth”、“share”、“payment”、“push”
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.undefined
  /**
    * 接口调用成功的回调
    */
  var success: js.UndefOr[js.Function1[/* result */ GetProviderRes, Unit]] = js.undefined
}

object GetProviderOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    service: oauth | share | payment | push = null,
    success: /* result */ GetProviderRes => Callback = null
  ): GetProviderOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GetProviderRes) => success(t0).runNow()))
    __obj.asInstanceOf[GetProviderOptions]
  }
}

