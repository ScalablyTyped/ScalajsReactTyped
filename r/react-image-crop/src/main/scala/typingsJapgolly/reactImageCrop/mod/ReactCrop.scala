package typingsJapgolly.reactImageCrop.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactImageCrop.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCrop
  extends Component[ReactCropProps, js.Object, js.Any] {
  def createCropSelection(): Node = js.native
  def crossOverCheck(): Unit = js.native
  def dragCrop(): Crop = js.native
  def getCropStyle(): CSSProperties = js.native
  def getNewSize(): AnonHeight = js.native
  def makeNewCrop(): Crop = js.native
  def onComponentKeyDown(e: MouseEvent): Unit = js.native
  def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
  def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
  def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
  def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
  def onImageLoad(image: HTMLImageElement): Unit = js.native
  def resizeCrop(): Crop = js.native
  def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  def straightenYPath(clientX: Double): Double = js.native
}

