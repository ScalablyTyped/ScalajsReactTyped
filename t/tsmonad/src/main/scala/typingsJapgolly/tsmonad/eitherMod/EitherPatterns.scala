package typingsJapgolly.tsmonad.eitherMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherPatterns[L, R, T] extends js.Object {
  def left(l: L): T
  def right(r: R): T
}

object EitherPatterns {
  @scala.inline
  def apply[L, R, T](left: L => CallbackTo[T], right: R => CallbackTo[T]): EitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(js.Any.fromFunction1((t0: L) => left(t0).runNow()))
    __obj.updateDynamic("right")(js.Any.fromFunction1((t0: R) => right(t0).runNow()))
    __obj.asInstanceOf[EitherPatterns[L, R, T]]
  }
}

