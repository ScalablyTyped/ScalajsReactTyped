package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsMaxPoolGradMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_grad", "maxPoolGrad")
  @js.native
  val maxPoolGrad: js.Function7[
    /* dy */ Tensor4D | TensorLike, 
    /* input */ Tensor4D | TensorLike, 
    /* output */ Tensor4D | TensorLike, 
    /* filterSize */ (js.Tuple2[Double, Double]) | Double, 
    /* strides */ (js.Tuple2[Double, Double]) | Double, 
    /* pad */ valid_ | same_ | Double | ExplicitPadding, 
    /* dimRoundingMode */ js.UndefOr[floor | round | ceil], 
    Tensor4D
  ] = js.native
}
