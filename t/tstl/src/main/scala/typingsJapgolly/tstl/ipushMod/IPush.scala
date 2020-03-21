package typingsJapgolly.tstl.ipushMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPush[T] extends js.Object {
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  def push(items: T*): Double
}

object IPush {
  @scala.inline
  def apply[T](push: /* repeated */ T => CallbackTo[Double]): IPush[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ T) => push(t0).runNow()))
    __obj.asInstanceOf[IPush[T]]
  }
}

