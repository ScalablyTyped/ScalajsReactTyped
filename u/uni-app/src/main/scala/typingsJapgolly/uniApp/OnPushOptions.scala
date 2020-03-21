package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.igexin
import typingsJapgolly.uniApp.uniAppStrings.mipush
import typingsJapgolly.uniApp.uniAppStrings.unipush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPushOptions extends js.Object {
  /**
    * 接收到透传数据回调，回调参数（Object）：messageId（消息id）、data（消息内容）
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 推送服务提供商，通过uni.getProvider获取
    * - unipush: UniPush
    * - igexin: 个推
    * - mipush: 小米推送
    */
  var provider: js.UndefOr[unipush | igexin | mipush] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OnPushOptions {
  @scala.inline
  def apply(
    callback: js.UndefOr[Callback] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    provider: unipush | igexin | mipush = null,
    success: js.UndefOr[Callback] = js.undefined
  ): OnPushOptions = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[OnPushOptions]
  }
}

