package typingsJapgolly.tstl.mapContainerMod.MapContainer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.IteratorBase<Key, T> & std.Readonly<tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, SourceT, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>> */
trait ReverseIterator[Key, T, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
  val value: Entry[Key, T]
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, T, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */](
    base: CallbackTo[IteratorT],
    first: Key,
    next: CallbackTo[ReverseT],
    prev: CallbackTo[ReverseT],
    second: T,
    source: CallbackTo[SourceT],
    value: Entry[Key, T]
  ): ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("base")(base.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT]]
  }
}

