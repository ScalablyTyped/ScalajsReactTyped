package typingsJapgolly.typescriptOptional.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cases[T, U] extends js.Object {
  def empty(): U
  def present(value: T): U
}

object Cases {
  @scala.inline
  def apply[T, U](empty: CallbackTo[U], present: T => CallbackTo[U]): Cases[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("present")(js.Any.fromFunction1((t0: T) => present(t0).runNow()))
    __obj.asInstanceOf[Cases[T, U]]
  }
}

