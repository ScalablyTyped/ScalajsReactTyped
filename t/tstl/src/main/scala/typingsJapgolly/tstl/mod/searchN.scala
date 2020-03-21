package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.binaryPredicatorMod.BinaryPredicator
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "search_n")
@js.native
object searchN extends js.Object {
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, count: Double, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: Double,
    `val`: ValueType[ForwardIterator],
    pred: BinaryPredicator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
}

