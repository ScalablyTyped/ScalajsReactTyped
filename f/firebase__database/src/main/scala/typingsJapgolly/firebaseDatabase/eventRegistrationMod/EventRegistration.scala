package typingsJapgolly.firebaseDatabase.eventRegistrationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabase.changeMod.Change
import typingsJapgolly.firebaseDatabase.eventMod.CancelEvent
import typingsJapgolly.firebaseDatabase.eventMod.Event
import typingsJapgolly.firebaseDatabase.pathMod.Path
import typingsJapgolly.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegistration extends js.Object {
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  def createEvent(change: Change, query: Query): Event
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  def getEventRunner(eventData: Event): js.Function0[Unit]
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  def hasAnyCallback(): Boolean
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  def matches(other: EventRegistration): Boolean
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  def respondsTo(eventType: String): Boolean
}

object EventRegistration {
  @scala.inline
  def apply(
    createCancelEvent: (js.Error, Path) => CallbackTo[CancelEvent | Null],
    createEvent: (Change, Query) => CallbackTo[Event],
    getEventRunner: Event => CallbackTo[js.Function0[Unit]],
    hasAnyCallback: CallbackTo[Boolean],
    matches: EventRegistration => CallbackTo[Boolean],
    respondsTo: String => CallbackTo[Boolean]
  ): EventRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCancelEvent")(js.Any.fromFunction2((t0: js.Error, t1: typingsJapgolly.firebaseDatabase.pathMod.Path) => createCancelEvent(t0, t1).runNow()))
    __obj.updateDynamic("createEvent")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseDatabase.changeMod.Change, t1: typingsJapgolly.firebaseDatabase.queryMod.Query) => createEvent(t0, t1).runNow()))
    __obj.updateDynamic("getEventRunner")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseDatabase.eventMod.Event) => getEventRunner(t0).runNow()))
    __obj.updateDynamic("hasAnyCallback")(hasAnyCallback.toJsFn)
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseDatabase.eventRegistrationMod.EventRegistration) => matches(t0).runNow()))
    __obj.updateDynamic("respondsTo")(js.Any.fromFunction1((t0: java.lang.String) => respondsTo(t0).runNow()))
    __obj.asInstanceOf[EventRegistration]
  }
}

