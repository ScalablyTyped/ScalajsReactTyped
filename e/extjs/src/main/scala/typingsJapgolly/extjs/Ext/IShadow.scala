package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShadow
  extends StObject
     with IBase {
  
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** [Method] Direct alignment when values are already available
    * @param left Number The target element left position
    * @param top Number The target element top position
    * @param width Number The target element width
    * @param height Number The target element height
    */
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[Double], 
      /* top */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the opacity of the shadow
    * @param opacity Number The opacity
    */
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Adjust the z index of this shadow
    * @param zindex Number The new z-index
    */
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Displays the shadow under the target element
    * @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
    */
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[Any], Unit]] = js.undefined
}
object IShadow {
  
  inline def apply(): IShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadow]
  }
  
  extension [Self <: IShadow](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setIsVisible(value: Callback): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRealign(
      value: (/* left */ js.UndefOr[Double], /* top */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "realign", js.Any.fromFunction4((t0: /* left */ js.UndefOr[Double], t1: /* top */ js.UndefOr[Double], t2: /* width */ js.UndefOr[Double], t3: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRealignUndefined: Self = StObject.set(x, "realign", js.undefined)
    
    inline def setSetOpacity(value: /* opacity */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: /* opacity */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetOpacityUndefined: Self = StObject.set(x, "setOpacity", js.undefined)
    
    inline def setSetZIndex(value: /* zindex */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1((t0: /* zindex */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
    
    inline def setShow(value: /* targetEl */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* targetEl */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
