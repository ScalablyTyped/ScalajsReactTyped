package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.ThisType
import typingsJapgolly.wechatMiniprogram.anon.PartialOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type Constructor = js.Function1[/* options */ Options[IAnyObject], Unit]
  
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], Instance[IAnyObject]]
  
  trait GetAppOption extends StObject {
    
    /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
      *
      * 最低基础库： 2.2.4
      */
    var allowDefault: js.UndefOr[Boolean] = js.undefined
  }
  object GetAppOption {
    
    inline def apply(): GetAppOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAppOption]
    }
    
    extension [Self <: GetAppOption](x: Self) {
      
      inline def setAllowDefault(value: Boolean): Self = StObject.set(x, "allowDefault", value.asInstanceOf[js.Any])
      
      inline def setAllowDefaultUndefined: Self = StObject.set(x, "allowDefault", js.undefined)
    }
  }
  
  type Instance[T /* <: IAnyObject */] = Option & T
  
  trait LaunchShowOption extends StObject {
    
    /** 打开小程序的路径 */
    var path: String
    
    /** 打开小程序的query */
    var query: IAnyObject
    
    /** 当场景为由从另一个小程序或公众号或App打开时，返回此字段 */
    var referrerInfo: js.UndefOr[typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo] = js.undefined
    
    /** 打开小程序的场景值
      * - 1001：发现栏小程序主入口，「最近使用」列表（基础库2.2.4版本起包含「我的小程序」列表）
      * - 1005：微信首页顶部搜索框的搜索结果页
      * - 1006：发现栏小程序主入口搜索框的搜索结果页
      * - 1007：单人聊天会话中的小程序消息卡片
      * - 1008：群聊会话中的小程序消息卡片
      * - 1011：扫描二维码
      * - 1012：长按图片识别二维码
      * - 1013：扫描手机相册中选取的二维码
      * - 1014：小程序模板消息
      * - 1017：前往小程序体验版的入口页
      * - 1019：微信钱包（微信客户端7.0.0版本改为支付入口）
      * - 1020：公众号 profile 页相关小程序列表
      * - 1023：安卓系统桌面图标
      * - 1024：小程序 profile 页
      * - 1025：扫描一维码
      * - 1026：发现栏小程序主入口，「附近的小程序」列表
      * - 1027：微信首页顶部搜索框搜索结果页「使用过的小程序」列表
      * - 1028：我的卡包
      * - 1029：小程序中的卡券详情页
      * - 1030：自动化测试下打开小程序
      * - 1031：长按图片识别一维码
      * - 1032：扫描手机相册中选取的一维码
      * - 1034：微信支付完成页
      * - 1035：公众号自定义菜单
      * - 1036：App 分享消息卡片
      * - 1037：小程序打开小程序
      * - 1038：从另一个小程序返回
      * - 1039：摇电视
      * - 1042：添加好友搜索框的搜索结果页
      * - 1043：公众号模板消息
      * - 1044：带 shareTicket 的小程序消息卡片 [详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html)
      * - 1045：朋友圈广告
      * - 1046：朋友圈广告详情页
      * - 1047：扫描小程序码
      * - 1048：长按图片识别小程序码
      * - 1049：扫描手机相册中选取的小程序码
      * - 1052：卡券的适用门店列表
      * - 1053：搜一搜的结果页
      * - 1056：聊天顶部音乐播放器右上角菜单
      * - 1057：钱包中的银行卡详情页
      * - 1058：公众号文章
      * - 1059：体验版小程序绑定邀请页
      * - 1064：微信首页连Wi-Fi状态栏
      * - 1067：公众号文章广告
      * - 1069：移动应用
      * - 1071：钱包中的银行卡列表页
      * - 1072：二维码收款页面
      * - 1073：客服消息列表下发的小程序消息卡片
      * - 1074：公众号会话下发的小程序消息卡片
      * - 1077：摇周边
      * - 1078：微信连Wi-Fi成功提示页
      * - 1079：微信游戏中心
      * - 1081：客服消息下发的文字链
      * - 1082：公众号会话下发的文字链
      * - 1084：朋友圈广告原生页
      * - 1089：微信聊天主界面下拉，「最近使用」栏（基础库2.2.4版本起包含「我的小程序」栏）
      * - 1090：长按小程序右上角菜单唤出最近使用历史
      * - 1091：公众号文章商品卡片
      * - 1092：城市服务入口
      * - 1095：小程序广告组件
      * - 1096：聊天记录
      * - 1097：微信支付签约页
      * - 1099：页面内嵌插件
      * - 1102：公众号 profile 页服务预览
      * - 1124：扫“一物一码”打开小程序
      * - 1125：长按图片识别“一物一码”
      * - 1126：扫描手机相册中选取的“一物一码”
      * - 1129：微信爬虫访问 [详情](https://developers.weixin.qq.com/miniprogram/dev/reference/configuration/sitemap.html)
      */
    var scene: SceneValues
    
    /** shareTicket，详见 [获取更多转发信息]((转发#获取更多转发信息)) */
    var shareTicket: String
  }
  object LaunchShowOption {
    
    inline def apply(path: String, query: IAnyObject, scene: SceneValues, shareTicket: String): LaunchShowOption = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchShowOption]
    }
    
    extension [Self <: LaunchShowOption](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReferrerInfo(value: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
      
      inline def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
      
      inline def setScene(value: SceneValues): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Option extends StObject {
    
    /** 错误监听函数
      *
      * 小程序发生脚本错误，或者 api
      */
    def onError(/** 错误信息，包含堆栈 */ error: String): Unit
    
    /** 生命周期回调—监听小程序隐藏
      *
      * 小程序从前台进入后台时
      */
    def onHide(): Unit
    
    /** 生命周期回调—监听小程序初始化
      *
      * 小程序初始化完成时触发，全局只触发一次。
      */
    def onLaunch(options: LaunchShowOption): Unit
    
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
    def onPageNotFound(options: PageNotFoundOption): Unit
    
    /** 生命周期回调—监听小程序显示
      *
      * 小程序启动，或从后台进入前台显示时
      */
    def onShow(options: LaunchShowOption): Unit
    
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    def onThemeChange(result: OnThemeChangeCallbackResult): Unit
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    @JSName("onThemeChange")
    var onThemeChange_Original: OnThemeChangeCallback
    
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    def onUnhandledRejection(result: OnUnhandledRejectionCallbackResult): Unit
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    @JSName("onUnhandledRejection")
    var onUnhandledRejection_Original: OnUnhandledRejectionCallback
  }
  object Option {
    
    inline def apply(
      onError: String => Callback,
      onHide: Callback,
      onLaunch: LaunchShowOption => Callback,
      onPageNotFound: PageNotFoundOption => Callback,
      onShow: LaunchShowOption => Callback,
      onThemeChange: /* result */ OnThemeChangeCallbackResult => Callback,
      onUnhandledRejection: /* result */ OnUnhandledRejectionCallbackResult => Callback
    ): Option = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: String) => onError(t0).runNow()), onHide = onHide.toJsFn, onLaunch = js.Any.fromFunction1((t0: LaunchShowOption) => onLaunch(t0).runNow()), onPageNotFound = js.Any.fromFunction1((t0: PageNotFoundOption) => onPageNotFound(t0).runNow()), onShow = js.Any.fromFunction1((t0: LaunchShowOption) => onShow(t0).runNow()), onThemeChange = js.Any.fromFunction1((t0: /* result */ OnThemeChangeCallbackResult) => onThemeChange(t0).runNow()), onUnhandledRejection = js.Any.fromFunction1((t0: /* result */ OnUnhandledRejectionCallbackResult) => onUnhandledRejection(t0).runNow()))
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setOnError(value: String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnLaunch(value: LaunchShowOption => Callback): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1((t0: LaunchShowOption) => value(t0).runNow()))
      
      inline def setOnPageNotFound(value: PageNotFoundOption => Callback): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1((t0: PageNotFoundOption) => value(t0).runNow()))
      
      inline def setOnShow(value: LaunchShowOption => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: LaunchShowOption) => value(t0).runNow()))
      
      inline def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Callback): Self = StObject.set(x, "onThemeChange", js.Any.fromFunction1((t0: /* result */ OnThemeChangeCallbackResult) => value(t0).runNow()))
      
      inline def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Callback): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1((t0: /* result */ OnUnhandledRejectionCallbackResult) => value(t0).runNow()))
    }
  }
  
  type Options[T /* <: IAnyObject */] = PartialOption & T & ThisType[Instance[T]]
  
  trait PageNotFoundOption extends StObject {
    
    /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
    var isEntryPage: Boolean
    
    /** 不存在页面的路径 */
    var path: String
    
    /** 打开不存在页面的 query */
    var query: IAnyObject
  }
  object PageNotFoundOption {
    
    inline def apply(isEntryPage: Boolean, path: String, query: IAnyObject): PageNotFoundOption = {
      val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageNotFoundOption]
    }
    
    extension [Self <: PageNotFoundOption](x: Self) {
      
      inline def setIsEntryPage(value: Boolean): Self = StObject.set(x, "isEntryPage", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferrerInfo extends StObject {
    
    /** 来源小程序或公众号或App的 appId
      *
      * 以下场景支持返回 referrerInfo.appId：
      * - 1020（公众号 profile 页相关小程序列表）： appId
      * - 1035（公众号自定义菜单）：来源公众号 appId
      * - 1036（App 分享消息卡片）：来源应用 appId
      * - 1037（小程序打开小程序）：来源小程序 appId
      * - 1038（从另一个小程序返回）：来源小程序 appId
      * - 1043（公众号模板消息）：来源公众号 appId
      */
    var appId: String
    
    /** 来源小程序传过来的数据，scene=1037或1038时支持 */
    var extraData: js.UndefOr[Any] = js.undefined
  }
  object ReferrerInfo {
    
    inline def apply(appId: String): typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo]
    }
    
    extension [Self <: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1001`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1005`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1006`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1007`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1008`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1011`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1012`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1013`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1014`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1017`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1019`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1020`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1023`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1024`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1025`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1026`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1027`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1028`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1029`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1030`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1031`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1032`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1034`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1035`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1036`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1037`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1038`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1039`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1042`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1043`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1044`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1045`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1046`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1047`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1048`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1049`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1052`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1053`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1056`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1057`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1058`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1059`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1064`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1067`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1069`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1071`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1072`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1073`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1074`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1077`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1078`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1079`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1081`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1082`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1084`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1089`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1090`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1091`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1092`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1095`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1096`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1097`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1099`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1102`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1124`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1125`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1126`
    - typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1129`
  */
  trait SceneValues extends StObject
  object SceneValues {
    
    inline def `1001`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1001` = 1001.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1001`]
    
    inline def `1005`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1005` = 1005.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1005`]
    
    inline def `1006`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1006` = 1006.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1006`]
    
    inline def `1007`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1007` = 1007.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1007`]
    
    inline def `1008`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1008` = 1008.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1008`]
    
    inline def `1011`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1011` = 1011.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1011`]
    
    inline def `1012`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1012` = 1012.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1012`]
    
    inline def `1013`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1013` = 1013.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1013`]
    
    inline def `1014`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1014` = 1014.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1014`]
    
    inline def `1017`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1017` = 1017.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1017`]
    
    inline def `1019`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1019` = 1019.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1019`]
    
    inline def `1020`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1020` = 1020.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1020`]
    
    inline def `1023`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1023` = 1023.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1023`]
    
    inline def `1024`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1024` = 1024.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1024`]
    
    inline def `1025`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1025` = 1025.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1025`]
    
    inline def `1026`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1026` = 1026.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1026`]
    
    inline def `1027`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1027` = 1027.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1027`]
    
    inline def `1028`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1028` = 1028.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1028`]
    
    inline def `1029`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1029` = 1029.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1029`]
    
    inline def `1030`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1030` = 1030.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1030`]
    
    inline def `1031`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1031` = 1031.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1031`]
    
    inline def `1032`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1032` = 1032.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1032`]
    
    inline def `1034`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1034` = 1034.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1034`]
    
    inline def `1035`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1035` = 1035.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1035`]
    
    inline def `1036`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1036` = 1036.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1036`]
    
    inline def `1037`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1037` = 1037.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1037`]
    
    inline def `1038`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1038` = 1038.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1038`]
    
    inline def `1039`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1039` = 1039.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1039`]
    
    inline def `1042`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1042` = 1042.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1042`]
    
    inline def `1043`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1043` = 1043.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1043`]
    
    inline def `1044`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1044` = 1044.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1044`]
    
    inline def `1045`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1045` = 1045.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1045`]
    
    inline def `1046`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1046` = 1046.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1046`]
    
    inline def `1047`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1047` = 1047.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1047`]
    
    inline def `1048`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1048` = 1048.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1048`]
    
    inline def `1049`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1049` = 1049.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1049`]
    
    inline def `1052`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1052` = 1052.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1052`]
    
    inline def `1053`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1053` = 1053.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1053`]
    
    inline def `1056`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1056` = 1056.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1056`]
    
    inline def `1057`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1057` = 1057.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1057`]
    
    inline def `1058`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1058` = 1058.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1058`]
    
    inline def `1059`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1059` = 1059.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1059`]
    
    inline def `1064`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1064` = 1064.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1064`]
    
    inline def `1067`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1067` = 1067.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1067`]
    
    inline def `1069`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1069` = 1069.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1069`]
    
    inline def `1071`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1071` = 1071.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1071`]
    
    inline def `1072`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1072` = 1072.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1072`]
    
    inline def `1073`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1073` = 1073.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1073`]
    
    inline def `1074`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1074` = 1074.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1074`]
    
    inline def `1077`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1077` = 1077.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1077`]
    
    inline def `1078`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1078` = 1078.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1078`]
    
    inline def `1079`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1079` = 1079.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1079`]
    
    inline def `1081`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1081` = 1081.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1081`]
    
    inline def `1082`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1082` = 1082.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1082`]
    
    inline def `1084`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1084` = 1084.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1084`]
    
    inline def `1089`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1089` = 1089.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1089`]
    
    inline def `1090`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1090` = 1090.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1090`]
    
    inline def `1091`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1091` = 1091.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1091`]
    
    inline def `1092`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1092` = 1092.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1092`]
    
    inline def `1095`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1095` = 1095.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1095`]
    
    inline def `1096`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1096` = 1096.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1096`]
    
    inline def `1097`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1097` = 1097.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1097`]
    
    inline def `1099`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1099` = 1099.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1099`]
    
    inline def `1102`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1102` = 1102.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1102`]
    
    inline def `1124`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1124` = 1124.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1124`]
    
    inline def `1125`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1125` = 1125.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1125`]
    
    inline def `1126`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1126` = 1126.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1126`]
    
    inline def `1129`: typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1129` = 1129.asInstanceOf[typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1129`]
  }
  
  type TrivialInstance = Instance[IAnyObject]
}
