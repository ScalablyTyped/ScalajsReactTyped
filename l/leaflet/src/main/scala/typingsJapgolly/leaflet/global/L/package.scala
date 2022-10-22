package typingsJapgolly.leaflet.global.L

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.anon.Alt
import typingsJapgolly.leaflet.anon.X
import typingsJapgolly.leaflet.global.L.^
import typingsJapgolly.leaflet.mod.BoundsLiteral
import typingsJapgolly.leaflet.mod.CircleMarkerOptions
import typingsJapgolly.leaflet.mod.DivIconOptions
import typingsJapgolly.leaflet.mod.GeoJSONOptions
import typingsJapgolly.leaflet.mod.GridLayerOptions
import typingsJapgolly.leaflet.mod.IconOptions
import typingsJapgolly.leaflet.mod.ImageOverlayOptions
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LatLngLiteral
import typingsJapgolly.leaflet.mod.LatLngTuple
import typingsJapgolly.leaflet.mod.LayerOptions
import typingsJapgolly.leaflet.mod.MapOptions
import typingsJapgolly.leaflet.mod.MarkerOptions
import typingsJapgolly.leaflet.mod.MixinType
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.PointTuple
import typingsJapgolly.leaflet.mod.PolylineOptions
import typingsJapgolly.leaflet.mod.PopupOptions
import typingsJapgolly.leaflet.mod.RendererOptions
import typingsJapgolly.leaflet.mod.TooltipOptions
import typingsJapgolly.leaflet.mod.VideoOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Mixin: MixinType = ^.asInstanceOf[js.Dynamic].selectDynamic("Mixin").asInstanceOf[MixinType]

inline def bind: js.Function2[
/* fn */ js.Function1[/* repeated */ Any, Unit], 
/* repeated */ Any, 
js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("bind").asInstanceOf[js.Function2[
/* fn */ js.Function1[/* repeated */ Any, Unit], 
/* repeated */ Any, 
js.Function0[Unit]]]

inline def bounds(points: js.Array[typingsJapgolly.leaflet.mod.Point_]): typingsJapgolly.leaflet.mod.Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Bounds_]
inline def bounds(points: BoundsLiteral): typingsJapgolly.leaflet.mod.Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Bounds_]
inline def bounds(topLeft: PointExpression, bottomRight: PointExpression): typingsJapgolly.leaflet.mod.Bounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Bounds_]

inline def canvas(): typingsJapgolly.leaflet.mod.Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[typingsJapgolly.leaflet.mod.Canvas_]
inline def canvas(options: RendererOptions): typingsJapgolly.leaflet.mod.Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Canvas_]

inline def circle(latlng: LatLngExpression): typingsJapgolly.leaflet.mod.Circle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, options: CircleMarkerOptions): typingsJapgolly.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double): typingsJapgolly.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions): typingsJapgolly.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Circle_[Any]]

inline def circleMarker(latlng: LatLngExpression): typingsJapgolly.leaflet.mod.CircleMarker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.CircleMarker_[Any]]
inline def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions): typingsJapgolly.leaflet.mod.CircleMarker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.CircleMarker_[Any]]

inline def divIcon(): typingsJapgolly.leaflet.mod.DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[typingsJapgolly.leaflet.mod.DivIcon_]
inline def divIcon(options: DivIconOptions): typingsJapgolly.leaflet.mod.DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.DivIcon_]

inline def extend(dest: Any, src: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(dest.asInstanceOf[js.Any]).`++`(src.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D & S1 = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any]).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2 & S3]

inline def featureGroup(): typingsJapgolly.leaflet.mod.FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[typingsJapgolly.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[typingsJapgolly.leaflet.mod.Layer]): typingsJapgolly.leaflet.mod.FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[typingsJapgolly.leaflet.mod.Layer], options: LayerOptions): typingsJapgolly.leaflet.mod.FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: Unit, options: LayerOptions): typingsJapgolly.leaflet.mod.FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.FeatureGroup_[Any]]

inline def geoJSON_[P](): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJSON_[P](geojson: js.Array[GeoJsonObject]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJSON_[P](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJSON_[P](geojson: Unit, options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJSON_[P](geojson: GeoJsonObject): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJSON_[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]

inline def geoJson[P](): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")().asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJson[P](geojson: js.Array[GeoJsonObject]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJson[P](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJson[P](geojson: Unit, options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJson[P](geojson: GeoJsonObject): typingsJapgolly.leaflet.mod.GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]
inline def geoJson[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): typingsJapgolly.leaflet.mod.GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.GeoJSON__[P]]

inline def gridLayer(): typingsJapgolly.leaflet.mod.GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[typingsJapgolly.leaflet.mod.GridLayer_]
inline def gridLayer(options: GridLayerOptions): typingsJapgolly.leaflet.mod.GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.GridLayer_]

inline def icon(options: IconOptions): typingsJapgolly.leaflet.mod.Icon_[IconOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Icon_[IconOptions]]

inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.ImageOverlay_]
inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typingsJapgolly.leaflet.mod.ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.ImageOverlay_]

