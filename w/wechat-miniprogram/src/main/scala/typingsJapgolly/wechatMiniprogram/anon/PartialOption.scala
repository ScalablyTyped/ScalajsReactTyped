package typingsJapgolly.wechatMiniprogram.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.LaunchShowOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.PageNotFoundOption
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallback
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.OnThemeChangeCallbackResult
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallback
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.OnUnhandledRejectionCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.App.Option> */
trait PartialOption extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLaunch: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.undefined
  
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* options */ LaunchShowOption, Unit]] = js.undefined
  
  var onThemeChange: js.UndefOr[OnThemeChangeCallback] = js.undefined
  
  var onUnhandledRejection: js.UndefOr[OnUnhandledRejectionCallback] = js.undefined
}
object PartialOption {
  
  inline def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  
  extension [Self <: PartialOption](x: Self) {
    
    inline def setOnError(value: /* error */ String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: /* options */ LaunchShowOption => Callback): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1((t0: /* options */ LaunchShowOption) => value(t0).runNow()))
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnPageNotFound(value: /* options */ PageNotFoundOption => Callback): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1((t0: /* options */ PageNotFoundOption) => value(t0).runNow()))
    
    inline def setOnPageNotFoundUndefined: Self = StObject.set(x, "onPageNotFound", js.undefined)
    
    inline def setOnShow(value: /* options */ LaunchShowOption => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* options */ LaunchShowOption) => value(t0).runNow()))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Callback): Self = StObject.set(x, "onThemeChange", js.Any.fromFunction1((t0: /* result */ OnThemeChangeCallbackResult) => value(t0).runNow()))
    
    inline def setOnThemeChangeUndefined: Self = StObject.set(x, "onThemeChange", js.undefined)
    
    inline def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Callback): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1((t0: /* result */ OnUnhandledRejectionCallbackResult) => value(t0).runNow()))
    
    inline def setOnUnhandledRejectionUndefined: Self = StObject.set(x, "onUnhandledRejection", js.undefined)
  }
}
