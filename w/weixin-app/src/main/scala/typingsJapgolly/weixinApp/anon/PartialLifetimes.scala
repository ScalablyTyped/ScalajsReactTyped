package typingsJapgolly.weixinApp.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<weixin-app.wx.Lifetimes> */
trait PartialLifetimes extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialLifetimes {
  
  inline def apply(): PartialLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLifetimes]
  }
  
  extension [Self <: PartialLifetimes](x: Self) {
    
    inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setMoved(value: Callback): Self = StObject.set(x, "moved", value.toJsFn)
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
