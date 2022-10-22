package typingsJapgolly.paper.paper

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Event object is the base class for any of the other event types,
  * such as {@link MouseEvent}, {@link ToolEvent} and {@link KeyEvent}.
  */
trait Event extends StObject {
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @see Key.modifiers
    */
  val modifiers: Any
  
  /** 
    * Cancels the event if it is cancelable, without stopping further
    * propagation of the event.
    */
  def preventDefault(): Unit
  
  /** 
    * Cancels the event if it is cancelable, and stops stopping further
    * propagation of the event. This is has the same effect as calling both
    * {@link #stopPropagation} and {@link #preventDefault}.
    * 
    * Any handler can also return `false` to indicate that `stop()` should be
    * called right after.
    */
  def stop(): Unit
  
  /** 
    * Prevents further propagation of the current event.
    */
  def stopPropagation(): Unit
  
  /** 
    * The time at which the event was created, in milliseconds since the epoch.
    */
  val timeStamp: Double
}
object Event {
  
  inline def apply(
    modifiers: Any,
    preventDefault: Callback,
    stop: Callback,
    stopPropagation: Callback,
    timeStamp: Double
  ): Event = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stop = stop.toJsFn, stopPropagation = stopPropagation.toJsFn, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setModifiers(value: Any): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
