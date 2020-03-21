package typingsJapgolly.amapJsApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.amapJsApi.AMap.BezierCurve.Options
import typingsJapgolly.amapJsApi.AMap.LocationValue
import typingsJapgolly.amapJsApi.AMap.MassMarks.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAMap extends js.Object {
  var ArrayBounds: Instantiable1[/* bounds */ js.Array[LocationValue], typingsJapgolly.amapJsApi.AMap.ArrayBounds] = js.native
  val BezierCurve: Instantiable1[
    /* options */ Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any], 
    typingsJapgolly.amapJsApi.AMap.BezierCurve[js.Object]
  ] = js.native
  var Bounds: Instantiable1[
    js.UndefOr[/* coords */ js.Tuple4[Double, Double, Double, Double]], 
    typingsJapgolly.amapJsApi.AMap.Bounds
  ] = js.native
  val Browser: TypeofBrowser = js.native
  val Buildings: Instantiable1[
    js.UndefOr[/* opts */ typingsJapgolly.amapJsApi.AMap.Buildings.Options], 
    typingsJapgolly.amapJsApi.AMap.Buildings
  ] = js.native
  var CanvasLayer: Instantiable0[typingsJapgolly.amapJsApi.AMap.CanvasLayer] = js.native
  val Circle: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.Circle.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.Circle[js.Object]
  ] = js.native
  // tslint:disable-next-line;
  /**
    * 圆点标记
    */
  var CircleMarker: Instantiable0[typingsJapgolly.amapJsApi.AMap.CircleMarker[js.Object]] = js.native
  val ContextMenu: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.ContextMenu.Options], 
    typingsJapgolly.amapJsApi.AMap.ContextMenu[js.Object]
  ] = js.native
  val DomUtil: TypeofDomUtil = js.native
  val Ellipse: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.Ellipse.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.Ellipse[js.Object]
  ] = js.native
  var EventEmitter: Instantiable0[typingsJapgolly.amapJsApi.AMap.EventEmitter] = js.native
  val GeoJSON: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.GeoJSON.Options], 
    typingsJapgolly.amapJsApi.AMap.GeoJSON[js.Object]
  ] = js.native
  val GeometryUtil: TypeofGeometryUtil = js.native
  val Icon: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.Icon.Options], 
    typingsJapgolly.amapJsApi.AMap.Icon
  ] = js.native
  /**
    * 图片图层
    */
  var ImageLayer: Instantiable0[typingsJapgolly.amapJsApi.AMap.ImageLayer] = js.native
  val InfoWindow: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.InfoWindow.Options[js.Any]], 
    typingsJapgolly.amapJsApi.AMap.InfoWindow[js.Object]
  ] = js.native
  val LabelMarker: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.LabelMarker.Options[js.Any]], 
    typingsJapgolly.amapJsApi.AMap.LabelMarker[js.Object]
  ] = js.native
  val LabelsLayer: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.LabelsLayer.Options], 
    typingsJapgolly.amapJsApi.AMap.LabelsLayer
  ] = js.native
  val Layer: Instantiable0[typingsJapgolly.amapJsApi.AMap.Layer] = js.native
  var LayerGroup: Instantiable1[
    /* layers */ (/* import warning: RewrittenClass.unapply cls was tparam L */ js.Any) | (js.Array[/* import warning: RewrittenClass.unapply cls was tparam L */ js.Any]), 
    typingsJapgolly.amapJsApi.AMap.LayerGroup[js.Object]
  ] = js.native
  var LngLat: Instantiable3[
    /* lng */ Double, 
    /* lat */ Double, 
    js.UndefOr[/* noAutofix */ Boolean], 
    typingsJapgolly.amapJsApi.AMap.LngLat
  ] = js.native
  val Map: Instantiable2[
    /* container */ String | HTMLElement, 
    js.UndefOr[/* opts */ typingsJapgolly.amapJsApi.AMap.Map.Options], 
    typingsJapgolly.amapJsApi.AMap.Map
  ] = js.native
  val Marker: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.Marker.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.Marker[js.Object]
  ] = js.native
  val MarkerShape: Instantiable1[
    /* options */ typingsJapgolly.amapJsApi.AMap.MarkerShape.Options, 
    typingsJapgolly.amapJsApi.AMap.MarkerShape
  ] = js.native
  val MassMarks: Instantiable2[
    /* data */ (js.Array[/* import warning: RewrittenClass.unapply cls was tparam D */ js.Any]) | String, 
    /* opts */ typingsJapgolly.amapJsApi.AMap.MassMarks.Options, 
    typingsJapgolly.amapJsApi.AMap.MassMarks[Data]
  ] = js.native
  val MediaLayer: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.MediaLayer.Options], 
    typingsJapgolly.amapJsApi.AMap.MediaLayer[HTMLElement]
  ] = js.native
  val Overlay: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.Overlay.Options[js.Any]], 
    typingsJapgolly.amapJsApi.AMap.Overlay[js.Object]
  ] = js.native
  var OverlayGroup: Instantiable1[
    js.UndefOr[
      (/* import warning: RewrittenClass.unapply cls was tparam O */ js.Any) | (js.Array[/* import warning: RewrittenClass.unapply cls was tparam O */ js.Any])
    ], 
    typingsJapgolly.amapJsApi.AMap.OverlayGroup[typingsJapgolly.amapJsApi.AMap.Overlay[js.Any], js.Object]
  ] = js.native
  val PathOverlay: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.PathOverlay.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.PathOverlay[js.Object]
  ] = js.native
  var Pixel: Instantiable3[
    /* x */ Double, 
    /* y */ Double, 
    js.UndefOr[/* round */ Boolean], 
    typingsJapgolly.amapJsApi.AMap.Pixel
  ] = js.native
  val Polygon: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.Polygon.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.Polygon[js.Object]
  ] = js.native
  val Polyline: Instantiable1[
    js.UndefOr[
      (Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]) | (typingsJapgolly.amapJsApi.AMap.Polyline.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any])
    ], 
    typingsJapgolly.amapJsApi.AMap.Polyline[js.Object]
  ] = js.native
  val Rectangle: Instantiable1[
    js.UndefOr[
      /* options */ typingsJapgolly.amapJsApi.AMap.Rectangle.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typingsJapgolly.amapJsApi.AMap.Rectangle[js.Object]
  ] = js.native
  val ShapeOverlay: Instantiable0[typingsJapgolly.amapJsApi.AMap.ShapeOverlay[js.Object]] = js.native
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typingsJapgolly.amapJsApi.AMap.Size] = js.native
  val Text: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.Text.Options], 
    typingsJapgolly.amapJsApi.AMap.Text[js.Object]
  ] = js.native
  val TileLayer: TypeofTileLayer with (Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.TileLayer.Options], 
    typingsJapgolly.amapJsApi.AMap.TileLayer
  ]) = js.native
  val Util: TypeofUtil = js.native
  var VideoLayer: Instantiable0[typingsJapgolly.amapJsApi.AMap.VideoLayer] = js.native
  val View2D: Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.amapJsApi.AMap.View2D.Options], 
    typingsJapgolly.amapJsApi.AMap.View2D
  ] = js.native
  val convertFrom: TypeofconvertFrom = js.native
  val event: Typeofevent = js.native
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def plugin(plugin: String, callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  def plugin(plugin: js.Array[String], callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def service(plugin: String, callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  def service(plugin: js.Array[String], callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
}

