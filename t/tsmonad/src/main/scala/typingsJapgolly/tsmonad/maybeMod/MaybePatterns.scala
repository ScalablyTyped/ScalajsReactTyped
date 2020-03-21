package typingsJapgolly.tsmonad.maybeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybePatterns[T, U] extends js.Object {
  def just(t: T): U
  def nothing(): U
}

object MaybePatterns {
  @scala.inline
  def apply[T, U](just: T => CallbackTo[U], nothing: CallbackTo[U]): MaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("just")(js.Any.fromFunction1((t0: T) => just(t0).runNow()))
    __obj.updateDynamic("nothing")(nothing.toJsFn)
    __obj.asInstanceOf[MaybePatterns[T, U]]
  }
}

