package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import typingsJapgolly.antdMobile.esUtilsUseTouchMod.Direction
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaX extends StObject {
  
  var deltaX: MutableRefObject[Double]
  
  var deltaY: MutableRefObject[Double]
  
  var direction: MutableRefObject[Direction]
  
  def isHorizontal(): Boolean
  
  def isVertical(): Boolean
  
  var move: EventListener
  
  var offsetX: MutableRefObject[Double]
  
  var offsetY: MutableRefObject[Double]
  
  def reset(): Unit
  
  var start: EventListener
  
  var startX: MutableRefObject[Double]
  
  var startY: MutableRefObject[Double]
}
object DeltaX {
  
  inline def apply(
    deltaX: MutableRefObject[Double],
    deltaY: MutableRefObject[Double],
    direction: MutableRefObject[Direction],
    isHorizontal: CallbackTo[Boolean],
    isVertical: CallbackTo[Boolean],
    move: /* evt */ Event => Callback,
    offsetX: MutableRefObject[Double],
    offsetY: MutableRefObject[Double],
    reset: Callback,
    start: /* evt */ Event => Callback,
    startX: MutableRefObject[Double],
    startY: MutableRefObject[Double]
  ): DeltaX = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isHorizontal = isHorizontal.toJsFn, isVertical = isVertical.toJsFn, move = js.Any.fromFunction1((t0: /* evt */ Event) => move(t0).runNow()), offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], reset = reset.toJsFn, start = js.Any.fromFunction1((t0: /* evt */ Event) => start(t0).runNow()), startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaX]
  }
  
  extension [Self <: DeltaX](x: Self) {
    
    inline def setDeltaX(value: MutableRefObject[Double]): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: MutableRefObject[Double]): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: MutableRefObject[Direction]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontal(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHorizontal", value.toJsFn)
    
    inline def setIsVertical(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVertical", value.toJsFn)
    
    inline def setMove(value: /* evt */ Event => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    
    inline def setOffsetX(value: MutableRefObject[Double]): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: MutableRefObject[Double]): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setStart(value: /* evt */ Event => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    
    inline def setStartX(value: MutableRefObject[Double]): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: MutableRefObject[Double]): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
  }
}
