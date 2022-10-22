package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeableProps extends StObject {
  
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SwipeableProps {
  
  inline def apply(): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProps]
  }
  
  extension [Self <: SwipeableProps](x: Self) {
    
    inline def setConfig(value: SwipeableConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setOnMouseDown(value: Callback): Self = StObject.set(x, "onMouseDown", value.toJsFn)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnSwipeDown(value: Callback): Self = StObject.set(x, "onSwipeDown", value.toJsFn)
    
    inline def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
    
    inline def setOnSwipeLeft(value: Callback): Self = StObject.set(x, "onSwipeLeft", value.toJsFn)
    
    inline def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
    
    inline def setOnSwipeRight(value: Callback): Self = StObject.set(x, "onSwipeRight", value.toJsFn)
    
    inline def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
    
    inline def setOnSwipeUp(value: Callback): Self = StObject.set(x, "onSwipeUp", value.toJsFn)
    
    inline def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
    
    inline def setOnTouchStart(value: Callback): Self = StObject.set(x, "onTouchStart", value.toJsFn)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
