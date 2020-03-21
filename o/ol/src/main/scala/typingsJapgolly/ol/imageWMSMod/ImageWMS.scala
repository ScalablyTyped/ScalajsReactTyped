package typingsJapgolly.ol.imageWMSMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.olImageMod.LoadFunction
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageWMS
  extends typingsJapgolly.ol.sourceImageMod.default {
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): String = js.native
  def getImageLoadFunction(): LoadFunction = js.native
  def getLegendUrl(): String = js.native
  def getLegendUrl(resolution: Double): String = js.native
  def getLegendUrl(resolution: Double, params: js.Any): String = js.native
  def getParams(): js.Any = js.native
  def getUrl(): String = js.native
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

