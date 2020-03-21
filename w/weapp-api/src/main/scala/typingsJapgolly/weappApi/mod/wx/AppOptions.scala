package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions
  extends /* key */ StringDictionary[js.Any] {
  /** 小程序发生脚本错误或 API 调用报错时触发。也可以使用 wx.onError 绑定监听。*/
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  /**
    * 生命周期函数--监听小程序隐藏
    * 当小程序从前台进入后台，会触发 onHide
    */
  var onHide: js.UndefOr[NoneParamCallback] = js.undefined
  /**
    * 生命周期函数--监听小程序初始化
    * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
    */
  var onLaunch: js.UndefOr[onLaunchCallback] = js.undefined
  /**
    * 小程序要打开的页面不存在时触发
    * 1. 开发者可以在回调中进行页面重定向，但必须在回调中同步处理，异步处理（例如 setTimeout 异步执行）无效。
    * 2. 若开发者没有调用 wx.onPageNotFound 绑定监听，也没有声明 App.onPageNotFound，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 3. 如果回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再第二次回调。
    */
  var onPageNotFound: js.UndefOr[NoneParamCallback] = js.undefined
  /**
    * 生命周期函数--监听小程序显示
    * 当小程序启动，或从后台进入前台显示，会触发 onShow
    */
  var onShow: js.UndefOr[js.Function1[/* options */ onShowOptions, Unit]] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onError: /* error */ js.Any => Callback = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLaunch: /* options */ onLaunchOptions => Callback = null,
    onPageNotFound: js.UndefOr[Callback] = js.undefined,
    onShow: /* options */ onShowOptions => Callback = null
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Any) => onError(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.weappApi.mod.wx.onLaunchOptions) => onLaunch(t0).runNow()))
    onPageNotFound.foreach(p => __obj.updateDynamic("onPageNotFound")(p.toJsFn))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.weappApi.mod.wx.onShowOptions) => onShow(t0).runNow()))
    __obj.asInstanceOf[AppOptions]
  }
}

