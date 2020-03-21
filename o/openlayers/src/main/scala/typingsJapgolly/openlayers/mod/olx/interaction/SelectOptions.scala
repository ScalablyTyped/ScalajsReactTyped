package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import typingsJapgolly.openlayers.mod.SelectFilterFunction
import typingsJapgolly.openlayers.mod.StyleFunction
import typingsJapgolly.openlayers.mod.layer.Layer
import typingsJapgolly.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var addCondition: js.UndefOr[EventsConditionType] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var filter: js.UndefOr[SelectFilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var removeCondition: js.UndefOr[EventsConditionType] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var toggleCondition: js.UndefOr[EventsConditionType] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    addCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    features: Collection[Feature] = null,
    filter: (/* feature */ Feature | typingsJapgolly.openlayers.mod.render.Feature, /* layer */ Layer) => CallbackTo[Boolean] = null,
    hitTolerance: Int | Double = null,
    layers: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean]) = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    removeCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    toggleCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (addCondition != null) __obj.updateDynamic("addCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => addCondition(t0).runNow()))
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.openlayers.mod.Feature | typingsJapgolly.openlayers.mod.render.Feature, t1: /* layer */ typingsJapgolly.openlayers.mod.layer.Layer) => filter(t0, t1).runNow()))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (removeCondition != null) __obj.updateDynamic("removeCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => removeCondition(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toggleCondition != null) __obj.updateDynamic("toggleCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => toggleCondition(t0).runNow()))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
}

