package typingsJapgolly.sentryTypes

import typingsJapgolly.sentryTypes.typesDatacategoryMod.DataCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientreportMod {
  
  trait ClientReport extends StObject {
    
    var discarded_events: js.Array[Outcome]
    
    var timestamp: Double
  }
  object ClientReport {
    
    inline def apply(discarded_events: js.Array[Outcome], timestamp: Double): ClientReport = {
      val __obj = js.Dynamic.literal(discarded_events = discarded_events.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientReport]
    }
    
    extension [Self <: ClientReport](x: Self) {
      
      inline def setDiscarded_events(value: js.Array[Outcome]): Self = StObject.set(x, "discarded_events", value.asInstanceOf[js.Any])
      
      inline def setDiscarded_eventsVarargs(value: Outcome*): Self = StObject.set(x, "discarded_events", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.before_send
    - typingsJapgolly.sentryTypes.sentryTypesStrings.event_processor
    - typingsJapgolly.sentryTypes.sentryTypesStrings.network_error
    - typingsJapgolly.sentryTypes.sentryTypesStrings.queue_overflow
    - typingsJapgolly.sentryTypes.sentryTypesStrings.ratelimit_backoff
    - typingsJapgolly.sentryTypes.sentryTypesStrings.sample_rate
  */
  trait EventDropReason extends StObject
  object EventDropReason {
    
    inline def before_send: typingsJapgolly.sentryTypes.sentryTypesStrings.before_send = "before_send".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.before_send]
    
    inline def event_processor: typingsJapgolly.sentryTypes.sentryTypesStrings.event_processor = "event_processor".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.event_processor]
    
    inline def network_error: typingsJapgolly.sentryTypes.sentryTypesStrings.network_error = "network_error".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.network_error]
    
    inline def queue_overflow: typingsJapgolly.sentryTypes.sentryTypesStrings.queue_overflow = "queue_overflow".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.queue_overflow]
    
    inline def ratelimit_backoff: typingsJapgolly.sentryTypes.sentryTypesStrings.ratelimit_backoff = "ratelimit_backoff".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.ratelimit_backoff]
    
    inline def sample_rate: typingsJapgolly.sentryTypes.sentryTypesStrings.sample_rate = "sample_rate".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.sample_rate]
  }
  
  trait Outcome extends StObject {
    
    var category: DataCategory
    
    var quantity: Double
    
    var reason: EventDropReason
  }
  object Outcome {
    
    inline def apply(category: DataCategory, quantity: Double, reason: EventDropReason): Outcome = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Outcome]
    }
    
    extension [Self <: Outcome](x: Self) {
      
      inline def setCategory(value: DataCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setReason(value: EventDropReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
