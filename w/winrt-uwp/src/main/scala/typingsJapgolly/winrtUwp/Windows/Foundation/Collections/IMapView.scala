package typingsJapgolly.winrtUwp.Windows.Foundation.Collections

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.AnonFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an immutable view into a map. */
trait IMapView[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of elements in the map. */
  var size: Double
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): Boolean
  /**
    * Returns the item at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V
  /**
    * Splits the map view into two views.
    */
  def split(): AnonFirst[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: CallbackTo[IIterator[IKeyValuePair[js.Any, js.Any]]],
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

