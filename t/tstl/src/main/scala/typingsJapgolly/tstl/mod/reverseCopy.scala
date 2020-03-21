package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "reverse_copy")
@js.native
object reverseCopy extends js.Object {
  def apply[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
}

