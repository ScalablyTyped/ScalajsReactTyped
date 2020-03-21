package typingsJapgolly.ol.imageMapGuideMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olImageMod.LoadFunction
import typingsJapgolly.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapGuide
  extends typingsJapgolly.ol.sourceImageMod.default {
  def getImageLoadFunction(): LoadFunction = js.native
  def getParams(): js.Any = js.native
  def getUrl(
    baseUrl: String,
    params: StringDictionary[String | Double],
    extent: Extent,
    size: Size,
    projection: typingsJapgolly.ol.projectionMod.default
  ): String = js.native
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  def updateParams(params: js.Any): Unit = js.native
}

