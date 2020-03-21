package typingsJapgolly.tstl.multiSetMod

import typingsJapgolly.tstl.multiSetMod.MultiSet.Iterator
import typingsJapgolly.tstl.multiSetMod.MultiSet.ReverseIterator
import typingsJapgolly.tstl.setContainerMod.SetContainer
import typingsJapgolly.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", "MultiSet")
@js.native
abstract class MultiSet_[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `false`, Source, IteratorT, ReverseT] {
  /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
}

