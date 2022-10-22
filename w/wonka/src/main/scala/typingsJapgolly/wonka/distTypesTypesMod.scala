package typingsJapgolly.wonka

import japgolly.scalajs.react.Callback
import typingsJapgolly.wonka.wonkaInts.`0`
import typingsJapgolly.wonka.wonkaInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    
    def next(value: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: Callback, next: T => Callback): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  type Operator[In, Out] = js.Function1[/* a */ Source[In], Source[Out]]
  
  type Push[T] = Tag[`1`] & js.Array[T]
  
  type Signal[T] = Start[T] | Push[T] | `0`
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wonka.wonkaInts.`0`
    - typingsJapgolly.wonka.wonkaInts.`1`
  */
  trait SignalKind extends StObject
  object SignalKind {
    
    inline def End: `0` = 0.asInstanceOf[`0`]
    
    inline def Push: `1` = 1.asInstanceOf[`1`]
    
    inline def Start: `0` = 0.asInstanceOf[`0`]
  }
  
  type Sink[T] = js.Function1[/* signal */ Signal[T], Unit]
  
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit]
  
  type Start[_T] = Tag[`0`] & js.Array[TalkbackFn]
  
  trait Subject[T]
    extends StObject
       with Observer[T] {
    
    def source(sink: Sink[T]): Unit
    @JSName("source")
    var source_Original: Source[T]
  }
  object Subject {
    
    inline def apply[T](complete: Callback, next: T => Callback, source: /* sink */ Sink[T] => Callback): Subject[T] = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, next = js.Any.fromFunction1((t0: T) => next(t0).runNow()), source = js.Any.fromFunction1((t0: /* sink */ Sink[T]) => source(t0).runNow()))
      __obj.asInstanceOf[Subject[T]]
    }
    
    extension [Self <: Subject[?], T](x: Self & Subject[T]) {
      
      inline def setSource(value: /* sink */ Sink[T] => Callback): Self = StObject.set(x, "source", js.Any.fromFunction1((t0: /* sink */ Sink[T]) => value(t0).runNow()))
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: Callback): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  trait Tag[T] extends StObject {
    
    var tag: T
  }
  object Tag {
    
    inline def apply[T](tag: T): Tag[T] = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag[T]]
    }
    
    extension [Self <: Tag[?], T](x: Self & Tag[T]) {
      
      inline def setTag(value: T): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type TalkbackFn = js.Function1[/* signal */ TalkbackKind, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wonka.wonkaInts.`0`
    - typingsJapgolly.wonka.wonkaInts.`1`
  */
  trait TalkbackKind extends StObject
  object TalkbackKind {
    
    inline def Close: `1` = 1.asInstanceOf[`1`]
    
    inline def Pull: `0` = 0.asInstanceOf[`0`]
  }
  
  type TeardownFn = js.Function0[Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends wonka.wonka/dist/types/types.Source<infer U> ? U : never
    }}}
    */
  @js.native
  trait TypeOfSource[T] extends StObject
}
