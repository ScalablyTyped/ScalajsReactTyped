package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery.EventHandler
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import typingsJapgolly.jquery.jqueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * The setup hook is called the first time an event of a particular type is attached to an element; this provides the hook an opportunity to do processing that will apply to all events of this type on this element. The `this` keyword will be a reference to the element where the event is being attached and `eventHandle` is jQuery's event handler function. In most cases the `namespaces` argument should not be used, since it only represents the namespaces of the _first_ event being attached; subsequent events may not have this same namespaces.
    *
    * This hook can perform whatever processing it desires, including attaching its own event handlers to the element or to other elements and recording setup information on the element using the `jQuery.data()` method. If the setup hook wants jQuery to add a browser event (via `addEventListener` or `attachEvent`, depending on browser) it should return `false`. In all other cases, jQuery will not add the browser event, but will continue all its other bookkeeping for the event. This would be appropriate, for example, if the event was never fired by the browser but invoked by `.trigger()`. To attach the jQuery event handler in the setup hook, use the `eventHandle` argument.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#setup-function-data-object-namespaces-eventhandle-function }\`
    */
  def setup(`this`: TTarget, data: TData, namespaces: String, eventHandle: EventHandler[TTarget, TData]): Unit | `false`
}

object Anon_Data {
  @scala.inline
  def apply[TTarget, TData](setup: (TTarget, TData, String, EventHandler[TTarget, TData]) => CallbackTo[Unit | `false`]): Anon_Data[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(js.Any.fromFunction4((t0: TTarget, t1: TData, t2: java.lang.String, t3: typingsJapgolly.jquery.JQuery.EventHandler[TTarget, TData]) => setup(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Anon_Data[TTarget, TData]]
  }
}

