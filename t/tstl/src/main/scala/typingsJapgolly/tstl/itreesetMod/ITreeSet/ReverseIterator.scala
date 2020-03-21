package typingsJapgolly.tstl.itreesetMod.ITreeSet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link ITreeSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, Unique, SourceT, IteratorT, ReverseT> */
trait ReverseIterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
    base: CallbackTo[IteratorT],
    next: CallbackTo[ReverseT],
    prev: CallbackTo[ReverseT],
    source: CallbackTo[SourceT],
    value: Key
  ): ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("base")(base.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
}

