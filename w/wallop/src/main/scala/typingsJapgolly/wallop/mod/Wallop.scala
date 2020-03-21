package typingsJapgolly.wallop.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wallop extends js.Object {
  /**
    * Advances to the slide with the given index.
    */
  def goTo(index: Double): Wallop
  /**
    * Advances to next slide.
    */
  def next(): Wallop
  /**
    * Unbinds method from custom event.
    */
  def off(eventName: String, callback: js.Function0[Unit]): Wallop
  /**
    * Bind method to custom event.
    */
  def on(eventName: String, callback: js.Function0[Unit]): Wallop
  /**
    * Returns to previous slide.
    */
  def previous(): Wallop
  /**
    * Resets current Wallop instance to defaults.
    */
  def reset(): Wallop
}

object Wallop {
  @scala.inline
  def apply(
    goTo: Double => CallbackTo[Wallop],
    next: CallbackTo[Wallop],
    off: (String, js.Function0[Unit]) => CallbackTo[Wallop],
    on: (String, js.Function0[Unit]) => CallbackTo[Wallop],
    previous: CallbackTo[Wallop],
    reset: CallbackTo[Wallop]
  ): Wallop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("goTo")(js.Any.fromFunction1((t0: scala.Double) => goTo(t0).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("previous")(previous.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Wallop]
  }
}

