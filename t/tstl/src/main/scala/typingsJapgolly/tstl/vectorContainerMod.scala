package typingsJapgolly.tstl

import typingsJapgolly.tstl.arrayContainerMod.ArrayContainer
import typingsJapgolly.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsJapgolly.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsJapgolly.tstl.icontainerMod.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/VectorContainer", JSImport.Namespace)
@js.native
object vectorContainerMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class VectorContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, ArrayT /* <: VectorContainer[T, SourceT, ArrayT, IteratorT, ReverseT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, T] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, T] */] protected () extends ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, T] {
    var data_ : js.Array[T] = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Access data.
      *
      * @return An array capsuled by this {@link Vector}.
      */
    def data(): js.Array[T] = js.native
  }
  
}

