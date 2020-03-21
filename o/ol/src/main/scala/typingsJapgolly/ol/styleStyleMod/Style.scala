package typingsJapgolly.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  def getFill(): typingsJapgolly.ol.fillMod.default = js.native
  def getGeometry(): String | typingsJapgolly.ol.geometryMod.default | GeometryFunction = js.native
  def getGeometryFunction(): GeometryFunction = js.native
  def getImage(): typingsJapgolly.ol.styleImageMod.default = js.native
  def getRenderer(): RenderFunction = js.native
  def getStroke(): typingsJapgolly.ol.strokeMod.default = js.native
  def getText(): typingsJapgolly.ol.textMod.default = js.native
  def getZIndex(): Double = js.native
  def setFill(fill: typingsJapgolly.ol.fillMod.default): Unit = js.native
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typingsJapgolly.ol.geometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  def setImage(image: typingsJapgolly.ol.styleImageMod.default): Unit = js.native
  def setRenderer(): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  def setStroke(stroke: typingsJapgolly.ol.strokeMod.default): Unit = js.native
  def setText(text: typingsJapgolly.ol.textMod.default): Unit = js.native
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

