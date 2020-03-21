package typingsJapgolly.eventTargetShim

import typingsJapgolly.eventTargetShim.mod.EventTarget.AddOptions
import typingsJapgolly.eventTargetShim.mod.EventTarget.EventData
import typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition
import typingsJapgolly.eventTargetShim.mod.EventTarget.EventType
import typingsJapgolly.eventTargetShim.mod.EventTarget.Listener
import typingsJapgolly.eventTargetShim.mod.EventTarget.Mode
import typingsJapgolly.eventTargetShim.mod.EventTarget.PickEvent
import typingsJapgolly.eventTargetShim.mod.EventTarget.RemoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEventListener[TEvents /* <: EventDefinition */, TMode /* <: Mode */] extends js.Object {
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
  /**
    * Add a given listener to this event target.
    * @param eventName The event name to add.
    * @param listener The listener to add.
    * @param options The options for this listener.
    */
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: AddOptions): Unit = js.native
  /**
    * Dispatch a given event.
    * @param event The event to dispatch.
    * @returns `false` if canceled.
    */
  def dispatchEvent[TEventType /* <: EventType[TEvents, TMode] */](event: EventData[TEvents, TEventType, TMode]): Boolean = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
  /**
    * Remove a given listener from this event target.
    * @param eventName The event name to remove.
    * @param listener The listener to remove.
    * @param options The options for this listener.
    */
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]]): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[TEvents, TMode] */](`type`: TEventType, listener: Listener[PickEvent[TEvents, TEventType]], options: RemoveOptions): Unit = js.native
}

