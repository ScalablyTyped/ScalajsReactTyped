package typingsJapgolly.samchon.collectionsMod

import typingsJapgolly.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/collections", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected ()
  extends typingsJapgolly.ecol.mod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
}

