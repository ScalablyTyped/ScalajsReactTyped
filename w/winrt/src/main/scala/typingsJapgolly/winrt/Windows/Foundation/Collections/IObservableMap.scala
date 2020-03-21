package typingsJapgolly.winrt.Windows.Foundation.Collections

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableMap[K, V] extends IMap[K, V] {
  var onmapchanged: js.Any
}

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[K, V]]],
    getView: CallbackTo[IMapView[K, V]],
    hasKey: K => CallbackTo[Boolean],
    insert: (K, V) => CallbackTo[Boolean],
    lookup: K => CallbackTo[V],
    onmapchanged: js.Any,
    remove: K => Callback,
    size: Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(onmapchanged = onmapchanged.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("getView")(getView.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: K) => hasKey(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: K, t1: V) => insert(t0, t1).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: K) => lookup(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: K) => remove(t0).runNow()))
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
}

