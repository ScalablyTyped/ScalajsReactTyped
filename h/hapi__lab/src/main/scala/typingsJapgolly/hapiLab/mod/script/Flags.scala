package typingsJapgolly.hapiLab.mod.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  /**
    * An object that is passed to `before` and `after` functions in addition to tests themselves.
    */
  val context: Record[String, _]
  /**
    * A property that can be assigned a cleanup function registered at runtime to be executed after the test completes.
    */
  var onCleanup: js.UndefOr[Action] = js.undefined
  /**
    * A property that can be assigned an override for global exception handling.
    */
  var onUncaughtException: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * A property that can be assigned an override function for global rejection handling.
    */
  var onUnhandledRejection: js.UndefOr[ErrorHandler] = js.undefined
  /**
    * Sets a requirement that a function must be called a certain number of times.
    * 
    * @param func - the function to be called.
    * @param count - the number of required invocations.
    * 
    * @returns a wrapped function.
    */
  def mustCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, count: Double): T
  /**
    * Adds notes to the test log.
    * 
    * @param note - a string to be included in the console reporter at the end of the output.
    */
  def note(note: String): Unit
}

object Flags {
  @scala.inline
  def apply(
    context: Record[String, _],
    mustCall: (js.Any, Double) => CallbackTo[js.Any],
    note: String => Callback,
    onCleanup: Action = null,
    onUncaughtException: /* err */ js.Error => Callback = null,
    onUnhandledRejection: /* err */ js.Error => Callback = null
  ): Flags = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("mustCall")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => mustCall(t0, t1).runNow()))
    __obj.updateDynamic("note")(js.Any.fromFunction1((t0: java.lang.String) => note(t0).runNow()))
    if (onCleanup != null) __obj.updateDynamic("onCleanup")(onCleanup.asInstanceOf[js.Any])
    if (onUncaughtException != null) __obj.updateDynamic("onUncaughtException")(js.Any.fromFunction1((t0: /* err */ js.Error) => onUncaughtException(t0).runNow()))
    if (onUnhandledRejection != null) __obj.updateDynamic("onUnhandledRejection")(js.Any.fromFunction1((t0: /* err */ js.Error) => onUnhandledRejection(t0).runNow()))
    __obj.asInstanceOf[Flags]
  }
}

