package typingsJapgolly.ol.translateMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
}

object Options {
  @scala.inline
  def apply(
    features: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = null,
    filter: (/* p0 */ FeatureLike, /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]) => CallbackTo[Boolean] = null,
    hitTolerance: Int | Double = null,
    layers: (js.Array[
      typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ]) | (js.Function1[
      /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
      Boolean
    ]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olFeatureMod.FeatureLike, t1: /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]) => filter(t0, t1).runNow()))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

