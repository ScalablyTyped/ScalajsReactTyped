package typingsJapgolly.mapboxTileCover.mod

import typingsJapgolly.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/tile-cover", "tiles")
@js.native
object tiles extends js.Object {
  def apply(geom: Geometry, limits: Limits): js.Array[js.Array[Double]] = js.native
}

