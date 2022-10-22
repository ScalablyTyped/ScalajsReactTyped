package typingsJapgolly.eventIterator

import japgolly.scalajs.react.Callback
import typingsJapgolly.eventIterator.anon.PartialEventIteratorOptio
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventIteratorMod {
  
  @JSImport("event-iterator/lib/event-iterator", JSImport.Default)
  @js.native
  open class default[T] protected () extends EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/event-iterator", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  trait EventHandlers extends StObject {
    
    def highWater(): Unit
    
    def lowWater(): Unit
  }
  object EventHandlers {
    
    inline def apply(highWater: Callback, lowWater: Callback): EventHandlers = {
      val __obj = js.Dynamic.literal(highWater = highWater.toJsFn, lowWater = lowWater.toJsFn)
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setHighWater(value: Callback): Self = StObject.set(x, "highWater", value.toJsFn)
      
      inline def setLowWater(value: Callback): Self = StObject.set(x, "lowWater", value.toJsFn)
    }
  }
  
  trait EventIteratorOptions extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var lowWaterMark: js.UndefOr[Double] = js.undefined
  }
  object EventIteratorOptions {
    
    inline def apply(): EventIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventIteratorOptions]
    }
    
    extension [Self <: EventIteratorOptions](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLowWaterMark(value: Double): Self = StObject.set(x, "lowWaterMark", value.asInstanceOf[js.Any])
      
      inline def setLowWaterMarkUndefined: Self = StObject.set(x, "lowWaterMark", js.undefined)
    }
  }
  
  type ListenHandler[T] = js.Function1[/* queue */ Queue[T], Unit | RemoveHandler]
  
  trait Queue[T] extends StObject {
    
    def fail(error: js.Error): Unit
    
    def on[E /* <: QueueEvent */](
      event: E,
      fn: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any
    ): Unit
    
    def push(value: T): Unit
    
    def stop(): Unit
  }
  object Queue {
    
    inline def apply[T](
      fail: js.Error => Callback,
      on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Callback,
      push: T => Callback,
      stop: Callback
    ): Queue[T] = {
      val __obj = js.Dynamic.literal(fail = js.Any.fromFunction1((t0: js.Error) => fail(t0).runNow()), on = js.Any.fromFunction2((t0: Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => (on(t0, t1)).runNow()), push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), stop = stop.toJsFn)
      __obj.asInstanceOf[Queue[T]]
    }
    
    extension [Self <: Queue[?], T](x: Self & Queue[T]) {
      
      inline def setFail(value: js.Error => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOn(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Callback
      ): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  /* keyof event-iterator.event-iterator/lib/event-iterator.EventHandlers */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.eventIterator.eventIteratorStrings.highWater
    - typingsJapgolly.eventIterator.eventIteratorStrings.lowWater
  */
  trait QueueEvent extends StObject
  
  type RemoveHandler = js.Function0[Unit]
}
