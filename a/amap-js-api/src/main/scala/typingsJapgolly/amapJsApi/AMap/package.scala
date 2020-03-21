package typingsJapgolly.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AMap {
  type BezierCurve[ExtraData] = typingsJapgolly.amapJsApi.AMap.BezierCurve_[ExtraData]
  type Buildings = typingsJapgolly.amapJsApi.AMap.Buildings_
  type Circle[ExtraData] = typingsJapgolly.amapJsApi.AMap.Circle_[ExtraData]
  type ContextMenu[ExtraData] = typingsJapgolly.amapJsApi.AMap.ContextMenu_[ExtraData]
  type Ellipse[ExtraData] = typingsJapgolly.amapJsApi.AMap.Ellipse_[ExtraData]
  type GeoJSON[ExtraData] = typingsJapgolly.amapJsApi.AMap.GeoJSON_[ExtraData]
  type Icon = typingsJapgolly.amapJsApi.AMap.Icon_
  type InfoWindow[ExtraData] = typingsJapgolly.amapJsApi.AMap.InfoWindow_[ExtraData]
  type LabelMarker[ExtraData] = typingsJapgolly.amapJsApi.AMap.LabelMarker_[ExtraData]
  type LabelsLayer = typingsJapgolly.amapJsApi.AMap.LabelsLayer_
  type Layer = typingsJapgolly.amapJsApi.AMap.Layer_
  type LocationValue = typingsJapgolly.amapJsApi.AMap.LngLat | (js.Tuple2[scala.Double, scala.Double])
  type Map = typingsJapgolly.amapJsApi.AMap.Map_
  type Marker[ExtraData] = typingsJapgolly.amapJsApi.AMap.Marker_[ExtraData]
  type MarkerShape = typingsJapgolly.amapJsApi.AMap.MarkerShape_
  type MassMarks[D /* <: typingsJapgolly.amapJsApi.AMap.MassMarks.Data */] = typingsJapgolly.amapJsApi.AMap.MassMarks_[D]
  type MediaLayer[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsJapgolly.amapJsApi.AMap.MediaLayer_[E]
  type Merge[O, T] = O with T
  type Omit[T, E /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typingsJapgolly.amapJsApi.amapJsApiStrings.Omit with T
  type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  type Overlay[ExtraData] = typingsJapgolly.amapJsApi.AMap.Overlay_[ExtraData]
  type PathOverlay[ExtraData] = typingsJapgolly.amapJsApi.AMap.PathOverlay_[ExtraData]
  type Polygon[ExtraData] = typingsJapgolly.amapJsApi.AMap.Polygon_[ExtraData]
  type Polyline[ExtraData] = typingsJapgolly.amapJsApi.AMap.Polyline_[ExtraData]
  type Rectangle[ExtraData] = typingsJapgolly.amapJsApi.AMap.Rectangle_[ExtraData]
  type ShapeOverlay[ExtraData] = typingsJapgolly.amapJsApi.AMap.ShapeOverlay_[ExtraData]
  type SizeValue = typingsJapgolly.amapJsApi.AMap.Size | (js.Tuple2[scala.Double, scala.Double])
  type Text[ExtraData] = typingsJapgolly.amapJsApi.AMap.Text_[ExtraData]
  type TileLayer = typingsJapgolly.amapJsApi.AMap.TileLayer_
  type View2D = typingsJapgolly.amapJsApi.AMap.View2D_
}
