package typingsJapgolly.baconjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.baconjs.typesObservableMod.EventStream
import typingsJapgolly.baconjs.typesReplyMod.Reply
import typingsJapgolly.baconjs.typesTypesMod.EventSink
import typingsJapgolly.baconjs.typesTypesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBusMod {
  
  @JSImport("baconjs/types/bus", JSImport.Default)
  @js.native
  open class default[V] () extends Bus[V]
  
  @js.native
  trait Bus[V] extends EventStream[V] {
    
    /**
      Ends the stream. Sends an [End](end.html) event to all subscribers.
      After this call, there'll be no more events to the subscribers.
      Also, the [`push`](#push), [`error`](#error) and [`plug`](#plug) methods have no effect.
      */
    def end(): Reply = js.native
    
    /** @hidden */
    var ended: Boolean = js.native
    
    /**
      * Pushes an error to this stream.
      */
    def error(error: Any): Reply = js.native
    
    /** @hidden */
    def guardedSink(input: typingsJapgolly.baconjs.typesObservableMod.default[V]): EventSink[V] = js.native
    
    /**
      Plugs the given stream as an input to the Bus. All events from
      the given stream will be delivered to the subscribers of the Bus.
      Returns a function that can be used to unplug the same stream.
      
      The plug method practically allows you to merge in other streams after
      the creation of the Bus.
      
      * @returns a function that can be called to "unplug" the source from Bus.
      */
    def plug[V2 /* <: V */](input: typingsJapgolly.baconjs.typesObservableMod.default[V2]): js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Pushes a new value to the stream.
      */
    def push(value: V): Reply = js.native
    
    /** @hidden */
    var pushQueue: js.UndefOr[js.Array[V]] = js.native
    
    /** @hidden */
    var pushing: Boolean = js.native
    
    /** @hidden */
    var sink: js.UndefOr[EventSink[V]] = js.native
    
    /** @hidden */
    def subscribeAll(newSink: EventSink[V]): js.Function0[Unit] = js.native
    
    /** @hidden */
    def subscribeInput(subscription: Subscription[V]): Unsub = js.native
    
    /** @hidden */
    var subscriptions: js.Array[Subscription[V]] = js.native
    
    /** @hidden */
    def unsubAll(): Unit = js.native
    
    /** @hidden */
    def unsubscribeInput(input: typingsJapgolly.baconjs.typesObservableMod.default[Any]): Unit = js.native
  }
  
  trait Subscription[V] extends StObject {
    
    var input: typingsJapgolly.baconjs.typesObservableMod.default[V]
    
    var unsub: js.UndefOr[Unsub] = js.undefined
  }
  object Subscription {
    
    inline def apply[V](input: typingsJapgolly.baconjs.typesObservableMod.default[V]): Subscription[V] = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription[V]]
    }
    
    extension [Self <: Subscription[?], V](x: Self & Subscription[V]) {
      
      inline def setInput(value: typingsJapgolly.baconjs.typesObservableMod.default[V]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setUnsub(value: Callback): Self = StObject.set(x, "unsub", value.toJsFn)
      
      inline def setUnsubUndefined: Self = StObject.set(x, "unsub", js.undefined)
    }
  }
}
