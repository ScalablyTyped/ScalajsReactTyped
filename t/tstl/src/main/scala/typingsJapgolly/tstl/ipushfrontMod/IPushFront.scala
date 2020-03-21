package typingsJapgolly.tstl.ipushfrontMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushFront[T] extends js.Object {
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): Unit
}

object IPushFront {
  @scala.inline
  def apply[T](push_front: T => Callback): IPushFront[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push_front")(js.Any.fromFunction1((t0: T) => push_front(t0).runNow()))
    __obj.asInstanceOf[IPushFront[T]]
  }
}

