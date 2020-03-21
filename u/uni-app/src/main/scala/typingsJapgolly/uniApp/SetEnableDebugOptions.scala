package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetEnableDebugOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否打开调试
    */
  var enableDebug: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetEnableDebugOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    enableDebug: js.UndefOr[Boolean] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): SetEnableDebugOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SetEnableDebugOptions]
  }
}

