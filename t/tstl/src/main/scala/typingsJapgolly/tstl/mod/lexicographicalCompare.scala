package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.binaryPredicatorMod.BinaryPredicator
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "lexicographical_compare")
@js.native
object lexicographicalCompare extends js.Object {
  def apply[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Boolean = js.native
  def apply[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: BinaryPredicator[ValueType[Iterator1], ValueType[Iterator1]]
  ): Boolean = js.native
}

