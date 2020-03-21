package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.DrawGeometryFunctionType
import typingsJapgolly.openlayers.mod.EventsConditionType
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.MapBrowserEvent
import typingsJapgolly.openlayers.mod.StyleFunction
import typingsJapgolly.openlayers.mod.geom.GeometryType
import typingsJapgolly.openlayers.mod.geom.SimpleGeometry
import typingsJapgolly.openlayers.mod.source.Vector
import typingsJapgolly.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var finishCondition: js.UndefOr[EventsConditionType] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[EventsConditionType] = js.undefined
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: Int | Double = null,
    condition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    features: Collection[Feature] = null,
    finishCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: /* event */ MapBrowserEvent => CallbackTo[Boolean] = null,
    geometryFunction: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => CallbackTo[SimpleGeometry] = null,
    geometryName: String = null,
    maxPoints: Int | Double = null,
    minPoints: Int | Double = null,
    snapTolerance: Int | Double = null,
    source: Vector = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => condition(t0).runNow()))
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => finishCondition(t0).runNow()))
    if (!js.isUndefined(freehand)) __obj.updateDynamic("freehand")(freehand.asInstanceOf[js.Any])
    if (freehandCondition != null) __obj.updateDynamic("freehandCondition")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent) => freehandCondition(t0).runNow()))
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction2((t0: /* coords */ typingsJapgolly.openlayers.mod.Coordinate_ | (js.Array[
  js.Array[typingsJapgolly.openlayers.mod.Coordinate_] | typingsJapgolly.openlayers.mod.Coordinate_]), t1: /* geo */ js.UndefOr[typingsJapgolly.openlayers.mod.geom.SimpleGeometry]) => geometryFunction(t0, t1).runNow()))
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (minPoints != null) __obj.updateDynamic("minPoints")(minPoints.asInstanceOf[js.Any])
    if (snapTolerance != null) __obj.updateDynamic("snapTolerance")(snapTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stopClick)) __obj.updateDynamic("stopClick")(stopClick.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}

