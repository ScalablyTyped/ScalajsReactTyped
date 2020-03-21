package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOptions extends js.Object {
  /**
    * 要打开的uni-app appId
    */
  var appId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要打开的uni-app版本
    */
  var envVersion: js.UndefOr[String] = js.undefined
  /**
    * 需要传递给目标uni-app的数据
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 打开的页面路径，如果为空则打开首页
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    envVersion: String = null,
    extraData: js.Any = null,
    fail: js.UndefOr[Callback] = js.undefined,
    path: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

