package typingsJapgolly.tensorflowTfjs.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.PixelData
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browser {
  
  @JSImport("@tensorflow/tfjs", "browser")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs", "browser.fromPixels")
  @js.native
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  inline def fromPixelsAsync(pixels: HTMLCanvasElement): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: HTMLCanvasElement, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: HTMLImageElement): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: HTMLImageElement, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: HTMLVideoElement): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: HTMLVideoElement, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: ImageData): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: ImageData, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: ImageBitmap): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: ImageBitmap, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: PixelData): js.Promise[Tensor3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor3D]]
  inline def fromPixelsAsync(pixels: PixelData, numChannels: Double): js.Promise[Tensor3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor3D]]
  
  inline def toPixels(img: Tensor2D | Tensor3D): js.Promise[js.typedarray.Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: Tensor2D | Tensor3D, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: TensorLike): js.Promise[js.typedarray.Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: TensorLike, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
}
