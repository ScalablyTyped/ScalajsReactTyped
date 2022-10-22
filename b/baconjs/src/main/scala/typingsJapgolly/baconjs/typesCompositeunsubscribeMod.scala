package typingsJapgolly.baconjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baconjs.typesTypesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompositeunsubscribeMod {
  
  @JSImport("baconjs/types/compositeunsubscribe", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CompositeUnsubscribe {
    def this(ss: js.Array[Subscription]) = this()
    
    /* CompleteClass */
    override def add(subscription: Subscription): Unit = js.native
    
    /* CompleteClass */
    override def count(): Double = js.native
    
    /* CompleteClass */
    override def empty(): Boolean = js.native
    
    /* CompleteClass */
    override def remove(unsub: Unsub): Unit = js.native
    
    /* CompleteClass */
    var starting: js.Array[Subscription] = js.native
    
    /* CompleteClass */
    var subscriptions: js.Array[Unsub] = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
    
    /* CompleteClass */
    var unsubscribed: Boolean = js.native
  }
  
  trait CompositeUnsubscribe extends StObject {
    
    def add(subscription: Subscription): Unit
    
    def count(): Double
    
    def empty(): Boolean
    
    def remove(unsub: Unsub): Unit
    
    var starting: js.Array[Subscription]
    
    var subscriptions: js.Array[Unsub]
    
    def unsubscribe(): Unit
    
    var unsubscribed: Boolean
  }
  object CompositeUnsubscribe {
    
    inline def apply(
      add: Subscription => Callback,
      count: CallbackTo[Double],
      empty: CallbackTo[Boolean],
      remove: Unsub => Callback,
      starting: js.Array[Subscription],
      subscriptions: js.Array[Unsub],
      unsubscribe: Callback,
      unsubscribed: Boolean
    ): CompositeUnsubscribe = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Subscription) => add(t0).runNow()), count = count.toJsFn, empty = empty.toJsFn, remove = js.Any.fromFunction1((t0: Unsub) => remove(t0).runNow()), starting = starting.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribe = unsubscribe.toJsFn, unsubscribed = unsubscribed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeUnsubscribe]
    }
    
    extension [Self <: CompositeUnsubscribe](x: Self) {
      
      inline def setAdd(value: Subscription => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Subscription) => value(t0).runNow()))
      
      inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setRemove(value: Unsub => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Unsub) => value(t0).runNow()))
      
      inline def setStarting(value: js.Array[Subscription]): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
      
      inline def setStartingVarargs(value: Subscription*): Self = StObject.set(x, "starting", js.Array(value*))
      
      inline def setSubscriptions(value: js.Array[Unsub]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: Unsub*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
      
      inline def setUnsubscribed(value: Boolean): Self = StObject.set(x, "unsubscribed", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscription = js.Function2[/* unsubAll */ Unsub, /* unsubMe */ Unsub, Unsub]
}
