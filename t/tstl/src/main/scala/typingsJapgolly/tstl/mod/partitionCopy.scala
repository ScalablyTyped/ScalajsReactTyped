package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.unaryPredicatorMod.UnaryPredicator
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partition_copy")
@js.native
object partitionCopy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[InputIterator]]
  ): typingsJapgolly.tstl.pairMod.Pair[OutputIterator1, OutputIterator2] = js.native
}

