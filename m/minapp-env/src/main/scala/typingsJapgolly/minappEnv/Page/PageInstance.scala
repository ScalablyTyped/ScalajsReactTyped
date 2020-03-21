package typingsJapgolly.minappEnv.Page

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.minappEnv.IAnyObject
import typingsJapgolly.minappEnv.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInstance[D /* <: IAnyObject */, T /* <: IAnyObject */] extends PageInstanceBaseProps[D] {
  /** 生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 生命周期回调—监听页面加载
    *
    * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[StringDictionary[String]], Unit]] = js.undefined
  /** 页面滚动触发事件的处理函数
    *
    * 监听用户滑动页面事件。
    */
  var onPageScroll: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageScrollOption], Unit]] = js.undefined
  /** 监听用户下拉动作
    *
    * 监听用户下拉刷新事件。
    * - 需要在`app.json`的`window`选项中或页面配置中开启`enablePullDownRefresh`。
    * - 可以通过`wx.startPullDownRefresh`触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    * - 当处理完数据刷新后，`wx.stopPullDownRefresh`可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 页面上拉触底事件的处理函数
    *
    * 监听用户上拉触底事件。
    * - 可以在`app.json`的`window`选项中或页面配置中设置触发距离`onReachBottomDistance`。
    * - 在触发距离内滑动期间，本事件只会被触发一次。
    */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 生命周期回调—监听页面初次渲染完成
    * 
    * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
    * 
    
    * 注意：对界面内容进行设置的 API 如`wx.setNavigationBarTitle`，请在`onReady`之后进行。
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 用户点击右上角转发
    *
    * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
    *
    * **注意：只有定义了此事件处理函数，右上角菜单才会显示“转发”按钮**
    *
    * 此事件需要 return 一个 Object，用于自定义转发内容
    */
  var onShareAppMessage: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[IShareAppMessageOption], ICustomShareContent]
  ] = js.undefined
  /** 生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** 当前是 tab 页时，点击 tab 时触发，最低基础库： `1.9.0` */
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ js.UndefOr[ITabItemTapOption], Unit]] = js.undefined
  /** 生命周期回调—监听页面卸载
    *
    * 页面卸载时触发。如`redirectTo`或`navigateBack`到其他页面时。
    */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PageInstance {
  @scala.inline
  def apply[D /* <: IAnyObject */, T /* <: IAnyObject */](
    data: D = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLoad: /* query */ js.UndefOr[StringDictionary[String]] => Callback = null,
    onPageScroll: /* options */ js.UndefOr[IPageScrollOption] => Callback = null,
    onPullDownRefresh: js.UndefOr[Callback] = js.undefined,
    onReachBottom: js.UndefOr[Callback] = js.undefined,
    onReady: js.UndefOr[Callback] = js.undefined,
    onShareAppMessage: /* options */ js.UndefOr[IShareAppMessageOption] => CallbackTo[ICustomShareContent] = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onTabItemTap: /* options */ js.UndefOr[ITabItemTapOption] => Callback = null,
    onUnload: js.UndefOr[Callback] = js.undefined,
    route: String = null,
    setData: (/* data */ D | (Pick[D, String]) | IAnyObject, /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback = null
  ): PageInstance[D, T] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* query */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]) => onLoad(t0).runNow()))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.Page.IPageScrollOption]) => onPageScroll(t0).runNow()))
    onPullDownRefresh.foreach(p => __obj.updateDynamic("onPullDownRefresh")(p.toJsFn))
    onReachBottom.foreach(p => __obj.updateDynamic("onReachBottom")(p.toJsFn))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.Page.IShareAppMessageOption]) => onShareAppMessage(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.minappEnv.Page.ITabItemTapOption]) => onTabItemTap(t0).runNow()))
    onUnload.foreach(p => __obj.updateDynamic("onUnload")(p.toJsFn))
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2((t0: /* data */ D | (typingsJapgolly.minappEnv.Pick[D, java.lang.String]) | typingsJapgolly.minappEnv.IAnyObject, t1: /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => setData(t0, t1).runNow()))
    __obj.asInstanceOf[PageInstance[D, T]]
  }
}

