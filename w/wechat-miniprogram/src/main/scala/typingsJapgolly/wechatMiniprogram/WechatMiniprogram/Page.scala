package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.std.ThisType
import typingsJapgolly.wechatMiniprogram.anon.OptionalInterfaceILifetim
import typingsJapgolly.wechatMiniprogram.anon.PartialILifetime
import typingsJapgolly.wechatMiniprogram.anon.WindowHeight
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.button
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  type Constructor = js.Function1[/* options */ Options[DataOption, CustomOption], Unit]
  
  type CustomOption = Record[String, Any]
  
  trait Data[D /* <: DataOption */] extends StObject {
    
    /** 页面的初始数据
      *
      * `data` 是页面第一次渲染使用的**初始数据**。
      *
      * 页面加载时，`data` 将会以`JSON`字符串的形式由逻辑层传至渲染层，因此`data`中的数据必须是可以转成`JSON`的类型：字符串，数字，布尔值，对象，数组。
      *
      * 渲染层可以通过 `WXML` 对数据进行绑定。
      */
    var data: D
  }
  object Data {
    
    inline def apply[D /* <: DataOption */](data: D): Data[D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[D]]
    }
    
    extension [Self <: Data[?], D /* <: DataOption */](x: Self & Data[D]) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type DataOption = Record[String, Any]
  
  type GetCurrentPages = js.Function0[js.Array[Instance[IAnyObject, IAnyObject]]]
  
  trait IAddToFavoritesContent extends StObject {
    
    /** 自定义图片，显示图片长宽比为 1：1，默认值：页面截图 */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** 自定义query字段，默认值：当前页面的query */
    var query: js.UndefOr[String] = js.undefined
    
    /** 自定义标题，默认值：页面标题或账号名称 */
    var title: js.UndefOr[String] = js.undefined
  }
  object IAddToFavoritesContent {
    
    inline def apply(): IAddToFavoritesContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAddToFavoritesContent]
    }
    
    extension [Self <: IAddToFavoritesContent](x: Self) {
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IAddToFavoritesOption extends StObject {
    
    /** 页面中包含web-view组件时，返回当前web-view的url */
    var webviewUrl: js.UndefOr[String] = js.undefined
  }
  object IAddToFavoritesOption {
    
    inline def apply(): IAddToFavoritesOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAddToFavoritesOption]
    }
    
    extension [Self <: IAddToFavoritesOption](x: Self) {
      
      inline def setWebviewUrl(value: String): Self = StObject.set(x, "webviewUrl", value.asInstanceOf[js.Any])
      
      inline def setWebviewUrlUndefined: Self = StObject.set(x, "webviewUrl", js.undefined)
    }
  }
  
  trait ICustomShareContent extends StObject {
    
    /** 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持PNG及JPG。显示图片长宽比是 5:4，最低基础库： `1.5.0`。默认值：使用默认截图 */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** 转发路径，必须是以 / 开头的完整路径。默认值：当前页面 path */
    var path: js.UndefOr[String] = js.undefined
    
    /** 转发标题。默认值：当前小程序名称 */
    var title: js.UndefOr[String] = js.undefined
  }
  object ICustomShareContent {
    
    inline def apply(): ICustomShareContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomShareContent]
    }
    
    extension [Self <: ICustomShareContent](x: Self) {
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ICustomTimelineContent extends StObject {
    
    /** 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持 PNG 及 JPG。显示图片长宽比是 1:1。默认值：默认使用小程序 Logo*/
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** 自定义页面路径中携带的参数，如 `path?a=1&b=2` 的 “?” 后面部分 默认值：当前页面路径携带的参数 */
    var query: js.UndefOr[String] = js.undefined
    
    /** 自定义标题，即朋友圈列表页上显示的标题。默认值：当前小程序名称 */
    var title: js.UndefOr[String] = js.undefined
  }
  object ICustomTimelineContent {
    
    inline def apply(): ICustomTimelineContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomTimelineContent]
    }
    
    extension [Self <: ICustomTimelineContent](x: Self) {
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ILifetime extends StObject {
    
    /**
      * 监听用户点击右上角菜单“收藏”按钮的行为，并自定义收藏内容。
      * 基础库 2.10.3，安卓 7.0.15 版本起支持，iOS 暂不支持
      */
    def onAddToFavorites(options: IAddToFavoritesOption): IAddToFavoritesContent
    
    /** 生命周期回调—监听页面隐藏
      *
      * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
      */
    def onHide(): Unit | js.Promise[Unit]
    
    /** 生命周期回调—监听页面加载
      *
      * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
      */
    def onLoad(/** 打开当前页面路径中的参数 */
    query: Record[String, js.UndefOr[String]]): Unit | js.Promise[Unit]
    
    /** 页面滚动触发事件的处理函数
      *
      * 监听用户滑动页面事件。
      */
    def onPageScroll(/** 页面滚动参数 */
    options: IPageScrollOption): Unit | js.Promise[Unit]
    
    /** 监听用户下拉动作
      *
      * 监听用户下拉刷新事件。
      * - 需要在`app.json`的`window`选项中或页面配置中开启`enablePullDownRefresh`。
      * - 可以通过`wx.startPullDownRefresh`触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
      * - 当处理完数据刷新后，`wx.stopPullDownRefresh`可以停止当前页面的下拉刷新。
      */
    def onPullDownRefresh(): Unit | js.Promise[Unit]
    
    /** 页面上拉触底事件的处理函数
      *
      * 监听用户上拉触底事件。
      * - 可以在`app.json`的`window`选项中或页面配置中设置触发距离`onReachBottomDistance`。
      * - 在触发距离内滑动期间，本事件只会被触发一次。
      */
    def onReachBottom(): Unit | js.Promise[Unit]
    
    /** 生命周期回调—监听页面初次渲染完成
      *
      * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
      *
      * 注意：对界面内容进行设置的 API 如`wx.setNavigationBarTitle`，请在`onReady`之后进行。
      */
    def onReady(): Unit | js.Promise[Unit]
    
    /** 窗口尺寸改变时触发，最低基础库：`2.4.0` */
    def onResize(/** 窗口尺寸参数 */
    options: IResizeOption): Unit | js.Promise[Unit]
    
    /** 用户点击右上角转发
      *
      * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
      *
      * **注意：只有定义了此事件处理函数，右上角菜单才会显示“转发”按钮**
      *
      * 此事件需要 return 一个 Object，用于自定义转发内容
      */
    def onShareAppMessage(/** 分享发起来源参数 */
    options: IShareAppMessageOption): ICustomShareContent | Unit
    
    /**
      * 监听右上角菜单“分享到朋友圈”按钮的行为，并自定义分享内容
      *
      * 本接口为 Beta 版本，暂只在 Android 平台支持，详见 [分享到朋友圈 (Beta)](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share-timeline.html)
      *
      * 基础库 2.11.3 开始支持，低版本需做兼容处理。
      */
    def onShareTimeline(): ICustomTimelineContent | Unit
    
    /** 生命周期回调—监听页面显示
      *
      * 页面显示/切入前台时触发。
      */
    def onShow(): Unit | js.Promise[Unit]
    
    /** 当前是 tab 页时，点击 tab 时触发，最低基础库： `1.9.0` */
    def onTabItemTap(/** tab 点击参数 */
    options: ITabItemTapOption): Unit | js.Promise[Unit]
    
    /** 生命周期回调—监听页面卸载
      *
      * 页面卸载时触发。如`redirectTo`或`navigateBack`到其他页面时。
      */
    def onUnload(): Unit | js.Promise[Unit]
  }
  object ILifetime {
    
    inline def apply(
      onAddToFavorites: IAddToFavoritesOption => IAddToFavoritesContent,
      onHide: CallbackTo[Unit | js.Promise[Unit]],
      onLoad: Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit],
      onPageScroll: IPageScrollOption => Unit | js.Promise[Unit],
      onPullDownRefresh: CallbackTo[Unit | js.Promise[Unit]],
      onReachBottom: CallbackTo[Unit | js.Promise[Unit]],
      onReady: CallbackTo[Unit | js.Promise[Unit]],
      onResize: IResizeOption => Unit | js.Promise[Unit],
      onShareAppMessage: IShareAppMessageOption => ICustomShareContent | Unit,
      onShareTimeline: CallbackTo[ICustomTimelineContent | Unit],
      onShow: CallbackTo[Unit | js.Promise[Unit]],
      onTabItemTap: ITabItemTapOption => Unit | js.Promise[Unit],
      onUnload: CallbackTo[Unit | js.Promise[Unit]]
    ): ILifetime = {
      val __obj = js.Dynamic.literal(onAddToFavorites = js.Any.fromFunction1(onAddToFavorites), onHide = onHide.toJsFn, onLoad = js.Any.fromFunction1(onLoad), onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = onPullDownRefresh.toJsFn, onReachBottom = onReachBottom.toJsFn, onReady = onReady.toJsFn, onResize = js.Any.fromFunction1(onResize), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage), onShareTimeline = onShareTimeline.toJsFn, onShow = onShow.toJsFn, onTabItemTap = js.Any.fromFunction1(onTabItemTap), onUnload = onUnload.toJsFn)
      __obj.asInstanceOf[ILifetime]
    }
    
    extension [Self <: ILifetime](x: Self) {
      
      inline def setOnAddToFavorites(value: IAddToFavoritesOption => IAddToFavoritesContent): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
      
      inline def setOnHide(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnLoad(value: Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnPageScroll(value: IPageScrollOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPullDownRefresh(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onPullDownRefresh", value.toJsFn)
      
      inline def setOnReachBottom(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onReachBottom", value.toJsFn)
      
      inline def setOnReady(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnResize(value: IResizeOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnShareAppMessage(value: IShareAppMessageOption => ICustomShareContent | Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      inline def setOnShareTimeline(value: CallbackTo[ICustomTimelineContent | Unit]): Self = StObject.set(x, "onShareTimeline", value.toJsFn)
      
      inline def setOnShow(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnTabItemTap(value: ITabItemTapOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
      
      inline def setOnUnload(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onUnload", value.toJsFn)
    }
  }
  
  trait IPageScrollOption extends StObject {
    
    /** 页面在垂直方向已滚动的距离（单位px） */
    var scrollTop: Double
  }
  object IPageScrollOption {
    
    inline def apply(scrollTop: Double): IPageScrollOption = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageScrollOption]
    }
    
    extension [Self <: IPageScrollOption](x: Self) {
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResizeOption extends StObject {
    
    var size: WindowHeight
  }
  object IResizeOption {
    
    inline def apply(size: WindowHeight): IResizeOption = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeOption]
    }
    
    extension [Self <: IResizeOption](x: Self) {
      
      inline def setSize(value: WindowHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShareAppMessageOption extends StObject {
    
    /** 转发事件来源。
      *
      * 可选值：
      * - `button`：页面内转发按钮；
      * - `menu`：右上角转发菜单。
      *
      * 最低基础库： `1.2.4`
      */
    var from: button | menu | String
    
    /** 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
      *
      * 最低基础库： `1.2.4` */
    var target: Any
    
    /** 页面中包含`<web-view>`组件时，返回当前`<web-view>`的url
      *
      * 最低基础库： `1.6.4`
      */
    var webViewUrl: js.UndefOr[String] = js.undefined
  }
  object IShareAppMessageOption {
    
    inline def apply(from: button | menu | String, target: Any): IShareAppMessageOption = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShareAppMessageOption]
    }
    
    extension [Self <: IShareAppMessageOption](x: Self) {
      
      inline def setFrom(value: button | menu | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWebViewUrl(value: String): Self = StObject.set(x, "webViewUrl", value.asInstanceOf[js.Any])
      
      inline def setWebViewUrlUndefined: Self = StObject.set(x, "webViewUrl", js.undefined)
    }
  }
  
  trait ITabItemTapOption extends StObject {
    
    /** 被点击tabItem的序号，从0开始，最低基础库： `1.9.0` */
    var index: String
    
    /** 被点击tabItem的页面路径，最低基础库： `1.9.0` */
    var pagePath: String
    
    /** 被点击tabItem的按钮文字，最低基础库： `1.9.0` */
    var text: String
  }
  object ITabItemTapOption {
    
    inline def apply(index: String, pagePath: String, text: String): ITabItemTapOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabItemTapOption]
    }
    
    extension [Self <: ITabItemTapOption](x: Self) {
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type Instance[TData /* <: DataOption */, TCustom /* <: CustomOption */] = OptionalInterfaceILifetim & InstanceProperties & InstanceMethods[TData] & Data[TData] & TCustom
  
  type InstanceMethods[D /* <: DataOption */] = typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component.InstanceMethods[D]
  
  trait InstanceProperties extends StObject {
    
    /** 页面的文件路径 */
    var is: String
    
    /** 打开当前页面路径中的参数 */
    var options: Record[String, js.UndefOr[String]]
    
    /** 到当前页面的路径 */
    var route: String
  }
  object InstanceProperties {
    
    inline def apply(is: String, options: Record[String, js.UndefOr[String]], route: String): InstanceProperties = {
      val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceProperties]
    }
    
    extension [Self <: InstanceProperties](x: Self) {
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type Options[TData /* <: DataOption */, TCustom /* <: CustomOption */] = TCustom & Partial[Data[TData]] & PartialILifetime & typingsJapgolly.wechatMiniprogram.anon.Options & (ThisType[Instance[TData, TCustom]])
  
  type TrivialInstance = Instance[IAnyObject, IAnyObject]
}
