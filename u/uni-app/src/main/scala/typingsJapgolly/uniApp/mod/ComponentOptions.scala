package typingsJapgolly.uniApp.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uniApp.AnyObject
import typingsJapgolly.uniApp.App.LaunchShowOption
import typingsJapgolly.uniApp.App.PageNotFoundOption
import typingsJapgolly.uniApp.Page.BackPressOption
import typingsJapgolly.uniApp.Page.CustomShareContent
import typingsJapgolly.uniApp.Page.NavigationBarButtonTapOption
import typingsJapgolly.uniApp.Page.NavigationBarSearchInputEvent
import typingsJapgolly.uniApp.Page.PageInstance
import typingsJapgolly.uniApp.Page.PageScrollOption
import typingsJapgolly.uniApp.Page.ShareAppMessageOption
import typingsJapgolly.uniApp.Page.TabItemTapOption
import typingsJapgolly.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.uniApp.App.AppInstance because var conflicts: onHide, onShow. Inlined globalData, onLaunch, onError, onPageNotFound, onUniNViewMessage */ trait ComponentOptions[V /* <: Vue */]
  extends PageInstance[js.Any, js.Any] {
  /**
    * 全局对象
    */
  var globalData: js.UndefOr[AnyObject] = js.undefined
  /**
    * 组件类型
    */
  var mpType: js.UndefOr[String] = js.undefined
  /**
    * 错误监听函数
    * 小程序发生脚本错误或 API 调用报错时触发
    * @param error 错误信息，包含堆栈
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  /**
    * 生命周期回调 监听应用初始化
    *
    * 应用初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.undefined
  /**
    * 页面不存在监听函数
    *
    * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.undefined
  /**
    * 监听 nvue 页面消息
    *
    * nvue 页面使用 `uni.postMessage` 发送消息时触发
    */
  var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](
    globalData: AnyObject = null,
    mpType: String = null,
    onBackPress: /* options */ BackPressOption => CallbackTo[js.Any] = null,
    onError: /* error */ String => Callback = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLaunch: /* options */ js.UndefOr[LaunchShowOption] => Callback = null,
    onLoad: /* query */ js.UndefOr[AnyObject] => Callback = null,
    onNavigationBarButtonTap: /* options */ NavigationBarButtonTapOption => Callback = null,
    onNavigationBarSearchInputChanged: /* event */ NavigationBarSearchInputEvent => Callback = null,
    onNavigationBarSearchInputClicked: js.UndefOr[Callback] = js.undefined,
    onNavigationBarSearchInputConfirmed: /* event */ NavigationBarSearchInputEvent => Callback = null,
    onPageNotFound: /* options */ PageNotFoundOption => Callback = null,
    onPageScroll: /* options */ PageScrollOption => Callback = null,
    onPullDownRefresh: js.UndefOr[Callback] = js.undefined,
    onReachBottom: js.UndefOr[Callback] = js.undefined,
    onReady: js.UndefOr[Callback] = js.undefined,
    onResize: /* options */ PageScrollOption => Callback = null,
    onShareAppMessage: /* options */ ShareAppMessageOption => CallbackTo[CustomShareContent] = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onTabItemTap: /* options */ TabItemTapOption => Callback = null,
    onUniNViewMessage: /* options */ AnyObject => Callback = null,
    onUnload: js.UndefOr[Callback] = js.undefined,
    route: String = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (globalData != null) __obj.updateDynamic("globalData")(globalData.asInstanceOf[js.Any])
    if (mpType != null) __obj.updateDynamic("mpType")(mpType.asInstanceOf[js.Any])
    if (onBackPress != null) __obj.updateDynamic("onBackPress")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.BackPressOption) => onBackPress(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ java.lang.String) => onError(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.uniApp.App.LaunchShowOption]) => onLaunch(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* query */ js.UndefOr[typingsJapgolly.uniApp.AnyObject]) => onLoad(t0).runNow()))
    if (onNavigationBarButtonTap != null) __obj.updateDynamic("onNavigationBarButtonTap")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.NavigationBarButtonTapOption) => onNavigationBarButtonTap(t0).runNow()))
    if (onNavigationBarSearchInputChanged != null) __obj.updateDynamic("onNavigationBarSearchInputChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.uniApp.Page.NavigationBarSearchInputEvent) => onNavigationBarSearchInputChanged(t0).runNow()))
    onNavigationBarSearchInputClicked.foreach(p => __obj.updateDynamic("onNavigationBarSearchInputClicked")(p.toJsFn))
    if (onNavigationBarSearchInputConfirmed != null) __obj.updateDynamic("onNavigationBarSearchInputConfirmed")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.uniApp.Page.NavigationBarSearchInputEvent) => onNavigationBarSearchInputConfirmed(t0).runNow()))
    if (onPageNotFound != null) __obj.updateDynamic("onPageNotFound")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.App.PageNotFoundOption) => onPageNotFound(t0).runNow()))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.PageScrollOption) => onPageScroll(t0).runNow()))
    onPullDownRefresh.foreach(p => __obj.updateDynamic("onPullDownRefresh")(p.toJsFn))
    onReachBottom.foreach(p => __obj.updateDynamic("onReachBottom")(p.toJsFn))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.PageScrollOption) => onResize(t0).runNow()))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.ShareAppMessageOption) => onShareAppMessage(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.TabItemTapOption) => onTabItemTap(t0).runNow()))
    if (onUniNViewMessage != null) __obj.updateDynamic("onUniNViewMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.AnyObject) => onUniNViewMessage(t0).runNow()))
    onUnload.foreach(p => __obj.updateDynamic("onUnload")(p.toJsFn))
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

