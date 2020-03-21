package typingsJapgolly.emberApplication.eventDispatcherMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.emberApplication.typesMod.EventDispatcherEvents
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDispatcher extends Object {
  /**
    * The set of events names (and associated handler function names) to be setup
    * and dispatched by the `EventDispatcher`. Modifications to this list can be done
    * at setup time, generally via the `Ember.Application.customEvents` hash.
    */
  var events: EventDispatcherEvents
}

object EventDispatcher {
  @scala.inline
  def apply(
    constructor: js.Function,
    events: EventDispatcherEvents,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): EventDispatcher = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[EventDispatcher]
  }
}

