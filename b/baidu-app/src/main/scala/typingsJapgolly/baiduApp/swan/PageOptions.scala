package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baiduApp.AnonScrollTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Page 实现的接口对象
	 */
trait PageOptions extends js.Object {
  /**
  		 * 页面的初始数据
  		 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  		 * 生命周期函数--监听页面隐藏
  		 */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 生命周期函数--监听页面加载
  		 * @param options 接收页面参数可以获取swan.navigateTo和swan.redirectTo及<navigator/>中的 query
  		 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Object, Unit]] = js.undefined
  /**
  		 * 页面滚动触发事件的处理函数
  		 * 监听用户滑动页面事件。
  		 * 参数为 Object，包含以下字段：
  		 */
  var onPageScroll: js.UndefOr[js.Function1[/* option */ AnonScrollTop, Unit]] = js.undefined
  /**
  		 * 下拉刷新
  		 * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
  		 * 需要在 config 的window选项中开启 enablePullDownRefresh。
  		 * 当处理完数据刷新后，swan.stopPullDownRefresh可以停止当前页面的下拉刷新。
  		 */
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 页面上拉触底事件的处理函数
  		 * 监听用户上拉触底事件。
  		 * 可以在app.json的window选项中或页面配置中设置触发距离onReachBottomDistance。
  		 * 在触发距离内滑动期间，本事件只会被触发一次。
  		 */
  var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 生命周期函数--监听页面初次渲染完成
  		 */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 在 Page 中定义 onShareAppMessage 函数，设置该页面的转发信息。
  		 * + 只有定义了此事件处理函数，右上角菜单才会显示 “转发” 按
  		 * + 用户点击转发按钮的时候会调
  		 * + 此事件需要 return 一个 Object，用于自定义转发内容
  		 */
  var onShareAppMessage: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[PageShareAppMessageOptions], ShareAppMessage]
  ] = js.undefined
  /**
  		 * 生命周期函数--监听页面显示
  		 */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 当前是 tab 页时，点击 tab 时触发
  		 */
  var onTabItemTap: js.UndefOr[js.Function1[/* item */ js.Any, Unit]] = js.undefined
  /**
  		 * 生命周期函数--监听页面卸载
  		 */
  var onUnload: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PageOptions {
  @scala.inline
  def apply(
    data: js.Any = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLoad: /* options */ js.Object => Callback = null,
    onPageScroll: /* option */ AnonScrollTop => Callback = null,
    onPullDownRefresh: js.UndefOr[Callback] = js.undefined,
    onReachBottom: js.UndefOr[Callback] = js.undefined,
    onReady: js.UndefOr[Callback] = js.undefined,
    onShareAppMessage: /* options */ js.UndefOr[PageShareAppMessageOptions] => CallbackTo[ShareAppMessage] = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    onTabItemTap: /* item */ js.Any => Callback = null,
    onUnload: js.UndefOr[Callback] = js.undefined
  ): PageOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* options */ js.Object) => onLoad(t0).runNow()))
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: /* option */ typingsJapgolly.baiduApp.AnonScrollTop) => onPageScroll(t0).runNow()))
    onPullDownRefresh.foreach(p => __obj.updateDynamic("onPullDownRefresh")(p.toJsFn))
    onReachBottom.foreach(p => __obj.updateDynamic("onReachBottom")(p.toJsFn))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.baiduApp.swan.PageShareAppMessageOptions]) => onShareAppMessage(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (onTabItemTap != null) __obj.updateDynamic("onTabItemTap")(js.Any.fromFunction1((t0: /* item */ js.Any) => onTabItemTap(t0).runNow()))
    onUnload.foreach(p => __obj.updateDynamic("onUnload")(p.toJsFn))
    __obj.asInstanceOf[PageOptions]
  }
}

