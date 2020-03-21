package typingsJapgolly.ol.selectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.conditionMod.Condition
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addCondition: js.UndefOr[Condition] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var features: js.UndefOr[
    typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ] = js.undefined
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[
    (js.Array[
      typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ]) | (js.Function1[
      /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      Boolean
    ])
  ] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var removeCondition: js.UndefOr[Condition] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var toggleCondition: js.UndefOr[Condition] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addCondition: Condition = null,
    condition: Condition = null,
    features: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = null,
    filter: (/* p0 */ FeatureLike, /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]) => CallbackTo[Boolean] = null,
    hitTolerance: Int | Double = null,
    layers: (js.Array[
      typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ]) | (js.Function1[
      /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      Boolean
    ]) = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    removeCondition: Condition = null,
    style: StyleLike = null,
    toggleCondition: Condition = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addCondition != null) __obj.updateDynamic("addCondition")(addCondition.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olFeatureMod.FeatureLike, t1: /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]) => filter(t0, t1).runNow()))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (removeCondition != null) __obj.updateDynamic("removeCondition")(removeCondition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toggleCondition != null) __obj.updateDynamic("toggleCondition")(toggleCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

