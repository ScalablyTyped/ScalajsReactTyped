package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionTimedOutEventAttributes extends StObject {
  
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the ActivityTaskStarted event that was recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined
}
object LambdaFunctionTimedOutEventAttributes {
  
  inline def apply(scheduledEventId: EventId, startedEventId: EventId): LambdaFunctionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
  }
  
  extension [Self <: LambdaFunctionTimedOutEventAttributes](x: Self) {
    
    inline def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTimeoutType(value: LambdaFunctionTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
    
    inline def setTimeoutTypeUndefined: Self = StObject.set(x, "timeoutType", js.undefined)
  }
}
