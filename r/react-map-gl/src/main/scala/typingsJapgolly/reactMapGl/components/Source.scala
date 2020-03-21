package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.reactMapGl.mod.SourceProps
import typingsJapgolly.reactMapGl.reactMapGlStrings.mapbox
import typingsJapgolly.reactMapGl.reactMapGlStrings.terrarium
import typingsJapgolly.reactMapGl.reactMapGlStrings.tms
import typingsJapgolly.reactMapGl.reactMapGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Source {
  def apply(
    `type`: String,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    buffer: Int | Double = null,
    cluster: js.UndefOr[Boolean] = js.undefined,
    clusterMaxZoom: Int | Double = null,
    clusterProperties: js.Object = null,
    clusterRadius: Int | Double = null,
    coordinates: js.Array[js.Array[Double]] = null,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    encoding: terrarium | mapbox = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    schema: xyz | tms = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    tolerance: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SourceProps, typingsJapgolly.reactMapGl.mod.Source, Unit, SourceProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(cluster)) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterMaxZoom != null) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.asInstanceOf[js.Any])
    if (clusterProperties != null) __obj.updateDynamic("clusterProperties")(clusterProperties.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.SourceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.Source](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.SourceProps])(children: _*)
  }
  @JSImport("react-map-gl", "Source")
  @js.native
  object componentImport extends js.Object
  
}

