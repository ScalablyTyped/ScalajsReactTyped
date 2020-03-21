package typingsJapgolly.jstree

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsCoreKeyboard extends js.Object {
  @JSName("*")
  def Asterisk(e: Event_): Unit
  def `ctrl-space`(e: Event_): Unit
  def down(e: Event_): Unit
  def end(e: Event_): Unit
  def enter(e: Event_): Unit
  def f2(e: Event_): Unit
  def home(e: Event_): Unit
  def left(e: Event_): Unit
  def right(e: Event_): Unit
  def up(e: Event_): Unit
}

object JSTreeStaticDefaultsCoreKeyboard {
  @scala.inline
  def apply(
    Asterisk: Event_ => Callback,
    `ctrl-space`: Event_ => Callback,
    down: Event_ => Callback,
    end: Event_ => Callback,
    enter: Event_ => Callback,
    f2: Event_ => Callback,
    home: Event_ => Callback,
    left: Event_ => Callback,
    right: Event_ => Callback,
    up: Event_ => Callback
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Asterisk")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => Asterisk(t0).runNow()))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => `ctrl-space`(t0).runNow()))
    __obj.updateDynamic("down")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => down(t0).runNow()))
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => end(t0).runNow()))
    __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => enter(t0).runNow()))
    __obj.updateDynamic("f2")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => f2(t0).runNow()))
    __obj.updateDynamic("home")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => home(t0).runNow()))
    __obj.updateDynamic("left")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => left(t0).runNow()))
    __obj.updateDynamic("right")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => right(t0).runNow()))
    __obj.updateDynamic("up")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => up(t0).runNow()))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
}

