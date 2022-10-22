package typingsJapgolly.socketIoComponentEmitter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.clear
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.delete
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.entries
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.forEach
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.get
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.has
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.keys
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.set
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.size
import typingsJapgolly.socketIoComponentEmitter.socketIoComponentEmitterStrings.values
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@socket.io/component-emitter", "Emitter")
  @js.native
  open class Emitter[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ReservedEvents /* <: EventsMap */] () extends StObject {
    
    /**
      * Emits an event.
      *
      * @param ev Name of the event
      * @param args Values to send to listeners of this event
      */
    def emit[Ev /* <: EventNames[EmitEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<EmitEvents, Ev> is not an array type */ args: EventParams[EmitEvents, Ev]
    ): this.type = js.native
    
    /**
      * Emits a reserved event.
      *
      * This method is `protected`, so that only a class extending
      * `StrictEventEmitter` can emit its own reserved events.
      *
      * @param ev Reserved event name
      * @param args Arguments to emit along with the event
      */
    /* protected */ def emitReserved[Ev /* <: EventNames[ReservedEvents] */](
      ev: Ev,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<ReservedEvents, Ev> is not an array type */ args: EventParams[ReservedEvents, Ev]
    ): this.type = js.native
    
    /**
      * Returns true if there is a listener for this event.
      *
      * @param event Event name
      * @returns boolean
      */
    def hasListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](event: Ev): Boolean = js.native
    
    /**
      * Returns the listeners listening to an event.
      *
      * @param event Event name
      * @returns Array of listeners subscribed to `event`
      */
    def listeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](event: Ev): js.Array[ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]] = js.native
    
    /**
      * Removes the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    def off[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Unit, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    
    /**
      * Adds the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def on[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    
    /**
      * Adds a one-time `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def once[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    
    /**
      * Removes all `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      */
    def removeAllListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def removeAllListeners[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    
    /**
      * Removes the `listener` function as an event listener for `ev`.
      *
      * @param ev Name of the event
      * @param listener Callback function
      */
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Ev, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
    def removeListener[Ev /* <: ReservedOrUserEventNames[ReservedEvents, ListenEvents] */](ev: Unit, listener: ReservedOrUserListener[ReservedEvents, ListenEvents, Ev]): this.type = js.native
  }
  
  type DefaultEventsMap = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
  
  type EventNames[Map /* <: EventsMap */] = (String & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values)) | (js.Symbol & (/* keyof Map */ clear | delete | forEach | get | has | set | size | entries | keys | values))
  
  type EventParams[Map /* <: EventsMap */, Ev /* <: EventNames[Map] */] = Parameters[
    /* import warning: importer.ImportType#apply Failed type conversion: Map[Ev] */ js.Any
  ]
  
  type EventsMap = StringDictionary[Any]
  
  /**
    * Returns an untyped listener type if `T` is `never`; otherwise, returns `T`.
    *
    * This is a hack to mitigate https://github.com/socketio/socket.io/issues/3833.
    * Needed because of https://github.com/microsoft/TypeScript/issues/41778
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [never] ? (args : ...any): void | std.Promise<void> : T
    }}}
    */
  @js.native
  trait FallbackToUntypedListener[T] extends StObject
  
  type ReservedOrUserEventNames[ReservedEventsMap /* <: EventsMap */, UserEvents /* <: EventsMap */] = EventNames[ReservedEventsMap | UserEvents]
  
  type ReservedOrUserListener[ReservedEvents /* <: EventsMap */, UserEvents /* <: EventsMap */, Ev /* <: ReservedOrUserEventNames[ReservedEvents, UserEvents] */] = FallbackToUntypedListener[
    /* import warning: importer.ImportType#apply Failed type conversion: Ev extends @socket.io/component-emitter.@socket.io/component-emitter.EventNames<ReservedEvents> ? ReservedEvents[Ev] : Ev extends @socket.io/component-emitter.@socket.io/component-emitter.EventNames<UserEvents> ? UserEvents[Ev] : never */ js.Any
  ]
}
