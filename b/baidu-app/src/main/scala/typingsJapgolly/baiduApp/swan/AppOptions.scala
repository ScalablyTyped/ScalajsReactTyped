package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/**
	 * App 实现的接口对象
	 * 开发者可以添加任意的函数或数据到 Object 参数中，用 this 可以访问
	 */
trait AppOptions extends js.Object {
  /**
  		 * 全局Data
  		 */
  var globalData: js.UndefOr[js.Object] = js.undefined
  /**
  		 * 错误监听函数
  		 * 当小程序发生脚本错误或者 api 调用失败时
  		 * 会触发 onError 并带上错误信息
  		 */
  var onError: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /**
  		 * 监听小程序隐藏。
  		 * 当小程序从前台进入后台，会触发 onHide
  		 * 生命周期函数
  		 */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 监听小程序初始化。
  		 * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
  		 * 生命周期函数
  		 */
  var onLaunch: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.undefined
  /**
  		 * 监听小程序显示。
  		 * 当小程序启动，或从后台进入前台显示，会触发 onShow
  		 * 生命周期函数
  		 */
  var onShow: js.UndefOr[js.Function1[/* option */ LaunchOptions, Unit]] = js.undefined
  /**
  		 * 小程序退出时触发
  		 */
  var onUnlaunch: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    globalData: js.Object = null,
    onError: /* msg */ String => Callback = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLaunch: /* option */ LaunchOptions => Callback = null,
    onShow: /* option */ LaunchOptions => Callback = null,
    onUnlaunch: js.UndefOr[Callback] = js.undefined
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (globalData != null) __obj.updateDynamic("globalData")(globalData.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onError(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1((t0: /* option */ typingsJapgolly.baiduApp.swan.LaunchOptions) => onLaunch(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* option */ typingsJapgolly.baiduApp.swan.LaunchOptions) => onShow(t0).runNow()))
    onUnlaunch.foreach(p => __obj.updateDynamic("onUnlaunch")(p.toJsFn))
    __obj.asInstanceOf[AppOptions]
  }
}

