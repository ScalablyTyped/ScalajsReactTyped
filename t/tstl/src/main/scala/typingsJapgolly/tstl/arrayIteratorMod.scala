package typingsJapgolly.tstl

import typingsJapgolly.tstl.arrayContainerMod.ArrayContainer
import typingsJapgolly.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsJapgolly.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ArrayIterator", JSImport.Namespace)
@js.native
object arrayIteratorMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.tstl.iarraycontainerMod.IArrayContainer.Iterator because var conflicts: equals_Original, value. Inlined  */ @js.native
  class ArrayIterator[T, SourceT /* <: ArrayContainer[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T] */] () extends ArrayIteratorBase[T, SourceT, SourceT, ArrayIterator[T, SourceT], ArrayReverseIterator[T, SourceT], T]
  
}

