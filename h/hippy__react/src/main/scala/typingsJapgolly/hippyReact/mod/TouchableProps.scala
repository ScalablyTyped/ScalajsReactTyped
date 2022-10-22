package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchableProps extends StObject {
  
  /**
    * The touchcancel event occurs when the touch event gets interrupted.
    *
    * @param {Object} evt - Touch event data
    * @param {number} evt.page_x - Touch coordinate X
    * @param {number} evt.page_y = Touch coordinate Y
    */
  var onTouchCancel: js.UndefOr[js.Function1[/* evt */ TouchEvent, Unit]] = js.undefined
  
  /**
    * The touchdown event occurs when the user touches an component.
    *
    * @param {Object} evt - Touch event data
    * @param {number} evt.page_x - Touch coordinate X
    * @param {number} evt.page_y = Touch coordinate Y
    */
  var onTouchDown: js.UndefOr[js.Function1[/* evt */ TouchEvent, Unit]] = js.undefined
  
  /**
    * The touchend event occurs when the user removes the finger from an component.
    *
    * @param {Object} evt - Touch event data
    * @param {number} evt.page_x - Touch coordinate X
    * @param {number} evt.page_y = Touch coordinate Y
    */
  var onTouchEnd: js.UndefOr[js.Function1[/* evt */ TouchEvent, Unit]] = js.undefined
  
  /**
    * The touchmove event occurs when the user moves the finger across the screen.
    *
    * @param {Object} evt - Touch event data
    * @param {number} evt.page_x - Touch coordinate X
    * @param {number} evt.page_y = Touch coordinate Y
    */
  var onTouchMove: js.UndefOr[js.Function1[/* evt */ TouchEvent, Unit]] = js.undefined
}
object TouchableProps {
  
  inline def apply(): TouchableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableProps]
  }
  
  extension [Self <: TouchableProps](x: Self) {
    
    inline def setOnTouchCancel(value: /* evt */ TouchEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: /* evt */ TouchEvent) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchDown(value: /* evt */ TouchEvent => Callback): Self = StObject.set(x, "onTouchDown", js.Any.fromFunction1((t0: /* evt */ TouchEvent) => value(t0).runNow()))
    
    inline def setOnTouchDownUndefined: Self = StObject.set(x, "onTouchDown", js.undefined)
    
    inline def setOnTouchEnd(value: /* evt */ TouchEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: /* evt */ TouchEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* evt */ TouchEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: /* evt */ TouchEvent) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
  }
}
