package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDD
  extends StObject
     with IDragDrop {
  
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc
    * @param el HTMLElement the element to move
    * @param iPageX Number the X coordinate of the mousedown or drag event
    * @param iPageY Number the Y coordinate of the mousedown or drag event
    */
  var alignElWithMouse: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[HTMLElement], 
      /* iPageX */ js.UndefOr[Double], 
      /* iPageY */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the pointer offset to the distance between the linked element s top left corner and the location the element was
    * @param iPageX Number the X coordinate of the click
    * @param iPageY Number the Y coordinate of the click
    */
  var autoOffset: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /** [Method] Event that fires prior to the onDrag event
    * @param e Object
    */
  var b4Drag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Event that fires prior to the onMouseDown event
    * @param e Object
    */
  var b4MouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Saves the most recent position so that we can reset the constraints and tick marks on demand
    * @param iPageX Number the current x position (this just makes it so we don't have to look it up again)
    * @param iPageY Number the current y position (this just makes it so we don't have to look it up again)
    */
  var cachePosition: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /** [Property] (Boolean) */
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the pointer offset
    * @param iDeltaX Number the distance from the left
    * @param iDeltaY Number the distance from the top
    */
  var setDelta: js.UndefOr[
    js.Function2[/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th
    * @param iPageX Number the X coordinate of the mousedown or drag event
    * @param iPageY Number the Y coordinate of the mousedown or drag event
    */
  var setDragElPos: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDD: js.UndefOr[js.Function0[String]] = js.undefined
}
object IDD {
  
  inline def apply(): IDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDD]
  }
  
  extension [Self <: IDD](x: Self) {
    
    inline def setAlignElWithMouse(
      value: (/* el */ js.UndefOr[HTMLElement], /* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "alignElWithMouse", js.Any.fromFunction3((t0: /* el */ js.UndefOr[HTMLElement], t1: /* iPageX */ js.UndefOr[Double], t2: /* iPageY */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setAlignElWithMouseUndefined: Self = StObject.set(x, "alignElWithMouse", js.undefined)
    
    inline def setAutoOffset(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "autoOffset", js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[Double], t1: /* iPageY */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setAutoOffsetUndefined: Self = StObject.set(x, "autoOffset", js.undefined)
    
    inline def setB4Drag(value: /* e */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "b4Drag", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setB4DragUndefined: Self = StObject.set(x, "b4Drag", js.undefined)
    
    inline def setB4MouseDown(value: /* e */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "b4MouseDown", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setB4MouseDownUndefined: Self = StObject.set(x, "b4MouseDown", js.undefined)
    
    inline def setCachePosition(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "cachePosition", js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[Double], t1: /* iPageY */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setCachePositionUndefined: Self = StObject.set(x, "cachePosition", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSetDelta(value: (/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "setDelta", js.Any.fromFunction2((t0: /* iDeltaX */ js.UndefOr[Double], t1: /* iDeltaY */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetDeltaUndefined: Self = StObject.set(x, "setDelta", js.undefined)
    
    inline def setSetDragElPos(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "setDragElPos", js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[Double], t1: /* iPageY */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetDragElPosUndefined: Self = StObject.set(x, "setDragElPos", js.undefined)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
