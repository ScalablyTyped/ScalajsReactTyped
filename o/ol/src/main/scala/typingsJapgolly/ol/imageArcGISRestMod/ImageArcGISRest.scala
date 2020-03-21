package typingsJapgolly.ol.imageArcGISRestMod

import typingsJapgolly.ol.olImageMod.LoadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageArcGISRest
  extends typingsJapgolly.ol.sourceImageMod.default {
  def getImageLoadFunction(): LoadFunction = js.native
  def getParams(): js.Any = js.native
  def getUrl(): String = js.native
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

