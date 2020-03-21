package typingsJapgolly.wordpressJestConsole.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  /**
    * Ensure that `console.error` function was called.
    */
  def toHaveErrored(): R
  /**
    * Ensure that `console.error` function was called with specific arguments.
    */
  def toHaveErroredWith(args: js.Any*): R
  /**
    * Ensure that `console.info` function was called.
    */
  def toHaveInformed(): R
  /**
    * Ensure that `console.info` function was called with specific arguments.
    */
  def toHaveInformedWith(args: js.Any*): R
  /**
    * Ensure that `console.log` function was called.
    */
  def toHaveLogged(): R
  /**
    * Ensure that `console.log` function was called with specific arguments.
    */
  def toHaveLoggedWith(args: js.Any*): R
  /**
    * Ensure that `console.warn` function was called.
    */
  def toHaveWarned(): R
  /**
    * Ensure that `console.warn` function was called with specific arguments.
    */
  def toHaveWarnedWith(args: js.Any*): R
}

object Matchers {
  @scala.inline
  def apply[R, T](
    toHaveErrored: CallbackTo[R],
    toHaveErroredWith: /* repeated */ js.Any => CallbackTo[R],
    toHaveInformed: CallbackTo[R],
    toHaveInformedWith: /* repeated */ js.Any => CallbackTo[R],
    toHaveLogged: CallbackTo[R],
    toHaveLoggedWith: /* repeated */ js.Any => CallbackTo[R],
    toHaveWarned: CallbackTo[R],
    toHaveWarnedWith: /* repeated */ js.Any => CallbackTo[R]
  ): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toHaveErrored")(toHaveErrored.toJsFn)
    __obj.updateDynamic("toHaveErroredWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toHaveErroredWith(t0).runNow()))
    __obj.updateDynamic("toHaveInformed")(toHaveInformed.toJsFn)
    __obj.updateDynamic("toHaveInformedWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toHaveInformedWith(t0).runNow()))
    __obj.updateDynamic("toHaveLogged")(toHaveLogged.toJsFn)
    __obj.updateDynamic("toHaveLoggedWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toHaveLoggedWith(t0).runNow()))
    __obj.updateDynamic("toHaveWarned")(toHaveWarned.toJsFn)
    __obj.updateDynamic("toHaveWarnedWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toHaveWarnedWith(t0).runNow()))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

