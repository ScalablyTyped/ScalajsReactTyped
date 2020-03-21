package typingsJapgolly.tstl.uniqueMapMod.UniqueMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link UniqueMap}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.Iterator<Key, T, true, SourceT, IteratorT, ReverseT> */
trait Iterator[Key, T, SourceT /* <: typingsJapgolly.tstl.uniqueMapMod.UniqueMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
  val value: Entry[Key, T]
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, T, SourceT /* <: typingsJapgolly.tstl.uniqueMapMod.UniqueMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */](
    first: Key,
    next: CallbackTo[IteratorT],
    prev: CallbackTo[IteratorT],
    reverse: CallbackTo[ReverseT],
    second: T,
    source: CallbackTo[SourceT],
    value: Entry[Key, T]
  ): Iterator[Key, T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[Iterator[Key, T, SourceT, IteratorT, ReverseT]]
  }
}

