package typingsJapgolly.minappEnv.App

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInstance[T /* <: IAnyObject */] extends js.Object {
  /** 错误监听函数
    *
    * 小程序发生脚本错误，或者 api
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.UndefOr[String], Unit]] = js.undefined
  /** 生命周期回调—监听小程序隐藏
    *
    * 小程序从前台进入后台时
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 生命周期回调—监听小程序初始化
    *
    * 小程序初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.undefined
  /** 页面不存在监听函数
    *
    * 小程序要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    *
    * 最低基础库： 1.9.90
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageNotFoundOption], Unit]] = js.undefined
  /** 生命周期回调—监听小程序显示
    *
    * 小程序启动，或从后台进入前台显示时
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.undefined
}

object AppInstance {
  @scala.inline
  def apply[T /* <: IAnyObject */](
    onError: /* error */ js.UndefOr[String] => Callback = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLaunch: /* options */ js.UndefOr[ILaunchShowOption] => Callback = null,
    onPageNotFound: /* options */ js.UndefOr[IPageNotFoundOption] => Callback = null,
    onShow: /* options */ js.UndefOr[ILaunchShowOption] => Callback = null
  ): AppInstance[T] = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[java.lang.String]) => onError(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.App.ILaunchShowOption]) => onLaunch(t0).runNow()))
    if (onPageNotFound != null) __obj.updateDynamic("onPageNotFound")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.App.IPageNotFoundOption]) => onPageNotFound(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.App.ILaunchShowOption]) => onShow(t0).runNow()))
    __obj.asInstanceOf[AppInstance[T]]
  }
}

