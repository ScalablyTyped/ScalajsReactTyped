package typingsJapgolly.eventemitter3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("eventemitter3", JSImport.Namespace)
  @js.native
  open class ^[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] ()
    extends StObject
       with typingsJapgolly.eventemitter3.mod.EventEmitter[EventTypes, Context]
  @JSImport("eventemitter3", JSImport.Namespace)
  @js.native
  val ^ : EventEmitterStatic = js.native
  
  @js.native
  trait EventEmitter[EventTypes /* <: ValidEventTypes */, Context /* <: Any */] extends StObject {
    
    def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T]): this.type = js.native
    def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context): this.type = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[EventTypes] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[EventTypes, T]
    ): Boolean = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[EventTypes]] = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[EventTypes]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[EventTypes] */](event: T): js.Array[EventListener[EventTypes, T]] = js.native
    
    def off[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T]): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T]): this.type = js.native
    def on[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T]): this.type = js.native
    def once[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context): this.type = js.native
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[EventTypes]): this.type = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Context, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T]): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Context, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: EventListener[EventTypes, T], context: Unit, once: Boolean): this.type = js.native
  }
  @JSImport("eventemitter3", "EventEmitter")
  @js.native
  val EventEmitter: EventEmitterStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("eventemitter3", "EventEmitter")
  @js.native
  open class EventEmitterCls[EventTypes /* <: ValidEventTypes */, Context] ()
    extends StObject
       with typingsJapgolly.eventemitter3.mod.EventEmitter[EventTypes, Context]
  
  /* static member */
  @JSImport("eventemitter3", "prefixed")
  @js.native
  def prefixed: String | Boolean = js.native
  inline def prefixed_=(x: String | Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixed")(x.asInstanceOf[js.Any])
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends (args : ...any): void? std.Parameters<T[K]> : T[K] extends std.Array<any>? T[K] : std.Array<any>}
    }}}
    */
  @js.native
  trait ArgumentMap[T /* <: js.Object */] extends StObject
  
  type EventArgs[T /* <: ValidEventTypes */, K /* <: EventNames[T] */] = Parameters[EventListener[T, K]]
  
  @js.native
  trait EventEmitterStatic
    extends StObject
       with Instantiable0[typingsJapgolly.eventemitter3.mod.EventEmitter[ValidEventTypes, js.Object]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends string | symbol ? (args : ...any): void : (args : eventemitter3.eventemitter3.ArgumentMap<std.Exclude<T, string | symbol>>[std.Extract<K, keyof T>]): void
    }}}
    */
  @js.native
  trait EventListener[T /* <: ValidEventTypes */, K /* <: EventNames[T] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends string | symbol ? T : keyof T
    }}}
    */
  @js.native
  trait EventNames[T /* <: ValidEventTypes */] extends StObject
  
  type ListenerFn[Args /* <: js.Array[Any] */] = js.Function1[/* args */ Args, Unit]
  
  type ValidEventTypes = String | js.Symbol | js.Object
  
  type _To = EventEmitterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EventEmitterStatic = ^
}
