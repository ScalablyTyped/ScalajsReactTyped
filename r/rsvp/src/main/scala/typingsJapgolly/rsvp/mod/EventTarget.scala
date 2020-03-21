package typingsJapgolly.rsvp.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.rsvp.mod.RSVP.InstrumentEvent
import typingsJapgolly.rsvp.mod.RSVP.ObjectWithEventMixins
import typingsJapgolly.rsvp.rsvpStrings.chained
import typingsJapgolly.rsvp.rsvpStrings.created
import typingsJapgolly.rsvp.rsvpStrings.error
import typingsJapgolly.rsvp.rsvpStrings.fulfilled
import typingsJapgolly.rsvp.rsvpStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "EventTarget")
@js.native
object EventTarget
  extends Instantiable0[typingsJapgolly.rsvp.mod.RSVP.EventTarget] {
  /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
  def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
  /**
    * You can use `off` to stop firing a particular callback for an event.
    *
    * If you don't pass a `callback` argument to `off`, ALL callbacks for the
    * event will not be executed when the event fires.
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  /** Registers a callback to be executed when `eventName` is triggered */
  @JSName("on")
  def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  /**
    * Use `trigger` to fire custom events.
    *
    * You can also pass a value as a second argument to `trigger` that will be
    * passed as an argument to all event listeners for the event
    */
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, options: js.Any): Unit = js.native
  def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
}

