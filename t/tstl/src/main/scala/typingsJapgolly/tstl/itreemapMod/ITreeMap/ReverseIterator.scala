package typingsJapgolly.tstl.itreemapMod.ITreeMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link ITreeMap}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.ReverseIterator<Key, T, Unique, Source, IteratorT, ReverseT> */
trait ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: typingsJapgolly.tstl.itreemapMod.ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends js.Object {
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
  def source(): Source
}

object ReverseIterator {
  @scala.inline
  def apply[Key, T, Unique /* <: Boolean */, Source /* <: typingsJapgolly.tstl.itreemapMod.ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */](
    base: CallbackTo[IteratorT],
    first: Key,
    next: CallbackTo[ReverseT],
    prev: CallbackTo[ReverseT],
    second: T,
    source: CallbackTo[Source],
    value: Entry[Key, T]
  ): ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("base")(base.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.updateDynamic("source")(source.toJsFn)
    __obj.asInstanceOf[ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT]]
  }
}

