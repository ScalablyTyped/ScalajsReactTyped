package typingsJapgolly.tstl.itreesetMod.ITreeSet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link ITreeSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.Iterator<Key, Unique, SourceT, IteratorT, ReverseT> */
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
    next: CallbackTo[IteratorT],
    prev: CallbackTo[IteratorT],
    reverse: CallbackTo[ReverseT],
    source: CallbackTo[SourceT],
    value: Key
  ): Iterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[Iterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
}

