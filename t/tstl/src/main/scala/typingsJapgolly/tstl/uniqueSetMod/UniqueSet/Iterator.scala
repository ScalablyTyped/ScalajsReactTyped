package typingsJapgolly.tstl.uniqueSetMod.UniqueSet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link UniqueSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.Iterator<Key, true, SourceT, IteratorT, ReverseT> */
trait Iterator[Key, SourceT /* <: typingsJapgolly.tstl.uniqueSetMod.UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, SourceT /* <: typingsJapgolly.tstl.uniqueSetMod.UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */](
    next: CallbackTo[IteratorT],
    prev: CallbackTo[IteratorT],
    reverse: CallbackTo[ReverseT],
    source: CallbackTo[SourceT],
    value: Key
  ): Iterator[Key, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[Iterator[Key, SourceT, IteratorT, ReverseT]]
  }
}

