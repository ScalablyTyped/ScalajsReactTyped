package typingsJapgolly.tstl.idequeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeque[T] extends IPushFront[T] {
  /**
    * Erase the first element.
    */
  def pop_front(): Unit
}

object IDeque {
  @scala.inline
  def apply[T](pop_front: Callback, push_front: T => Callback): IDeque[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pop_front")(pop_front.toJsFn)
    __obj.updateDynamic("push_front")(js.Any.fromFunction1((t0: T) => push_front(t0).runNow()))
    __obj.asInstanceOf[IDeque[T]]
  }
}

