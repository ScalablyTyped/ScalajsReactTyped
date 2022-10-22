package typingsJapgolly.headroom

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.headroom.anon.Bottom
import typingsJapgolly.headroom.anon.Down
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadroomOptions extends StObject {
  
  /** css classes to apply multiple classes are also supported with a space-separated list */
  var classes: js.UndefOr[Bottom] = js.undefined
  
  /** vertical offset in px before element is first unpinned */
  var offset: js.UndefOr[Down | Double] = js.undefined
  
  /** callback when at bottom of page, `this` is headroom object */
  var onBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** callback when moving away from bottom of page, `this` is headroom object */
  var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** callback when below offset, `this` is headroom object */
  var onNotTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** callback when pinned, `this` is headroom object */
  var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** callback when above offset, `this` is headroom object */
  var onTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** callback when unpinned, `this` is headroom object */
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** element to listen to scroll events on, defaults to `window` */
  var scroller: js.UndefOr[HTMLElement] = js.undefined
  
  /** scroll tolerance in px before state changes or you can specify tolerance individually for up/down scroll */
  var tolerance: js.UndefOr[Down | Double] = js.undefined
}
object HeadroomOptions {
  
  inline def apply(): HeadroomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadroomOptions]
  }
  
  extension [Self <: HeadroomOptions](x: Self) {
    
    inline def setClasses(value: Bottom): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setOffset(value: Down | Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnBottom(value: Callback): Self = StObject.set(x, "onBottom", value.toJsFn)
    
    inline def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
    
    inline def setOnNotBottom(value: Callback): Self = StObject.set(x, "onNotBottom", value.toJsFn)
    
    inline def setOnNotBottomUndefined: Self = StObject.set(x, "onNotBottom", js.undefined)
    
    inline def setOnNotTop(value: Callback): Self = StObject.set(x, "onNotTop", value.toJsFn)
    
    inline def setOnNotTopUndefined: Self = StObject.set(x, "onNotTop", js.undefined)
    
    inline def setOnPin(value: Callback): Self = StObject.set(x, "onPin", value.toJsFn)
    
    inline def setOnPinUndefined: Self = StObject.set(x, "onPin", js.undefined)
    
    inline def setOnTop(value: Callback): Self = StObject.set(x, "onTop", value.toJsFn)
    
    inline def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
    
    inline def setOnUnpin(value: Callback): Self = StObject.set(x, "onUnpin", value.toJsFn)
    
    inline def setOnUnpinUndefined: Self = StObject.set(x, "onUnpin", js.undefined)
    
    inline def setScroller(value: HTMLElement): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
    
    inline def setTolerance(value: Down | Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
