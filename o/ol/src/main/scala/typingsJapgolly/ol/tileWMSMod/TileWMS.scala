package typingsJapgolly.ol.tileWMSMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileWMS
  extends typingsJapgolly.ol.tileImageMod.default {
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): String = js.native
  def getLegendUrl(): String = js.native
  def getLegendUrl(resolution: Double): String = js.native
  def getLegendUrl(resolution: Double, params: js.Any): String = js.native
  def getParams(): js.Any = js.native
  def updateParams(params: js.Any): Unit = js.native
}

