package typingsJapgolly.asyncStreamEmitter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-stream-emitter", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with AsyncStreamEmitter[T] {
    
    /* CompleteClass */
    override def closeAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def closeListener(eventName: String): Unit = js.native
    
    /* CompleteClass */
    override def emit(eventName: String, data: T): Unit = js.native
    
    /* CompleteClass */
    override def getAllListenersBackpressure(): Double = js.native
    
    /* CompleteClass */
    override def getAllListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    /* CompleteClass */
    override def getListenerBackpressure(eventName: String): Double = js.native
    
    /* CompleteClass */
    override def getListenerConsumerBackpressure(consumerId: Double): Double = js.native
    
    /* CompleteClass */
    override def getListenerConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    /* CompleteClass */
    override def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats] = js.native
    
    /* CompleteClass */
    override def hasAnyListenerConsumer(consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def hasListenerConsumer(eventName: String, consumerId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def killAllListeners(): Unit = js.native
    
    /* CompleteClass */
    override def killListener(eventName: String): Unit = js.native
    
    /* CompleteClass */
    override def killListenerConsumer(consumerId: Double): Unit = js.native
    
    /* CompleteClass */
    override def listener(eventName: String): typingsJapgolly.consumableStream.mod.^[T] = js.native
  }
  
  trait AsyncStreamEmitter[T] extends StObject {
    
    def closeAllListeners(): Unit
    
    def closeListener(eventName: String): Unit
    
    def emit(eventName: String, data: T): Unit
    
    def getAllListenersBackpressure(): Double
    
    def getAllListenersConsumerStatsList(): js.Array[ConsumerStats]
    
    def getListenerBackpressure(eventName: String): Double
    
    def getListenerConsumerBackpressure(consumerId: Double): Double
    
    def getListenerConsumerStats(consumerId: Double): ConsumerStats
    
    def getListenerConsumerStatsList(eventName: String): js.Array[ConsumerStats]
    
    def hasAnyListenerConsumer(consumerId: Double): Boolean
    
    def hasListenerConsumer(eventName: String, consumerId: Double): Boolean
    
    def killAllListeners(): Unit
    
    def killListener(eventName: String): Unit
    
    def killListenerConsumer(consumerId: Double): Unit
    
    def listener(eventName: String): typingsJapgolly.consumableStream.mod.^[T]
  }
  object AsyncStreamEmitter {
    
    inline def apply[T](
      closeAllListeners: Callback,
      closeListener: String => Callback,
      emit: (String, T) => Callback,
      getAllListenersBackpressure: CallbackTo[Double],
      getAllListenersConsumerStatsList: CallbackTo[js.Array[ConsumerStats]],
      getListenerBackpressure: String => Double,
      getListenerConsumerBackpressure: Double => Double,
      getListenerConsumerStats: Double => ConsumerStats,
      getListenerConsumerStatsList: String => js.Array[ConsumerStats],
      hasAnyListenerConsumer: Double => Boolean,
      hasListenerConsumer: (String, Double) => Boolean,
      killAllListeners: Callback,
      killListener: String => Callback,
      killListenerConsumer: Double => Callback,
      listener: String => typingsJapgolly.consumableStream.mod.^[T]
    ): AsyncStreamEmitter[T] = {
      val __obj = js.Dynamic.literal(closeAllListeners = closeAllListeners.toJsFn, closeListener = js.Any.fromFunction1((t0: String) => closeListener(t0).runNow()), emit = js.Any.fromFunction2((t0: String, t1: T) => (emit(t0, t1)).runNow()), getAllListenersBackpressure = getAllListenersBackpressure.toJsFn, getAllListenersConsumerStatsList = getAllListenersConsumerStatsList.toJsFn, getListenerBackpressure = js.Any.fromFunction1(getListenerBackpressure), getListenerConsumerBackpressure = js.Any.fromFunction1(getListenerConsumerBackpressure), getListenerConsumerStats = js.Any.fromFunction1(getListenerConsumerStats), getListenerConsumerStatsList = js.Any.fromFunction1(getListenerConsumerStatsList), hasAnyListenerConsumer = js.Any.fromFunction1(hasAnyListenerConsumer), hasListenerConsumer = js.Any.fromFunction2(hasListenerConsumer), killAllListeners = killAllListeners.toJsFn, killListener = js.Any.fromFunction1((t0: String) => killListener(t0).runNow()), killListenerConsumer = js.Any.fromFunction1((t0: Double) => killListenerConsumer(t0).runNow()), listener = js.Any.fromFunction1(listener))
      __obj.asInstanceOf[AsyncStreamEmitter[T]]
    }
    
    extension [Self <: AsyncStreamEmitter[?], T](x: Self & AsyncStreamEmitter[T]) {
      
      inline def setCloseAllListeners(value: Callback): Self = StObject.set(x, "closeAllListeners", value.toJsFn)
      
      inline def setCloseListener(value: String => Callback): Self = StObject.set(x, "closeListener", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEmit(value: (String, T) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: T) => (value(t0, t1)).runNow()))
      
      inline def setGetAllListenersBackpressure(value: CallbackTo[Double]): Self = StObject.set(x, "getAllListenersBackpressure", value.toJsFn)
      
      inline def setGetAllListenersConsumerStatsList(value: CallbackTo[js.Array[ConsumerStats]]): Self = StObject.set(x, "getAllListenersConsumerStatsList", value.toJsFn)
      
      inline def setGetListenerBackpressure(value: String => Double): Self = StObject.set(x, "getListenerBackpressure", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerBackpressure(value: Double => Double): Self = StObject.set(x, "getListenerConsumerBackpressure", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerStats(value: Double => ConsumerStats): Self = StObject.set(x, "getListenerConsumerStats", js.Any.fromFunction1(value))
      
      inline def setGetListenerConsumerStatsList(value: String => js.Array[ConsumerStats]): Self = StObject.set(x, "getListenerConsumerStatsList", js.Any.fromFunction1(value))
      
      inline def setHasAnyListenerConsumer(value: Double => Boolean): Self = StObject.set(x, "hasAnyListenerConsumer", js.Any.fromFunction1(value))
      
      inline def setHasListenerConsumer(value: (String, Double) => Boolean): Self = StObject.set(x, "hasListenerConsumer", js.Any.fromFunction2(value))
      
      inline def setKillAllListeners(value: Callback): Self = StObject.set(x, "killAllListeners", value.toJsFn)
      
      inline def setKillListener(value: String => Callback): Self = StObject.set(x, "killListener", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setKillListenerConsumer(value: Double => Callback): Self = StObject.set(x, "killListenerConsumer", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setListener(value: String => typingsJapgolly.consumableStream.mod.^[T]): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    }
  }
}
