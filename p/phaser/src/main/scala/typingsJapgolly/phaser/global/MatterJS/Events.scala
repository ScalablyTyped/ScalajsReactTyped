package typingsJapgolly.phaser.global.MatterJS

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.CompositeType
import typingsJapgolly.phaser.MatterJS.IEvent
import typingsJapgolly.phaser.MatterJS.IEventCollision
import typingsJapgolly.phaser.MatterJS.IEventComposite
import typingsJapgolly.phaser.MatterJS.IEventTimestamped
import typingsJapgolly.phaser.phaserStrings.afterAdd
import typingsJapgolly.phaser.phaserStrings.afterRemove
import typingsJapgolly.phaser.phaserStrings.afterRender
import typingsJapgolly.phaser.phaserStrings.afterTick
import typingsJapgolly.phaser.phaserStrings.afterUpdate
import typingsJapgolly.phaser.phaserStrings.beforeAdd
import typingsJapgolly.phaser.phaserStrings.beforeRemove
import typingsJapgolly.phaser.phaserStrings.beforeRender
import typingsJapgolly.phaser.phaserStrings.beforeTick
import typingsJapgolly.phaser.phaserStrings.beforeUpdate
import typingsJapgolly.phaser.phaserStrings.collisionActive
import typingsJapgolly.phaser.phaserStrings.collisionEnd
import typingsJapgolly.phaser.phaserStrings.collisionStart
import typingsJapgolly.phaser.phaserStrings.sleepEnd
import typingsJapgolly.phaser.phaserStrings.sleepStart
import typingsJapgolly.phaser.phaserStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.Events")
@js.native
open class Events ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.Events
object Events {
  
  @JSGlobal("MatterJS.Events")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removes the given event callback. If no callback, clears all callbacks in eventNames. If no eventNames, clears all events.
    *
    * @param obj
    * @param eventName
    * @param callback
    */
  /* static member */
  inline def off(obj: Any, eventName: String, callback: js.Function1[/* e */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(obj.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def on(obj: Any, name: String, callback: js.Function1[/* e */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.add` is made, after objects have been added.
    *
    * @event afterAdd
    * @param {} event An event object
    * @param {} event.object The object(s) that have been added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_afterAdd(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: afterAdd,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.remove` is made, after objects have been removed.
    *
    * @event afterRemove
    * @param {} event An event object
    * @param {} event.object The object(s) that have been removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_afterRemove(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: afterRemove,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after rendering
    *
    * @event afterRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_afterRender(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: afterRender,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired at the end of a tick, after engine update and after rendering
    *
    * @event afterTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_afterTick(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: afterTick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update and all collision events
    *
    * @event afterUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_afterUpdate(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: afterUpdate,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Engine], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.add` is made, before objects have been added.
    *
    * @event beforeAdd
    * @param {} event An event object
    * @param {} event.object The object(s) to be added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_beforeAdd(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: beforeAdd,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a call to `Composite.remove` is made, before objects have been removed.
    *
    * @event beforeRemove
    * @param {} event An event object
    * @param {} event.object The object(s) to be removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_beforeRemove(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: beforeRemove,
    callback: js.Function1[/* e */ IEventComposite[CompositeType], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired before rendering
    *
    * @event beforeRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_beforeRender(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: beforeRender,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired at the start of a tick, before any updates to the engine or timing
    *
    * @event beforeTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_beforeTick(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: beforeTick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired just before an update
    *
    * @event beforeUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_beforeUpdate(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: beforeUpdate,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Engine], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that are colliding in the current tick (if any)
    *
    * @event collisionActive
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_collisionActive(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: collisionActive,
    callback: js.Function1[/* e */ IEventCollision[typingsJapgolly.phaser.MatterJS.Engine], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that have ended collision in the current tick (if any)
    *
    * @event collisionEnd
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_collisionEnd(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: collisionEnd,
    callback: js.Function1[/* e */ IEventCollision[typingsJapgolly.phaser.MatterJS.Engine], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine update, provides a list of all pairs that have started to collide in the current tick (if any)
    *
    * @event collisionStart
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_collisionStart(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: collisionStart,
    callback: js.Function1[/* e */ IEventCollision[typingsJapgolly.phaser.MatterJS.Engine], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a body ends sleeping (where `this` is the body).
    *
    * @event sleepEnd
    * @this {body} The body that has ended sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_sleepEnd(obj: BodyType, name: sleepEnd, callback: js.Function1[/* e */ IEvent[BodyType], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired when a body starts sleeping (where `this` is the body).
    *
    * @event sleepStart
    * @this {body} The body that has started sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_sleepStart(obj: BodyType, name: sleepStart, callback: js.Function1[/* e */ IEvent[BodyType], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fired after engine timing updated, but just before update
    *
    * @event tick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  /* static member */
  inline def on_tick(
    obj: typingsJapgolly.phaser.MatterJS.Engine,
    name: tick,
    callback: js.Function1[/* e */ IEventTimestamped[typingsJapgolly.phaser.MatterJS.Runner], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Fires all the callbacks subscribed to the given object's eventName, in the order they subscribed, if any.
    *
    * @param object
    * @param eventNames
    * @param event
    */
  /* static member */
  inline def trigger(`object`: Any, eventNames: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(`object`.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(`object`: Any, eventNames: String, event: js.Function1[/* e */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(`object`.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
