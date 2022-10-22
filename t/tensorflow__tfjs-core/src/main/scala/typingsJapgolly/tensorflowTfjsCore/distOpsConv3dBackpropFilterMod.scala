package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R5
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsConv3dBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  inline def conv3DBackpropFilter(
    x: Tensor[R4 | R5],
    dy: Tensor[R4 | R5],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropFilter")(x.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filterShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
}
