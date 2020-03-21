package typingsJapgolly.abortController

import typingsJapgolly.abortController.abortControllerStrings.loose
import typingsJapgolly.abortController.mod.Events
import typingsJapgolly.eventTargetShim.mod.EventTarget.AddOptions
import typingsJapgolly.eventTargetShim.mod.EventTarget.EventData
import typingsJapgolly.eventTargetShim.mod.EventTarget.EventType
import typingsJapgolly.eventTargetShim.mod.EventTarget.FunctionListener
import typingsJapgolly.eventTargetShim.mod.EventTarget.Listener
import typingsJapgolly.eventTargetShim.mod.EventTarget.PickEvent
import typingsJapgolly.eventTargetShim.mod.EventTarget.RemoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined abort-controller.abort-controller/dist/abort-controller.AbortSignal */
@js.native
/**
  * AbortSignal cannot be constructed directly.
  */
trait AbortSignal extends js.Object {
  /**
    * Returns `true` if this `AbortSignal`"s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
  var onabort: js.UndefOr[FunctionListener[_]] = js.native
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType): Unit = js.native
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Null, options: AddOptions): Unit = js.native
  /**
    * Add a given listener to this event target.
    * @param eventName The event name to add.
    * @param listener The listener to add.
    * @param options The options for this listener.
    */
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]]): Unit = js.native
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]], options: Boolean): Unit = js.native
  def addEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]], options: AddOptions): Unit = js.native
  /**
    * Dispatch a given event.
    * @param event The event to dispatch.
    * @returns `false` if canceled.
    */
  @JSName("dispatchEvent")
  def dispatchEvent_loose[TEventType /* <: EventType[Events, loose] */](event: EventData[Events, TEventType, loose]): Boolean = js.native
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Null, options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Null, options: RemoveOptions): Unit = js.native
  /**
    * Remove a given listener from this event target.
    * @param eventName The event name to remove.
    * @param listener The listener to remove.
    * @param options The options for this listener.
    */
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]]): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]], options: Boolean): Unit = js.native
  def removeEventListener[TEventType /* <: EventType[Events, loose] */](`type`: TEventType, listener: Listener[PickEvent[Events, TEventType]], options: RemoveOptions): Unit = js.native
}

