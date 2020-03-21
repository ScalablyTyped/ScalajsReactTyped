package typingsJapgolly.cropperjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.cropperjs.Cropper.CanvasData
import typingsJapgolly.cropperjs.Cropper.ContainerData
import typingsJapgolly.cropperjs.Cropper.CropBoxData
import typingsJapgolly.cropperjs.Cropper.Data
import typingsJapgolly.cropperjs.Cropper.DragMode
import typingsJapgolly.cropperjs.Cropper.GetCroppedCanvasOptions
import typingsJapgolly.cropperjs.Cropper.ImageData
import typingsJapgolly.cropperjs.Cropper.Options
import typingsJapgolly.cropperjs.Cropper.SetCanvasDataOptions
import typingsJapgolly.cropperjs.Cropper.SetCropBoxDataOptions
import typingsJapgolly.cropperjs.Cropper.SetDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Cropper")
@js.native
class Cropper_ protected () extends js.Object {
  def this(element: HTMLCanvasElement) = this()
  def this(element: HTMLImageElement) = this()
  def this(element: HTMLCanvasElement, options: Options) = this()
  def this(element: HTMLImageElement, options: Options) = this()
  def clear(): Cropper = js.native
  def crop(): Cropper = js.native
  def destroy(): Cropper = js.native
  def disable(): Cropper = js.native
  def enable(): Cropper = js.native
  def getCanvasData(): CanvasData = js.native
  def getContainerData(): ContainerData = js.native
  def getCropBoxData(): CropBoxData = js.native
  def getCroppedCanvas(): HTMLCanvasElement = js.native
  def getCroppedCanvas(options: GetCroppedCanvasOptions): HTMLCanvasElement = js.native
  def getData(): Data = js.native
  def getData(rounded: Boolean): Data = js.native
  def getImageData(): ImageData = js.native
  def move(offsetX: Double): Cropper = js.native
  def move(offsetX: Double, offsetY: Double): Cropper = js.native
  def moveTo(x: Double): Cropper = js.native
  def moveTo(x: Double, y: Double): Cropper = js.native
  def replace(url: String): Cropper = js.native
  def replace(url: String, onlyColorChanged: Boolean): Cropper = js.native
  def reset(): Cropper = js.native
  def rotate(degree: Double): Cropper = js.native
  def rotateTo(degree: Double): Cropper = js.native
  def scale(scaleX: Double): Cropper = js.native
  def scale(scaleX: Double, scaleY: Double): Cropper = js.native
  def scaleX(scaleX: Double): Cropper = js.native
  def scaleY(scaleY: Double): Cropper = js.native
  def setAspectRatio(aspectRatio: Double): Cropper = js.native
  def setCanvasData(data: SetCanvasDataOptions): Cropper = js.native
  def setCropBoxData(data: SetCropBoxDataOptions): Cropper = js.native
  def setData(data: SetDataOptions): Cropper = js.native
  def setDragMode(dragMode: DragMode): Cropper = js.native
  def zoom(ratio: Double): Cropper = js.native
  def zoomTo(ratio: Double): Cropper = js.native
  def zoomTo(ratio: Double, pivot: AnonX): Cropper = js.native
}

