package typingsJapgolly.ol.wmtsMod

import typingsJapgolly.ol.wmtsrequestencodingMod.WMTSRequestEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTS
  extends typingsJapgolly.ol.tileImageMod.default {
  def getDimensions(): js.Any = js.native
  def getFormat(): String = js.native
  def getLayer(): String = js.native
  def getMatrixSet(): String = js.native
  def getRequestEncoding(): WMTSRequestEncoding = js.native
  def getStyle(): String = js.native
  def getVersion(): String = js.native
  def updateDimensions(dimensions: js.Any): Unit = js.native
}

