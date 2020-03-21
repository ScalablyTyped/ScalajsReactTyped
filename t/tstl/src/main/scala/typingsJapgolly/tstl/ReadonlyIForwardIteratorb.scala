package typingsJapgolly.tstl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, any>>> */
trait ReadonlyIForwardIteratorb extends js.Object {
  val value: Boolean
  def equals(obj: IForwardIterator[Boolean, _]): Boolean
  def next(): IForwardIterator[Boolean, _]
}

object ReadonlyIForwardIteratorb {
  @scala.inline
  def apply(
    equals: IForwardIterator[Boolean, js.Any] => CallbackTo[Boolean],
    next: CallbackTo[IForwardIterator[Boolean, js.Any]],
    value: Boolean
  ): ReadonlyIForwardIteratorb = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator[scala.Boolean, js.Any]) => equals(t0).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[ReadonlyIForwardIteratorb]
  }
}

