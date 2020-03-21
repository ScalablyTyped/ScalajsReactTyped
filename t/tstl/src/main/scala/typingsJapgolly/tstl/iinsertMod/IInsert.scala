package typingsJapgolly.tstl.iinsertMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInsert[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends js.Object {
  def insert(it: Iterator, value: ValueType[Iterator]): Iterator
}

object IInsert {
  @scala.inline
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](insert: (Iterator, ValueType[Iterator]) => CallbackTo[Iterator]): IInsert[Iterator] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: Iterator, t1: typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[Iterator]) => insert(t0, t1).runNow()))
    __obj.asInstanceOf[IInsert[Iterator]]
  }
}

