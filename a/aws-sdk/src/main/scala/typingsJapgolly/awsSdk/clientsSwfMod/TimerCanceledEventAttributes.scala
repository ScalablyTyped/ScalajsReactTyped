package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerCanceledEventAttributes extends StObject {
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelTimer decision to cancel this timer. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The unique ID of the timer that was canceled.
    */
  var timerId: TimerId
}
object TimerCanceledEventAttributes {
  
  inline def apply(decisionTaskCompletedEventId: EventId, startedEventId: EventId, timerId: TimerId): TimerCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerCanceledEventAttributes]
  }
  
  extension [Self <: TimerCanceledEventAttributes](x: Self) {
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
