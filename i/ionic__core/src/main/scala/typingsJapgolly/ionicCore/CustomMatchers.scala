package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMatchers[R] extends StObject {
  
  /**
    * Will check if the event spy received the expected event.
    */
  def toHaveReceivedEvent(): R
  
  /**
    * Will check if the event spy received the expected event with the expected detail.
    * @param eventDetail The expected detail of the event.
    */
  def toHaveReceivedEventDetail(eventDetail: Any): R
  
  /**
    * Will check how many times the event has been received.
    */
  def toHaveReceivedEventTimes(count: Double): R
}
object CustomMatchers {
  
  inline def apply[R](
    toHaveReceivedEvent: CallbackTo[R],
    toHaveReceivedEventDetail: Any => R,
    toHaveReceivedEventTimes: Double => R
  ): CustomMatchers[R] = {
    val __obj = js.Dynamic.literal(toHaveReceivedEvent = toHaveReceivedEvent.toJsFn, toHaveReceivedEventDetail = js.Any.fromFunction1(toHaveReceivedEventDetail), toHaveReceivedEventTimes = js.Any.fromFunction1(toHaveReceivedEventTimes))
    __obj.asInstanceOf[CustomMatchers[R]]
  }
  
  extension [Self <: CustomMatchers[?], R](x: Self & CustomMatchers[R]) {
    
    inline def setToHaveReceivedEvent(value: CallbackTo[R]): Self = StObject.set(x, "toHaveReceivedEvent", value.toJsFn)
    
    inline def setToHaveReceivedEventDetail(value: Any => R): Self = StObject.set(x, "toHaveReceivedEventDetail", js.Any.fromFunction1(value))
    
    inline def setToHaveReceivedEventTimes(value: Double => R): Self = StObject.set(x, "toHaveReceivedEventTimes", js.Any.fromFunction1(value))
  }
}
