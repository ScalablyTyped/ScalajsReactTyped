package typingsJapgolly.playable

import typingsJapgolly.eventemitter3.mod.EventEmitter
import typingsJapgolly.eventemitter3.mod.ListenerFn
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesEventEmitterEventEmitterMod {
  
  @JSImport("playable/dist/src/modules/event-emitter/event-emitter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventEmitterModule
  object default {
    
    @JSImport("playable/dist/src/modules/event-emitter/event-emitter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/event-emitter/event-emitter", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EventEmitterModule
    extends StObject
       with EventEmitter[String | js.Symbol, Any]
       with IEventEmitter {
    
    def bindEvents(eventsMap: js.Array[IEventMap], defaultFnContext: js.Object): js.Function0[Unit] = js.native
    
    def off(event: js.Symbol): this.type = js.native
    def off(event: js.Symbol, fn: Unit, context: Any): this.type = js.native
    def off(event: js.Symbol, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def off(event: js.Symbol, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
    def off(event: js.Symbol, fn: ListenerFn[js.Array[Any]], context: Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: ListenerFn[js.Array[Any]], context: Unit, once: Boolean): this.type = js.native
    
    def on(event: js.Symbol, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def on(event: js.Symbol, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
    
    /**
      * The `.once()` method is identical to `.on()`, except that the handler for a given element and event type is unbound after its first invocation.
      *
      * @param event - The Event name, such as `Playable.UI_EVENTS.PLAY_CLICK`
      * @param fn - A function callback to execute when the event is triggered.
      * @param context - Value to use as `this` (i.e the reference Object) when executing callback.
      *
      * @example
      * const Playable = require('playable');
      * const player = Playable.create();
      *
      * player.once(Playable.UI_EVENTS.PLAY_CLICK, () => {
      *   // Will be executed only one time
      * });
      */
    def once(event: String, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def once(event: String, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
    def once(event: js.Symbol, fn: ListenerFn[js.Array[Any]]): this.type = js.native
    def once(event: js.Symbol, fn: ListenerFn[js.Array[Any]], context: Any): this.type = js.native
  }
}
