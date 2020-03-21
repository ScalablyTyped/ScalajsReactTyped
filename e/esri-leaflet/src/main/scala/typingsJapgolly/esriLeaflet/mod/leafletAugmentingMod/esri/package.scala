package typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esri {
  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, scala.Unit]
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  /**
    * Options for Find Task
    */
  type FindOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  type GeoJSONGeometry = typingsJapgolly.geojson.mod.Point | typingsJapgolly.geojson.mod.Polygon | typingsJapgolly.geojson.mod.LineString
  type Geometry = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.LeafletGeometry | typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.GeoJSONGeometry
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  type LeafletGeometry = typingsJapgolly.leaflet.mod.Marker_[js.Any] | typingsJapgolly.leaflet.mod.Polygon_[js.Any] | (typingsJapgolly.leaflet.mod.Polyline_[
    typingsJapgolly.geojson.mod.LineString | typingsJapgolly.geojson.mod.MultiLineString, 
    js.Any
  ]) | typingsJapgolly.leaflet.mod.LatLngExpression | typingsJapgolly.leaflet.mod.LatLngBounds_ | typingsJapgolly.leaflet.mod.GeoJSON_[js.Any]
  /**
    * Options for MapService
    */
  type MapServiceOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  /**
    * Options for Query
    */
  type QueryOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], scala.Unit]
  type SpatialReferenceExpression = scala.Double | typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.SpatialReference
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  /**
    * Options for Task
    */
  type TaskOptions = typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
}
