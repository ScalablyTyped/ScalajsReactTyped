package typingsJapgolly.reactLeafletMarkercluster

import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leafletMarkercluster.mod.MarkerClusterGroupOptions
import typingsJapgolly.reactLeaflet.mod.MapLayer
import typingsJapgolly.reactLeaflet.mod.MapLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet-markercluster", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}

