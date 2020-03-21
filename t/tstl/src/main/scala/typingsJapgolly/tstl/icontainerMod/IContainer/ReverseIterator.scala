package typingsJapgolly.tstl.icontainerMod.IContainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IContainer}
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined parent std.Readonly<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, IteratorT, ReverseT>> */
trait ReverseIterator[T /* <: Elem */, Source /* <: typingsJapgolly.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem] extends js.Object {
  val value: T
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): Source
}

object ReverseIterator {
  @scala.inline
  def apply[T /* <: Elem */, Source /* <: typingsJapgolly.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem](
    base: CallbackTo[IteratorT],
    next: CallbackTo[ReverseT],
    prev: CallbackTo[ReverseT],
    source: CallbackTo[Source],
    value: T
  ): ReverseIterator[T, Source, IteratorT, ReverseT, Elem] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("base")(base.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[ReverseIterator[T, Source, IteratorT, ReverseT, Elem]]
  }
}

