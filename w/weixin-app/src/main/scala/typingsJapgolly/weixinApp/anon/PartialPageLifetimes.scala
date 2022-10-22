package typingsJapgolly.weixinApp.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<weixin-app.wx.PageLifetimes> */
trait PartialPageLifetimes extends StObject {
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
