package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonClampToGround
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeoJsonDataSource")
@js.native
class GeoJsonDataSource () extends DataSource {
  def this(name: String) = this()
  def load(data: String): js.Promise[GeoJsonDataSource] = js.native
  def load(data: String, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
}

/* static members */
@JSImport("cesium", "GeoJsonDataSource")
@js.native
object GeoJsonDataSource extends js.Object {
  var clampToGround: Boolean = js.native
  var crsLinkHrefs: js.Any = js.native
  var crsLinkTypes: js.Any = js.native
  var crsNames: js.Any = js.native
  var fill: Color = js.native
  var markerColor: Color = js.native
  var markerSize: Double = js.native
  var markerSymbol: String = js.native
  var stroke: Color = js.native
  var strokeWidth: Double = js.native
  def load(data: String): js.Promise[GeoJsonDataSource] = js.native
  def load(data: String, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object): js.Promise[GeoJsonDataSource] = js.native
  def load(data: js.Object, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource, options: AnonClampToGround): js.Promise[GeoJsonDataSource] = js.native
}

