package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var initialize: js.UndefOr[js.Function1[/* map */ Map, HTMLElement]] = js.undefined
  
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Overlay {
  
  inline def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  
  extension [Self <: Overlay](x: Self) {
    
    inline def setDraw(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setHide(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInitialize(value: /* map */ Map => HTMLElement): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setShow(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
