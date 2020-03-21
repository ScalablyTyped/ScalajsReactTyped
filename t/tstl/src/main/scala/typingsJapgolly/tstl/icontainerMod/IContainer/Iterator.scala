package typingsJapgolly.tstl.icontainerMod.IContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link IContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined parent std.Readonly<tstl.tstl/iterator/IReversableIterator.IReversableIterator<T, IteratorT, ReverseIteratorT>> */
@js.native
trait Iterator[T /* <: Elem */, SourceT /* <: typingsJapgolly.tstl.icontainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends js.Object {
  val value: T = js.native
  def next(): IteratorT = js.native
  def prev(): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIteratorT = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT = js.native
}

