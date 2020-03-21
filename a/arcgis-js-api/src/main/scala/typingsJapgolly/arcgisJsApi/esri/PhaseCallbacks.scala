package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseCallbacks extends Object {
  /**
    * A callback called before rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var prepare: js.UndefOr[PhaseCallback] = js.undefined
  /**
    * A callback to execute rendering logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var render: js.UndefOr[PhaseCallback] = js.undefined
  /**
    * A callback to execute state update logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var update: js.UndefOr[PhaseCallback] = js.undefined
}

object PhaseCallbacks {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    prepare: /* event */ js.UndefOr[PhaseEvent] => Callback = null,
    render: /* event */ js.UndefOr[PhaseEvent] => Callback = null,
    update: /* event */ js.UndefOr[PhaseEvent] => Callback = null
  ): PhaseCallbacks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[typingsJapgolly.arcgisJsApi.esri.PhaseEvent]) => prepare(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[typingsJapgolly.arcgisJsApi.esri.PhaseEvent]) => render(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[typingsJapgolly.arcgisJsApi.esri.PhaseEvent]) => update(t0).runNow()))
    __obj.asInstanceOf[PhaseCallbacks]
  }
}

