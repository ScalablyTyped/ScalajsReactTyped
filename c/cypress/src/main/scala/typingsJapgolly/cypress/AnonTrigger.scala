package typingsJapgolly.cypress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.JQuery_._SpecialEventHook
import typingsJapgolly.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrigger[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Called when the `.trigger()` or `.triggerHandler()` methods are used to trigger an event for the special type from code, as opposed to events that originate from within the browser. The `this` keyword will be the element being triggered, and the event argument will be a `jQuery.Event` object constructed from the caller's input. At minimum, the event type, data, namespace, and target properties are set on the event. The data argument represents additional data passed by `.trigger()` if present.
    *
    * The trigger hook is called early in the process of triggering an event, just after the `jQuery.Event` object is constructed and before any handlers have been called. It can process the triggered event in any way, for example by calling `event.stopPropagation()` or `event.preventDefault()` before returning. If the hook returns `false`, jQuery does not perform any further event triggering actions and returns immediately. Otherwise, it performs the normal trigger processing, calling any event handlers for the element and bubbling the event (unless propagation is stopped in advance or `noBubble` was specified for the special event) to call event handlers attached to parent elements.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#trigger-function-event-jquery-event-data-object }\`
    */
  def trigger(event: typingsJapgolly.cypress.JQuery_.Event, data: TData): Unit | `false`
}

object AnonTrigger {
  @scala.inline
  def apply[TTarget, TData](trigger: (typingsJapgolly.cypress.JQuery_.Event, TData) => CallbackTo[Unit | `false`]): AnonTrigger[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.JQuery_.Event, t1: TData) => trigger(t0, t1).runNow()))
    __obj.asInstanceOf[AnonTrigger[TTarget, TData]]
  }
}

