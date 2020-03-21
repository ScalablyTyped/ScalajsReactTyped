package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.leaflet.mod.FillRule
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerEvent
import typingsJapgolly.leaflet.mod.LeafletEvent
import typingsJapgolly.leaflet.mod.LeafletMouseEvent
import typingsJapgolly.leaflet.mod.LineCapShape
import typingsJapgolly.leaflet.mod.LineJoinShape
import typingsJapgolly.leaflet.mod.PathOptions
import typingsJapgolly.leaflet.mod.PopupEvent
import typingsJapgolly.leaflet.mod.Renderer
import typingsJapgolly.leaflet.mod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.LayerOptions because Already inherited
- typingsJapgolly.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsJapgolly.leaflet.mod.GeoJSONOptions because var conflicts: attribution, pane. Inlined coordsToLatLng, filter, onEachFeature, pointToLayer, style
- typingsJapgolly.reactLeaflet.mod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onmouseout, onmouseover. Inlined onlayeradd, onlayerremove
- typingsJapgolly.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait GeoJSONProps
  extends PathOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.undefined
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ] = js.undefined
  var data: GeoJsonObject
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[js.Function1[/* geoJsonFeature */ Feature[GeometryObject, js.Any], Boolean]] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[
    js.Function2[/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer, Unit]
  ] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[
    js.Function2[
      /* geoJsonPoint */ Feature[typingsJapgolly.geojson.mod.Point, js.Any], 
      /* latlng */ LatLng_, 
      Layer
    ]
  ] = js.undefined
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[PathOptions | StyleFunction[js.Any]] = js.undefined
}

object GeoJSONProps {
  @scala.inline
  def apply(
    data: GeoJsonObject,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    className: String = null,
    color: String = null,
    coordsToLatLng: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => CallbackTo[LatLng_] = null,
    dashArray: String | js.Array[Double] = null,
    dashOffset: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    fillRule: FillRule = null,
    filter: /* geoJsonFeature */ Feature[GeometryObject, js.Any] => CallbackTo[Boolean] = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    onEachFeature: (/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer) => Callback = null,
    onadd: /* event */ LeafletEvent => Callback = null,
    onclick: /* event */ LeafletMouseEvent => Callback = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Callback = null,
    ondblclick: /* event */ LeafletMouseEvent => Callback = null,
    onlayeradd: /* event */ LayerEvent => Callback = null,
    onlayerremove: /* event */ LayerEvent => Callback = null,
    onmousedown: /* event */ LeafletMouseEvent => Callback = null,
    onmouseout: /* event */ LeafletMouseEvent => Callback = null,
    onmouseover: /* event */ LeafletMouseEvent => Callback = null,
    onpopupclose: /* event */ PopupEvent => Callback = null,
    onpopupopen: /* event */ PopupEvent => Callback = null,
    onremove: /* event */ LeafletEvent => Callback = null,
    opacity: Int | Double = null,
    pane: String = null,
    pointToLayer: (/* geoJsonPoint */ Feature[typingsJapgolly.geojson.mod.Point, js.Any], /* latlng */ LatLng_) => CallbackTo[Layer] = null,
    renderer: Renderer = null,
    stroke: js.UndefOr[Boolean] = js.undefined,
    style: PathOptions | StyleFunction[js.Any] = null,
    weight: Int | Double = null
  ): GeoJSONProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (coordsToLatLng != null) __obj.updateDynamic("coordsToLatLng")(js.Any.fromFunction1((t0: /* coords */ (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])) => coordsToLatLng(t0).runNow()))
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* geoJsonFeature */ typingsJapgolly.geojson.mod.Feature[typingsJapgolly.geojson.mod.GeometryObject, js.Any]) => filter(t0).runNow()))
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (onEachFeature != null) __obj.updateDynamic("onEachFeature")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.geojson.mod.Feature[typingsJapgolly.geojson.mod.GeometryObject, js.Any], t1: /* layer */ typingsJapgolly.leaflet.mod.Layer) => onEachFeature(t0, t1).runNow()))
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onadd(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onclick(t0).runNow()))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => oncontextmenu(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => ondblclick(t0).runNow()))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayeradd(t0).runNow()))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LayerEvent) => onlayerremove(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmousedown(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent) => onmouseover(t0).runNow()))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupclose(t0).runNow()))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.PopupEvent) => onpopupopen(t0).runNow()))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.leaflet.mod.LeafletEvent) => onremove(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (pointToLayer != null) __obj.updateDynamic("pointToLayer")(js.Any.fromFunction2((t0: /* geoJsonPoint */ typingsJapgolly.geojson.mod.Feature[typingsJapgolly.geojson.mod.Point, js.Any], t1: /* latlng */ typingsJapgolly.leaflet.mod.LatLng_) => pointToLayer(t0, t1).runNow()))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONProps]
  }
}

