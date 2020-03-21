package typingsJapgolly.uniApp.Page

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInstance[D /* <: AnyObject */, T /* <: AnyObject */] extends PageInstanceBaseProps[D] {
  /**
    * 监听页面返回
    * @param options tab 点击参数
    * @return 返回 `true` 时阻止页面返回
    */
  var onBackPress: js.UndefOr[js.Function1[/* options */ BackPressOption, _]] = js.undefined
  /**
    * 生命周期回调 监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，应用切入后台等。
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 生命周期回调 监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    * @param query 打开当前页面路径中的参数
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[AnyObject], Unit]] = js.undefined
  /**
    * 监听原生标题栏按钮点击事件
    * @param options tab 点击参数
    */
  var onNavigationBarButtonTap: js.UndefOr[js.Function1[/* options */ NavigationBarButtonTapOption, Unit]] = js.undefined
  /**
    * 监听原生标题栏搜索输入框输入内容变化事件
    */
  var onNavigationBarSearchInputChanged: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.undefined
  /**
    * 监听原生标题栏搜索输入框点击事件
    */
  var onNavigationBarSearchInputClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 监听原生标题栏搜索输入框搜索事件，用户点击软键盘上的“搜索”按钮时触发。
    */
  var onNavigationBarSearchInputConfirmed: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.undefined
  /**
    * 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    * @param options 页面滚动参数
    */
  var onPageScroll: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.undefined
  /**
    * 监听用户下拉动作
    * - 需要在 `pages.json` 的页面配置中开启 `enablePullDownRefresh` 。
    * - 可以通过 `uni.startPullDownRefresh` 触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`uni.stopPullDownRefresh` 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 页面上拉触底事件的处理函数
    * - 可以在 `pages.json` 的页面配置中设置触发距离 `onReachBottomDistance` 。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 生命周期回调 监听页面初次渲染完成
    *
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 页面尺寸改变时触发
    * @param options 页面滚动参数
    */
  var onResize: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.undefined
  /**
    * 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    * @param options 分享发起来源参数
    * @return 转发内容
    */
  var onShareAppMessage: js.UndefOr[js.Function1[/* options */ ShareAppMessageOption, CustomShareContent]] = js.undefined
  /**
    * 生命周期回调 监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 当前是 tab 页时，点击 tab 时触发
    * @param options tab 点击参数
    */
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ TabItemTapOption, Unit]] = js.undefined
  /**
    * 生命周期回调 监听页面卸载
    *
    * 页面卸载时触发。如 `redirectTo` 或 `navigateBack` 到其他页面时。
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PageInstance {
  @scala.inline
  def apply[D /* <: AnyObject */, T /* <: AnyObject */](
    onBackPress: /* options */ BackPressOption => CallbackTo[js.Any] = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLoad: /* query */ js.UndefOr[AnyObject] => Callback = null,
    onNavigationBarButtonTap: /* options */ NavigationBarButtonTapOption => Callback = null,
    onNavigationBarSearchInputChanged: /* event */ NavigationBarSearchInputEvent => Callback = null,
    onNavigationBarSearchInputClicked: js.UndefOr[Callback] = js.undefined,
    onNavigationBarSearchInputConfirmed: /* event */ NavigationBarSearchInputEvent => Callback = null,
    onPageScroll: /* options */ PageScrollOption => Callback = null,
    onPullDownRefresh: js.UndefOr[Callback] = js.undefined,
    onReachBottom: js.UndefOr[Callback] = js.undefined,
    onReady: js.UndefOr[Callback] = js.undefined,
    onResize: /* options */ PageScrollOption => Callback = null,
    onShareAppMessage: /* options */ ShareAppMessageOption => CallbackTo[CustomShareContent] = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onTabItemTap: /* options */ TabItemTapOption => Callback = null,
    onUnload: js.UndefOr[Callback] = js.undefined,
    route: String = null
  ): PageInstance[D, T] = {
    val __obj = js.Dynamic.literal()
    if (onBackPress != null) __obj.updateDynamic("onBackPress")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.BackPressOption) => onBackPress(t0).runNow()))
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* query */ js.UndefOr[typingsJapgolly.uniApp.AnyObject]) => onLoad(t0).runNow()))
    if (onNavigationBarButtonTap != null) __obj.updateDynamic("onNavigationBarButtonTap")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.NavigationBarButtonTapOption) => onNavigationBarButtonTap(t0).runNow()))
    if (onNavigationBarSearchInputChanged != null) __obj.updateDynamic("onNavigationBarSearchInputChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.uniApp.Page.NavigationBarSearchInputEvent) => onNavigationBarSearchInputChanged(t0).runNow()))
    onNavigationBarSearchInputClicked.foreach(p => __obj.updateDynamic("onNavigationBarSearchInputClicked")(p.toJsFn))
    if (onNavigationBarSearchInputConfirmed != null) __obj.updateDynamic("onNavigationBarSearchInputConfirmed")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.uniApp.Page.NavigationBarSearchInputEvent) => onNavigationBarSearchInputConfirmed(t0).runNow()))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.PageScrollOption) => onPageScroll(t0).runNow()))
    onPullDownRefresh.foreach(p => __obj.updateDynamic("onPullDownRefresh")(p.toJsFn))
    onReachBottom.foreach(p => __obj.updateDynamic("onReachBottom")(p.toJsFn))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.PageScrollOption) => onResize(t0).runNow()))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.ShareAppMessageOption) => onShareAppMessage(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.uniApp.Page.TabItemTapOption) => onTabItemTap(t0).runNow()))
    onUnload.foreach(p => __obj.updateDynamic("onUnload")(p.toJsFn))
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInstance[D, T]]
  }
}

