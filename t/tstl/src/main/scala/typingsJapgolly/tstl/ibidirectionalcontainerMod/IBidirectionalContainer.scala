package typingsJapgolly.tstl.ibidirectionalcontainerMod

import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.ireversableiteratorMod.IReversableIterator
import typingsJapgolly.tstl.ireverseiteratorMod.IReverseIterator
import typingsJapgolly.tstl.vectorMod.Vector.Iterator
import typingsJapgolly.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBidirectionalContainer[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseIteratorT] */] extends IForwardContainer[IteratorT] {
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  def rbegin(): ReverseIteratorT
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  def rend(): ReverseIteratorT
}

@JSImport("tstl/ranges/container/IBidirectionalContainer", "IBidirectionalContainer")
@js.native
object IBidirectionalContainer extends js.Object {
  type IteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | Iterator[js.Any]
  type ReverseIteratorType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = js.Any | ReverseIterator[js.Any]
  type ValueType[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */] = typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}

