package typingsJapgolly.postal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscriptionDefinition[T] extends StObject {
  
  def callback(data: T, envelope: IEnvelope[T]): Unit
  @JSName("callback")
  var callback_Original: ICallback[T]
  
  var channel: String
  
  // after and before lack documentation
  def constraint(predicateFn: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]): ISubscriptionDefinition[T]
  
  def constraints(predicateFns: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]]): ISubscriptionDefinition[T]
  
  def context(theContext: Any): ISubscriptionDefinition[T]
  
  def debounce(interval: Double): ISubscriptionDefinition[T]
  
  def defer(): ISubscriptionDefinition[T]
  
  def delay(waitTime: Double): ISubscriptionDefinition[T]
  
  def disposeAfter(maxCalls: Double): ISubscriptionDefinition[T]
  
  def distinct(): ISubscriptionDefinition[T]
  
  def distinctUntilChanged(): ISubscriptionDefinition[T]
  
  def logError(): ISubscriptionDefinition[T]
  
  def once(): ISubscriptionDefinition[T]
  
  def subscribe(callback: ICallback[T]): ISubscriptionDefinition[T]
  
  def throttle(interval: Double): ISubscriptionDefinition[T]
  
  var topic: String
  
  def unsubscribe(): Unit
}
object ISubscriptionDefinition {
  
  inline def apply[T](
    callback: (T, /* envelope */ IEnvelope[T]) => Callback,
    channel: String,
    constraint: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean] => ISubscriptionDefinition[T],
    constraints: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]] => ISubscriptionDefinition[T],
    context: Any => ISubscriptionDefinition[T],
    debounce: Double => ISubscriptionDefinition[T],
    defer: CallbackTo[ISubscriptionDefinition[T]],
    delay: Double => ISubscriptionDefinition[T],
    disposeAfter: Double => ISubscriptionDefinition[T],
    distinct: CallbackTo[ISubscriptionDefinition[T]],
    distinctUntilChanged: CallbackTo[ISubscriptionDefinition[T]],
    logError: CallbackTo[ISubscriptionDefinition[T]],
    once: CallbackTo[ISubscriptionDefinition[T]],
    subscribe: ICallback[T] => ISubscriptionDefinition[T],
    throttle: Double => ISubscriptionDefinition[T],
    topic: String,
    unsubscribe: Callback
  ): ISubscriptionDefinition[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: T, t1: /* envelope */ IEnvelope[T]) => (callback(t0, t1)).runNow()), channel = channel.asInstanceOf[js.Any], constraint = js.Any.fromFunction1(constraint), constraints = js.Any.fromFunction1(constraints), context = js.Any.fromFunction1(context), debounce = js.Any.fromFunction1(debounce), defer = defer.toJsFn, delay = js.Any.fromFunction1(delay), disposeAfter = js.Any.fromFunction1(disposeAfter), distinct = distinct.toJsFn, distinctUntilChanged = distinctUntilChanged.toJsFn, logError = logError.toJsFn, once = once.toJsFn, subscribe = js.Any.fromFunction1(subscribe), throttle = js.Any.fromFunction1(throttle), topic = topic.asInstanceOf[js.Any], unsubscribe = unsubscribe.toJsFn)
    __obj.asInstanceOf[ISubscriptionDefinition[T]]
  }
  
  extension [Self <: ISubscriptionDefinition[?], T](x: Self & ISubscriptionDefinition[T]) {
    
    inline def setCallback(value: (T, /* envelope */ IEnvelope[T]) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: T, t1: /* envelope */ IEnvelope[T]) => (value(t0, t1)).runNow()))
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConstraint(
      value: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean] => ISubscriptionDefinition[T]
    ): Self = StObject.set(x, "constraint", js.Any.fromFunction1(value))
    
    inline def setConstraints(
      value: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]] => ISubscriptionDefinition[T]
    ): Self = StObject.set(x, "constraints", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => ISubscriptionDefinition[T]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setDebounce(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "debounce", js.Any.fromFunction1(value))
    
    inline def setDefer(value: CallbackTo[ISubscriptionDefinition[T]]): Self = StObject.set(x, "defer", value.toJsFn)
    
    inline def setDelay(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setDisposeAfter(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "disposeAfter", js.Any.fromFunction1(value))
    
    inline def setDistinct(value: CallbackTo[ISubscriptionDefinition[T]]): Self = StObject.set(x, "distinct", value.toJsFn)
    
    inline def setDistinctUntilChanged(value: CallbackTo[ISubscriptionDefinition[T]]): Self = StObject.set(x, "distinctUntilChanged", value.toJsFn)
    
    inline def setLogError(value: CallbackTo[ISubscriptionDefinition[T]]): Self = StObject.set(x, "logError", value.toJsFn)
    
    inline def setOnce(value: CallbackTo[ISubscriptionDefinition[T]]): Self = StObject.set(x, "once", value.toJsFn)
    
    inline def setSubscribe(value: ICallback[T] => ISubscriptionDefinition[T]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setThrottle(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "throttle", js.Any.fromFunction1(value))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
