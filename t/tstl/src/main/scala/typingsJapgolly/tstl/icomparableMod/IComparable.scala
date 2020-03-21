package typingsJapgolly.tstl.icomparableMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComparable[T] extends js.Object {
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  def less(obj: T): Boolean
}

object IComparable {
  @scala.inline
  def apply[T](less: T => CallbackTo[Boolean]): IComparable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("less")(js.Any.fromFunction1((t0: T) => less(t0).runNow()))
    __obj.asInstanceOf[IComparable[T]]
  }
}

