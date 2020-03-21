package typingsJapgolly.reactMapGl.mod

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.mapboxGl.mod.Map
import typingsJapgolly.mapboxGl.mod.PointLike
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "InteractiveMap")
@js.native
class InteractiveMap ()
  extends Component[InteractiveMapProps, js.Object, js.Any] {
  def getMap(): Map = js.native
  def queryRenderedFeatures(): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike]): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
}

