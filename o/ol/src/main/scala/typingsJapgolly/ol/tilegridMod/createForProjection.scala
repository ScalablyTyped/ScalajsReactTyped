package typingsJapgolly.ol.tilegridMod

import typingsJapgolly.ol.cornerMod.Corner
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tilegrid", "createForProjection")
@js.native
object createForProjection extends js.Object {
  def apply(projection: ProjectionLike): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def apply(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
}

