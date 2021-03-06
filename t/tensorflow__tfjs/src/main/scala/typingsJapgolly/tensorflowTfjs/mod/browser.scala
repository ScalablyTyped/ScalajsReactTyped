package typingsJapgolly.tensorflowTfjs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.PixelData
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "browser")
@js.native
object browser extends js.Object {
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[scala.scalajs.js.typedarray.Uint8ClampedArray] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[scala.scalajs.js.typedarray.Uint8ClampedArray] = js.native
}

