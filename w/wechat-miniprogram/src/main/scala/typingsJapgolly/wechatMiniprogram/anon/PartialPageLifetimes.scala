package typingsJapgolly.wechatMiniprogram.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Component.PageLifetimes> */
trait PartialPageLifetimes extends StObject {
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* size */ IResizeOption, Unit]] = js.undefined
  
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialPageLifetimes {
  
  inline def apply(): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageLifetimes]
  }
  
  extension [Self <: PartialPageLifetimes](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setResize(value: /* size */ IResizeOption => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: /* size */ IResizeOption) => value(t0).runNow()))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
