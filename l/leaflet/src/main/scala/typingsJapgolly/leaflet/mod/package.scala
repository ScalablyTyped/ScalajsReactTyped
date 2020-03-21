package typingsJapgolly.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsExpression = typingsJapgolly.leaflet.mod.Bounds_ | typingsJapgolly.leaflet.mod.BoundsLiteral
  type BoundsLiteral = js.Tuple2[typingsJapgolly.leaflet.mod.PointTuple, typingsJapgolly.leaflet.mod.PointTuple]
  type Content = java.lang.String | org.scalajs.dom.raw.HTMLElement
  type Control_ = typingsJapgolly.leaflet.mod.Control__
  type CrossOrigin = scala.Boolean | java.lang.String
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* tile */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type DragEndEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.DragEndEvent, scala.Unit]
  type ErrorEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.ErrorEvent, scala.Unit]
  type Icon_[T /* <: typingsJapgolly.leaflet.mod.BaseIconOptions */] = typingsJapgolly.leaflet.mod.Icon__[T]
  type InternalTiles = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.leaflet.AnonActive]
  type LatLngBoundsExpression = typingsJapgolly.leaflet.mod.LatLngBounds_ | typingsJapgolly.leaflet.mod.LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[typingsJapgolly.leaflet.mod.LatLngTuple]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.leaflet.mod.LatLng_
    - typingsJapgolly.leaflet.mod.LatLngLiteral
    - typingsJapgolly.leaflet.mod.LatLngTuple
  */
  type LatLngExpression = typingsJapgolly.leaflet.mod._LatLngExpression | typingsJapgolly.leaflet.mod.LatLngTuple
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  type LayerEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LayerEvent, scala.Unit]
  type LayersControlEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LayersControlEvent, scala.Unit]
  type LeafletEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LeafletEvent, scala.Unit]
  type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LeafletKeyboardEvent, scala.Unit]
  type LeafletMouseEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LeafletMouseEvent, scala.Unit]
  type LocationEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.LocationEvent, scala.Unit]
  type PointExpression = typingsJapgolly.leaflet.mod.Point_ | typingsJapgolly.leaflet.mod.PointTuple
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  type PopupEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.PopupEvent, scala.Unit]
  type ResizeEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.ResizeEvent, scala.Unit]
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[
      typingsJapgolly.geojson.mod.Feature[typingsJapgolly.geojson.mod.GeometryObject, P]
    ], 
    typingsJapgolly.leaflet.mod.PathOptions
  ]
  type TileErrorEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.TileErrorEvent, scala.Unit]
  type TileEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.TileEvent, scala.Unit]
  type TooltipEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.TooltipEvent, scala.Unit]
  type Zoom = scala.Boolean | typingsJapgolly.leaflet.leafletStrings.center
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ typingsJapgolly.leaflet.mod.ZoomAnimEvent, scala.Unit]
}
