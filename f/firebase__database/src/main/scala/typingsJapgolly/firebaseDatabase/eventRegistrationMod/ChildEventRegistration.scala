package typingsJapgolly.firebaseDatabase.eventRegistrationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseDatabase.changeMod.Change
import typingsJapgolly.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typingsJapgolly.firebaseDatabase.eventMod.CancelEvent
import typingsJapgolly.firebaseDatabase.eventMod.DataEvent
import typingsJapgolly.firebaseDatabase.eventMod.Event
import typingsJapgolly.firebaseDatabase.pathMod.Path
import typingsJapgolly.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ChildEventRegistration")
@js.native
class ChildEventRegistration () extends EventRegistration {
  def this(callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]]) = this()
  /**
    * @param {?Object.<string, function(!DataSnapshot, ?string=)>} callbacks_
    * @param {?function(Error)} cancelCallback_
    * @param {Object=} context_
    */
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : js.Function1[/* e */ js.Error, Unit]
  ) = this()
  def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ js.Error, Unit]) = this()
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : js.Function1[/* e */ js.Error, Unit],
    context_ : js.Object
  ) = this()
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : Null,
    context_ : js.Object
  ) = this()
  def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ js.Error, Unit], context_ : js.Object) = this()
  def this(callbacks_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
  var callbacks_ : js.Any = js.native
  var cancelCallback_ : js.Any = js.native
  var context_ : js.UndefOr[js.Any] = js.native
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  /* CompleteClass */
  override def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null = js.native
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  /* CompleteClass */
  override def createEvent(change: Change, query: Query): Event = js.native
  /**
    * @inheritDoc
    */
  def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
  def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  /* CompleteClass */
  override def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  /* CompleteClass */
  override def hasAnyCallback(): Boolean = js.native
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  /* CompleteClass */
  override def matches(other: EventRegistration): Boolean = js.native
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  /* CompleteClass */
  override def respondsTo(eventType: String): Boolean = js.native
}

