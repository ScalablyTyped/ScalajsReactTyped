package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor6D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImageGrayscaleToRgbMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/grayscale_to_rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grayscaleToRGB[T /* <: Tensor2D | Tensor3D | Tensor4D | Tensor5D | Tensor6D */](image: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscaleToRGB")(image.asInstanceOf[js.Any]).asInstanceOf[T]
}
