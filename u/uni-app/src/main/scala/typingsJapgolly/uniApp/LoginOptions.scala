package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.qq
import typingsJapgolly.uniApp.uniAppStrings.sinaweibo
import typingsJapgolly.uniApp.uniAppStrings.weixin
import typingsJapgolly.uniApp.uniAppStrings.xiaomi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 授权登录服务提供商，通过uni.getProvider获取，如果不设置则弹出分享列表选择界面
    * - weixin: 微信登录
    * - qq: QQ登录
    * - sinaweibo: 新浪微博登录
    * - xiaomi: 小米登录
    */
  var provider: js.UndefOr[weixin | qq | sinaweibo | xiaomi] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ LoginRes, Unit]] = js.undefined
  /**
    * 超时时间，单位 ms
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    provider: weixin | qq | sinaweibo | xiaomi = null,
    success: /* result */ LoginRes => Callback = null,
    timeout: Int | Double = null
  ): LoginOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.LoginRes) => success(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOptions]
  }
}

