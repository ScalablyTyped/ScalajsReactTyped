package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.constant
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsImageTransformMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/transform", "transform")
  @js.native
  val transform: js.Function6[
    /* image */ Tensor4D | TensorLike, 
    /* transforms */ Tensor2D | TensorLike, 
    /* interpolation */ js.UndefOr[nearest | bilinear], 
    /* fillMode */ js.UndefOr[constant | reflect | wrap | nearest], 
    /* fillValue */ js.UndefOr[Double], 
    /* outputShape */ js.UndefOr[js.Tuple2[Double, Double]], 
    Tensor4D
  ] = js.native
}
