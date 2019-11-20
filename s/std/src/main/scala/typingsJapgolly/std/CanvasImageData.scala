package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageData extends js.Object {
  def createImageData(imagedata: ImageData): org.scalajs.dom.raw.ImageData = js.native
  def createImageData(sw: Double, sh: Double): org.scalajs.dom.raw.ImageData = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): org.scalajs.dom.raw.ImageData = js.native
  def putImageData(imagedata: org.scalajs.dom.raw.ImageData, dx: Double, dy: Double): Unit = js.native
  def putImageData(
    imagedata: org.scalajs.dom.raw.ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
}

