package typingsJapgolly.leaflet.mod

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.geojson.mod.GeometryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "GeoJSON")
@js.native
open class GeoJSON__[P] () extends FeatureGroup_[P] {
  def this(geojson: GeoJsonObject) = this()
  def this(geojson: Unit, options: GeoJSONOptions[P]) = this()
  def this(geojson: GeoJsonObject, options: GeoJSONOptions[P]) = this()
  
  /**
    * Adds a GeoJSON object to the layer.
    */
  def addData(data: GeoJsonObject): this.type = js.native
  
  var options: GeoJSONOptions[P] = js.native
  
  /**
    * Resets the given vector layer's style to the original GeoJSON style,
    * useful for resetting style after hover events.
    */
  def resetStyle(): this.type = js.native
  def resetStyle(layer: Layer): this.type = js.native
  
  def setStyle(style: StyleFunction[P]): this.type = js.native
}
/* static members */
object GeoJSON__ {
  
  @JSImport("leaflet", "GeoJSON")
  @js.native
  val ^ : js.Any = js.native
  
  // Using any[] to avoid artificially limiting valid calls
  /**
    * Normalize GeoJSON geometries/features into GeoJSON features.
    */
  inline def asFeature[P](geojson: Feature[GeometryObject, P]): Feature[GeometryObject, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFeature")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[GeometryObject, P]]
  inline def asFeature[P](geojson: GeometryObject): Feature[GeometryObject, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFeature")(geojson.asInstanceOf[js.Any]).asInstanceOf[Feature[GeometryObject, P]]
  
  /**
    * Creates a LatLng object from an array of 2 numbers (longitude, latitude) or
    * 3 numbers (longitude, latitude, altitude) used in GeoJSON for points.
    */
  inline def coordsToLatLng(coords: js.Tuple2[Double, Double]): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
  inline def coordsToLatLng(coords: js.Tuple3[Double, Double, Double]): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
  
  /**
    * Creates a multidimensional array of LatLngs from a GeoJSON coordinates array.
    * levelsDeep specifies the nesting level (0 is for an array of points, 1 for an array of
    * arrays of points, etc., 0 by default).
    * Can use a custom coordsToLatLng function.
    */
  inline def coordsToLatLngs(coords: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(coords: js.Array[Any], levelsDeep: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(
    coords: js.Array[Any],
    levelsDeep: Double,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], coordsToLatLng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def coordsToLatLngs(
    coords: js.Array[Any],
    levelsDeep: Unit,
    coordsToLatLng: js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coordsToLatLngs")(coords.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], coordsToLatLng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * Creates a Layer from a given GeoJSON feature. Can use a custom pointToLayer
    * and/or coordsToLatLng functions if provided as options.
    */
  inline def geometryToLayer[P](featureData: Feature[GeometryObject, P]): Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("geometryToLayer")(featureData.asInstanceOf[js.Any]).asInstanceOf[Layer]
  inline def geometryToLayer[P](featureData: Feature[GeometryObject, P], options: GeoJSONOptions[P]): Layer = (^.asInstanceOf[js.Dynamic].applyDynamic("geometryToLayer")(featureData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layer]
  
  /**
    * Convert layer into GeoJSON feature
    */
  inline def getFeature[P](layer: Layer, newGeometry: Feature[GeometryObject, P]): Feature[GeometryObject, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFeature")(layer.asInstanceOf[js.Any], newGeometry.asInstanceOf[js.Any])).asInstanceOf[Feature[GeometryObject, P]]
  inline def getFeature[P](layer: Layer, newGeometry: GeometryObject): Feature[GeometryObject, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFeature")(layer.asInstanceOf[js.Any], newGeometry.asInstanceOf[js.Any])).asInstanceOf[Feature[GeometryObject, P]]
  
  // Using any[] to avoid artificially limiting valid calls
  /**
    * Reverse of coordsToLatLng
    */
  inline def latLngToCoords(latlng: LatLng_): (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngToCoords")(latlng.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])]
  
  /**
    * Reverse of coordsToLatLngs closed determines whether the first point should be
    * appended to the end of the array to close the feature, only used when levelsDeep is 0.
    * False by default.
    */
  inline def latLngsToCoords(latlngs: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Double, closed: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def latLngsToCoords(latlngs: js.Array[Any], levelsDeep: Unit, closed: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngsToCoords")(latlngs.asInstanceOf[js.Any], levelsDeep.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
