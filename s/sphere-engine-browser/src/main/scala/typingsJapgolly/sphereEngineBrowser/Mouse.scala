package typingsJapgolly.sphereEngineBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a mouse-like pointing device.
  */
trait Mouse extends StObject {
  
  /** Clear any events from the mouse queue that haven't yet been retrieved with `getEvent`. */
  def clearQueue(): Unit
  
  /**
    * Get the next event in the mouse queue. The event is removed from the queue.
    * @returns A `MouseEvent` object describing the event retrieved, if any.
    */
  def getEvent(): MouseEvent
  
  /**
    * Get a Boolean value indicating whether a given mouse button is currently pressed down.
    * @param key A member of `MouseKey` naming the mouse button to check.
    * @returns `true` if the button is currently pressed down, otherwise `false`.
    */
  def isPressed(key: MouseKey): Boolean
  
  /**
    * 2D position of the mouse cursor in pixels, relative to the top-left corner of the game,
    * represented as a two-element array (2-tuple).
    */
  val position: js.Tuple2[Double, Double]
  
  /** X coordinate of the mouse cursor in pixels, relative to the top-left corner of the game. */
  val x: Double
  
  /** Y coordinate of the mouse cursor in pixels, relative to the top-left corner of the game. */
  val y: Double
}
object Mouse {
  
  inline def apply(
    clearQueue: Callback,
    getEvent: CallbackTo[MouseEvent],
    isPressed: MouseKey => Boolean,
    position: js.Tuple2[Double, Double],
    x: Double,
    y: Double
  ): Mouse = {
    val __obj = js.Dynamic.literal(clearQueue = clearQueue.toJsFn, getEvent = getEvent.toJsFn, isPressed = js.Any.fromFunction1(isPressed), position = position.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mouse]
  }
  
  extension [Self <: Mouse](x: Self) {
    
    inline def setClearQueue(value: Callback): Self = StObject.set(x, "clearQueue", value.toJsFn)
    
    inline def setGetEvent(value: CallbackTo[MouseEvent]): Self = StObject.set(x, "getEvent", value.toJsFn)
    
    inline def setIsPressed(value: MouseKey => Boolean): Self = StObject.set(x, "isPressed", js.Any.fromFunction1(value))
    
    inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
