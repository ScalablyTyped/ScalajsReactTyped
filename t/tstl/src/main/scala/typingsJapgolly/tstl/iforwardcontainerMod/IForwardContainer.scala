package typingsJapgolly.tstl.iforwardcontainerMod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.isizeMod.ISize
import typingsJapgolly.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForwardContainer[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] extends ISize {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator
}

@JSImport("tstl/ranges/container/IForwardContainer", "IForwardContainer")
@js.native
object IForwardContainer extends js.Object {
  type IteratorType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Any | Iterator[js.Any]
  type SimilarType[Container /* <: js.Array[_] | IForwardContainer[_] */] = js.Array[typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container]] | (IForwardContainer[
    IForwardIterator[
      typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType[Container], 
      js.Any
    ]
  ])
  type ValueType[Container /* <: js.Array[_] | IForwardContainer[_] */] = typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[IteratorType[Container]]
}

