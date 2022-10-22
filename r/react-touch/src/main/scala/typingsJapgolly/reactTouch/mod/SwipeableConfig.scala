package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeableConfig extends StObject {
  
  def onSwipeDown(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  
  def onSwipeLeft(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  
  def onSwipeRight(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
  
  def onSwipeUp(current: Double, initial: Double, callback: js.Function0[Unit]): Unit
}
object SwipeableConfig {
  
  inline def apply(
    onSwipeDown: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeLeft: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeRight: (Double, Double, js.Function0[Unit]) => Callback,
    onSwipeUp: (Double, Double, js.Function0[Unit]) => Callback
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal(onSwipeDown = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (onSwipeDown(t0, t1, t2)).runNow()), onSwipeLeft = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (onSwipeLeft(t0, t1, t2)).runNow()), onSwipeRight = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (onSwipeRight(t0, t1, t2)).runNow()), onSwipeUp = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (onSwipeUp(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[SwipeableConfig]
  }
  
  extension [Self <: SwipeableConfig](x: Self) {
    
    inline def setOnSwipeDown(value: (Double, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSwipeLeft(value: (Double, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSwipeRight(value: (Double, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSwipeUp(value: (Double, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
