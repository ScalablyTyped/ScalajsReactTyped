package typingsJapgolly.reactLeaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddLayerHandler = js.Function3[
    /* layer */ typingsJapgolly.leaflet.mod.Layer, 
    /* name */ java.lang.String, 
    /* checked */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type Children = japgolly.scalajs.react.raw.React.Node | js.Array[japgolly.scalajs.react.raw.React.Node]
  type LatLng = typingsJapgolly.leaflet.mod.LatLng_ | js.Array[scala.Double] | js.Object
  type LatLngBounds = typingsJapgolly.leaflet.mod.LatLngBounds_ | js.Array[typingsJapgolly.reactLeaflet.mod.LatLng]
  type LayersControl[P /* <: typingsJapgolly.reactLeaflet.mod.LayersControlProps */, E /* <: typingsJapgolly.leaflet.mod.Control_.Layers */] = typingsJapgolly.reactLeaflet.mod.LayersControl_[P, E]
  type LeafletEvents = typingsJapgolly.reactLeaflet.mod.MapEvents with typingsJapgolly.reactLeaflet.mod.MarkerEvents with typingsJapgolly.reactLeaflet.mod.TileLayerEvents with typingsJapgolly.reactLeaflet.mod.PathEvents with typingsJapgolly.reactLeaflet.mod.FeatureGroupEvents with typingsJapgolly.reactLeaflet.mod.LayersControlEvents
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Point = (js.Tuple2[scala.Double, scala.Double]) | typingsJapgolly.leaflet.mod.Point_
  type RemoveLayerHandler = js.Function1[/* layer */ typingsJapgolly.leaflet.mod.Layer, scala.Unit]
}