inline def latLng(coords: js.Tuple3[Double, Double, Double]): typingsJapgolly.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
inline def latLng(coords: Alt): typingsJapgolly.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
inline def latLng(coords: LatLngLiteral): typingsJapgolly.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
inline def latLng(coords: LatLngTuple): typingsJapgolly.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
inline def latLng(latitude: Double, longitude: Double): typingsJapgolly.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
inline def latLng(latitude: Double, longitude: Double, altitude: Double): typingsJapgolly.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]

inline def latLngBounds(latlngs: js.Array[LatLngExpression]): typingsJapgolly.leaflet.mod.LatLngBounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LatLngBounds_]
inline def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): typingsJapgolly.leaflet.mod.LatLngBounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LatLngBounds_]

inline def layerGroup(): typingsJapgolly.leaflet.mod.LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[typingsJapgolly.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[typingsJapgolly.leaflet.mod.Layer]): typingsJapgolly.leaflet.mod.LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[typingsJapgolly.leaflet.mod.Layer], options: LayerOptions): typingsJapgolly.leaflet.mod.LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: Unit, options: LayerOptions): typingsJapgolly.leaflet.mod.LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LayerGroup_[Any]]

inline def map(element: String): typingsJapgolly.leaflet.mod.Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Map_]
inline def map(element: String, options: MapOptions): typingsJapgolly.leaflet.mod.Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Map_]
inline def map(element: HTMLElement): typingsJapgolly.leaflet.mod.Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Map_]
inline def map(element: HTMLElement, options: MapOptions): typingsJapgolly.leaflet.mod.Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Map_]

inline def marker(latlng: LatLngExpression): typingsJapgolly.leaflet.mod.Marker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Marker_[Any]]
inline def marker(latlng: LatLngExpression, options: MarkerOptions): typingsJapgolly.leaflet.mod.Marker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Marker_[Any]]

inline def noConflict(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Any]

inline def point(coords: X): typingsJapgolly.leaflet.mod.Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Point_]
inline def point(coords: PointTuple): typingsJapgolly.leaflet.mod.Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Point_]
inline def point(x: Double, y: Double): typingsJapgolly.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Point_]
inline def point(x: Double, y: Double, round: Boolean): typingsJapgolly.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Point_]

inline def polygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): typingsJapgolly.leaflet.mod.Polygon_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Polygon_[Any]]
inline def polygon(
  latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
  options: PolylineOptions
): typingsJapgolly.leaflet.mod.Polygon_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Polygon_[Any]]

inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): typingsJapgolly.leaflet.mod.Polyline_[LineString | MultiLineString, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Polyline_[LineString | MultiLineString, Any]]
inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): typingsJapgolly.leaflet.mod.Polyline_[LineString | MultiLineString, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Polyline_[LineString | MultiLineString, Any]]

inline def popup(): typingsJapgolly.leaflet.mod.Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[typingsJapgolly.leaflet.mod.Popup_]
inline def popup(options: Unit, source: typingsJapgolly.leaflet.mod.Layer): typingsJapgolly.leaflet.mod.Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Popup_]
inline def popup(options: PopupOptions): typingsJapgolly.leaflet.mod.Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Popup_]
inline def popup(options: PopupOptions, source: typingsJapgolly.leaflet.mod.Layer): typingsJapgolly.leaflet.mod.Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Popup_]

inline def rectangle(latLngBounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.Rectangle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Rectangle_[Any]]
inline def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions): typingsJapgolly.leaflet.mod.Rectangle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Rectangle_[Any]]

inline def setOptions: js.Function2[/* obj */ Any, /* options */ Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("setOptions").asInstanceOf[js.Function2[/* obj */ Any, /* options */ Any, Any]]

inline def stamp: js.Function1[/* obj */ Any, Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("stamp").asInstanceOf[js.Function1[/* obj */ Any, Double]]

inline def svg(): typingsJapgolly.leaflet.mod.SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[typingsJapgolly.leaflet.mod.SVG_]
inline def svg(options: RendererOptions): typingsJapgolly.leaflet.mod.SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.SVG_]

inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typingsJapgolly.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typingsJapgolly.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.SVGOverlay_]

inline def tooltip(): typingsJapgolly.leaflet.mod.Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[typingsJapgolly.leaflet.mod.Tooltip_]
inline def tooltip(options: Unit, source: typingsJapgolly.leaflet.mod.Layer): typingsJapgolly.leaflet.mod.Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Tooltip_]
inline def tooltip(options: TooltipOptions): typingsJapgolly.leaflet.mod.Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Tooltip_]
inline def tooltip(options: TooltipOptions, source: typingsJapgolly.leaflet.mod.Layer): typingsJapgolly.leaflet.mod.Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Tooltip_]

inline def transformation(a: Double, b: Double, c: Double, d: Double): typingsJapgolly.leaflet.mod.Transformation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.Transformation_]
inline def transformation(coefficients: js.Tuple4[Double, Double, Double, Double]): typingsJapgolly.leaflet.mod.Transformation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(coefficients.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Transformation_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def videoOverlay(video: String, bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typingsJapgolly.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.VideoOverlay_]
