package typingsJapgolly.wechatMiniprogram.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesContent
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IAddToFavoritesOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.ICustomShareContent
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.ICustomTimelineContent
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IPageScrollOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IShareAppMessageOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.ITabItemTapOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> */
trait PartialILifetime extends StObject {
  
  var onAddToFavorites: js.UndefOr[js.Function1[/* options */ IAddToFavoritesOption, IAddToFavoritesContent]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  
  var onLoad: js.UndefOr[
    js.Function1[/* query */ Record[String, js.UndefOr[String]], Unit | js.Promise[Unit]]
  ] = js.undefined
  
  var onPageScroll: js.UndefOr[js.Function1[/* options */ IPageScrollOption, Unit | js.Promise[Unit]]] = js.undefined
  
  var onPullDownRefresh: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  
  var onReachBottom: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  
  var onReady: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  
  var onResize: js.UndefOr[js.Function1[/* options */ IResizeOption, Unit | js.Promise[Unit]]] = js.undefined
  
  var onShareAppMessage: js.UndefOr[js.Function1[/* options */ IShareAppMessageOption, ICustomShareContent | Unit]] = js.undefined
  
  var onShareTimeline: js.UndefOr[js.Function0[ICustomTimelineContent | Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  
  var onTabItemTap: js.UndefOr[js.Function1[/* options */ ITabItemTapOption, Unit | js.Promise[Unit]]] = js.undefined
  
  var onUnload: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
}
object PartialILifetime {
  
  inline def apply(): PartialILifetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialILifetime]
  }
  
  extension [Self <: PartialILifetime](x: Self) {
    
    inline def setOnAddToFavorites(value: /* options */ IAddToFavoritesOption => IAddToFavoritesContent): Self = StObject.set(x, "onAddToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnAddToFavoritesUndefined: Self = StObject.set(x, "onAddToFavorites", js.undefined)
    
    inline def setOnHide(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLoad(value: /* query */ Record[String, js.UndefOr[String]] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnPageScroll(value: /* options */ IPageScrollOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    inline def setOnPullDownRefresh(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onPullDownRefresh", value.toJsFn)
    
    inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    inline def setOnReachBottom(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onReachBottom", value.toJsFn)
    
    inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    inline def setOnReady(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnResize(value: /* options */ IResizeOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnShareAppMessage(value: /* options */ IShareAppMessageOption => ICustomShareContent | Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    inline def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
    
    inline def setOnShareTimeline(value: CallbackTo[ICustomTimelineContent | Unit]): Self = StObject.set(x, "onShareTimeline", value.toJsFn)
    
    inline def setOnShareTimelineUndefined: Self = StObject.set(x, "onShareTimeline", js.undefined)
    
    inline def setOnShow(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnTabItemTap(value: /* options */ ITabItemTapOption => Unit | js.Promise[Unit]): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    inline def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    inline def setOnUnload(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onUnload", value.toJsFn)
    
    inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
