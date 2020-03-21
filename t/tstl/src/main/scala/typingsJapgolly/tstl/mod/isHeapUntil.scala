package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "is_heap_until")
@js.native
object isHeapUntil extends js.Object {
  def apply[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def apply[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): RandomAccessIterator = js.native
}

