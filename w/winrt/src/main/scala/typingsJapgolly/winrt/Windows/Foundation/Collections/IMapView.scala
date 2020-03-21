package typingsJapgolly.winrt.Windows.Foundation.Collections

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: Double
  def hasKey(key: K): Boolean
  def lookup(key: K): V
  def split(): AnonFirst[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: CallbackTo[IIterator[IKeyValuePair[K, V]]],
    hasKey: K => CallbackTo[Boolean],
    lookup: K => CallbackTo[V],
    size: Double,
    split: CallbackTo[AnonFirst[K, V]]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: K) => hasKey(t0).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: K) => lookup(t0).runNow()))
    __obj.updateDynamic("split")(split.toJsFn)
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

