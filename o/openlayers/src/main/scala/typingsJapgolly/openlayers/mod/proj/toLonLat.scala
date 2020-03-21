package typingsJapgolly.openlayers.mod.proj

import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.toLonLat")
@js.native
object toLonLat extends js.Object {
  /**
    * Transforms a coordinate to longitude/latitude.
    * @param coordinate Projected coordinate.
    * @param opt_projection Projection of the coordinate.
    *     The default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate as longitude and latitude, i.e. an array
    *     with longitude as 1st and latitude as 2nd element.
    * @api stable
    */
  def apply(coordinate: Coordinate_): Coordinate_ = js.native
  def apply(coordinate: Coordinate_, opt_projection: ProjectionLike): Coordinate_ = js.native
}

