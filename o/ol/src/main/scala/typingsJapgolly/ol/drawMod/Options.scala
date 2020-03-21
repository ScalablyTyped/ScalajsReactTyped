package typingsJapgolly.ol.drawMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.conditionMod.Condition
import typingsJapgolly.ol.geometryTypeMod.GeometryType
import typingsJapgolly.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var dragVertexDelay: js.UndefOr[Double] = js.undefined
  var features: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ] = js.undefined
  var finishCondition: js.UndefOr[Condition] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[Condition] = js.undefined
  var geometryFunction: js.UndefOr[GeometryFunction] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[
    typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default]
  ] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: Int | Double = null,
    condition: Condition = null,
    dragVertexDelay: Int | Double = null,
    features: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = null,
    finishCondition: Condition = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: Condition = null,
    geometryFunction: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typingsJapgolly.ol.simpleGeometryMod.default]) => CallbackTo[typingsJapgolly.ol.simpleGeometryMod.default] = null,
    geometryName: String = null,
    maxPoints: Int | Double = null,
    minPoints: Int | Double = null,
    snapTolerance: Int | Double = null,
    source: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: StyleLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (dragVertexDelay != null) __obj.updateDynamic("dragVertexDelay")(dragVertexDelay.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(finishCondition.asInstanceOf[js.Any])
    if (!js.isUndefined(freehand)) __obj.updateDynamic("freehand")(freehand.asInstanceOf[js.Any])
    if (freehandCondition != null) __obj.updateDynamic("freehandCondition")(freehandCondition.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.drawMod.SketchCoordType, t1: /* p1 */ js.UndefOr[typingsJapgolly.ol.simpleGeometryMod.default]) => geometryFunction(t0, t1).runNow()))
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (minPoints != null) __obj.updateDynamic("minPoints")(minPoints.asInstanceOf[js.Any])
    if (snapTolerance != null) __obj.updateDynamic("snapTolerance")(snapTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stopClick)) __obj.updateDynamic("stopClick")(stopClick.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

