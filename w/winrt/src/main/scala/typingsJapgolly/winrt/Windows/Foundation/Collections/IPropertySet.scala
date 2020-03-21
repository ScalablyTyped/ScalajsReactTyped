package typingsJapgolly.winrt.Windows.Foundation.Collections

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertySet
  extends IObservableMap[String, js.Any]

object IPropertySet {
  @scala.inline
  def apply(
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[String, js.Any]]],
    getView: CallbackTo[IMapView[String, js.Any]],
    hasKey: String => CallbackTo[Boolean],
    insert: (String, js.Any) => CallbackTo[Boolean],
    lookup: String => CallbackTo[js.Any],
    onmapchanged: js.Any,
    remove: String => Callback,
    size: Double
  ): IPropertySet = {
    val __obj = js.Dynamic.literal(onmapchanged = onmapchanged.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("getView")(getView.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: java.lang.String) => hasKey(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => insert(t0, t1).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[IPropertySet]
  }
}

