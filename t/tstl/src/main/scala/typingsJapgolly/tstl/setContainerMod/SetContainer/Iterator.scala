package typingsJapgolly.tstl.setContainerMod.SetContainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link SetContainer}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<Key, SourceT, IteratorT, ReverseT, Key>> */
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
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

