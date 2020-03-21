package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import typingsJapgolly.openlayers.mod.StyleFunction
import typingsJapgolly.openlayers.mod.source.Vector
import typingsJapgolly.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var deleteCondition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object ModifyOptions {
  @scala.inline
  def apply(
    condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    deleteCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    features: Collection[Feature] = null,
    insertVertexCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    pixelTolerance: Int | Double = null,
    source: Vector = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (deleteCondition != null) __obj.updateDynamic("deleteCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => deleteCondition(t0).runNow()))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (insertVertexCondition != null) __obj.updateDynamic("insertVertexCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => insertVertexCondition(t0).runNow()))
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptions]
  }
}

