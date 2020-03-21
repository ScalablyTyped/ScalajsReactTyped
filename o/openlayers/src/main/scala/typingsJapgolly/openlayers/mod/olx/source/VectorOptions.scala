package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.FeatureLoader_
import typingsJapgolly.openlayers.mod.FeatureUrlFunction
import typingsJapgolly.openlayers.mod.LoadingStrategy_
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var features: js.UndefOr[js.Array[Feature] | Collection[Feature]] = js.undefined
  var format: js.UndefOr[typingsJapgolly.openlayers.mod.format.Feature] = js.undefined
  var loader: js.UndefOr[FeatureLoader_] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var overlaps: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[LoadingStrategy_] = js.undefined
  var url: js.UndefOr[String | FeatureUrlFunction] = js.undefined
  var useSpatialIndex: js.UndefOr[Boolean] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object VectorOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    features: js.Array[Feature] | Collection[Feature] = null,
    format: typingsJapgolly.openlayers.mod.format.Feature = null,
    loader: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => Callback = null,
    logo: String | LogoOptions = null,
    overlaps: js.UndefOr[Boolean] = js.undefined,
    strategy: (/* extent */ Extent_, /* resolution */ Double) => CallbackTo[js.Array[Extent_]] = null,
    url: String | FeatureUrlFunction = null,
    useSpatialIndex: js.UndefOr[Boolean] = js.undefined,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): VectorOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(js.Any.fromFunction3((t0: /* extent */ typingsJapgolly.openlayers.mod.Extent_, t1: /* resolution */ scala.Double, t2: /* proj */ typingsJapgolly.openlayers.mod.proj.Projection) => loader(t0, t1, t2).runNow()))
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(js.Any.fromFunction2((t0: /* extent */ typingsJapgolly.openlayers.mod.Extent_, t1: /* resolution */ scala.Double) => strategy(t0, t1).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useSpatialIndex)) __obj.updateDynamic("useSpatialIndex")(useSpatialIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorOptions]
  }
}

