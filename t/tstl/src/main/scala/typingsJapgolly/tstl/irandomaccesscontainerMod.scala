package typingsJapgolly.tstl

import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import typingsJapgolly.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/container/IRandomAccessContainer", JSImport.Namespace)
@js.native
object irandomaccesscontainerMod extends js.Object {
  @js.native
  object IRandomAccessContainer extends js.Object {
    type IteratorType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = js.Any | Iterator[js.Any]
    type ValueType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType[IteratorType[Container]]
  }
  
  type IRandomAccessContainer[IteratorT /* <: IRandomAccessIterator[ValueType[IteratorT], IteratorT] */] = IForwardContainer[IteratorT]
}

