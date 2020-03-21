package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.`fill-extrusion`
import typingsJapgolly.mapboxGl.mapboxGlStrings.background
import typingsJapgolly.mapboxGl.mapboxGlStrings.circle
import typingsJapgolly.mapboxGl.mapboxGlStrings.fill
import typingsJapgolly.mapboxGl.mapboxGlStrings.heatmap
import typingsJapgolly.mapboxGl.mapboxGlStrings.hillshade
import typingsJapgolly.mapboxGl.mapboxGlStrings.line
import typingsJapgolly.mapboxGl.mapboxGlStrings.raster
import typingsJapgolly.mapboxGl.mapboxGlStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: String
  var interactive: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[AnyLayout] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var paint: js.UndefOr[
    BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  ] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String | AnySourceData] = js.undefined
  var `source-layer`: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    fill | line | symbol | circle | `fill-extrusion` | raster | background | heatmap | hillshade
  ] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    id: String,
    filter: js.Array[_] = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    layout: AnyLayout = null,
    maxzoom: Int | Double = null,
    metadata: js.Any = null,
    minzoom: Int | Double = null,
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint = null,
    ref: String = null,
    source: String | AnySourceData = null,
    `source-layer`: String = null,
    `type`: fill | line | symbol | circle | `fill-extrusion` | raster | background | heatmap | hillshade = null
  ): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (paint != null) __obj.updateDynamic("paint")(paint.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`source-layer` != null) __obj.updateDynamic("source-layer")(`source-layer`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

