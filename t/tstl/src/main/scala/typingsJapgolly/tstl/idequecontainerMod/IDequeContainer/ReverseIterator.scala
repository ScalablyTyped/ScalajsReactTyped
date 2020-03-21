package typingsJapgolly.tstl.idequecontainerMod.IDequeContainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IDequeContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, ElemT> */
trait ReverseIterator[T /* <: ElemT */, SourceT /* <: typingsJapgolly.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
  val value: T
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[T /* <: ElemT */, SourceT /* <: typingsJapgolly.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT](
    base: CallbackTo[IteratorT],
    next: CallbackTo[ReverseT],
    prev: CallbackTo[ReverseT],
    source: CallbackTo[SourceT],
    value: T
  ): ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("base")(base.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]]
  }
}

