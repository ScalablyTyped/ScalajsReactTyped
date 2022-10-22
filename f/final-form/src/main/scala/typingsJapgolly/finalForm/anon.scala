package typingsJapgolly.finalForm

import japgolly.scalajs.react.Callback
import typingsJapgolly.finalForm.mod.Subscriber
import typingsJapgolly.finalForm.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Notified[T /* <: js.Object */] extends StObject {
    
    var notified: Boolean
    
    def subscriber(value: T): Unit
    @JSName("subscriber")
    var subscriber_Original: Subscriber[T]
    
    var subscription: Subscription
  }
  object Notified {
    
    inline def apply[T /* <: js.Object */](notified: Boolean, subscriber: T => Callback, subscription: Subscription): Notified[T] = {
      val __obj = js.Dynamic.literal(notified = notified.asInstanceOf[js.Any], subscriber = js.Any.fromFunction1((t0: T) => subscriber(t0).runNow()), subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notified[T]]
    }
    
    extension [Self <: Notified[?], T /* <: js.Object */](x: Self & Notified[T]) {
      
      inline def setNotified(value: Boolean): Self = StObject.set(x, "notified", value.asInstanceOf[js.Any])
      
      inline def setSubscriber(value: T => Callback): Self = StObject.set(x, "subscriber", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
}
