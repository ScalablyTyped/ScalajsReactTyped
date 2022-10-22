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

object distOpsConv3dBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
  inline def conv3DBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
  inline def conv3DBackpropInput(
    xShape: js.Tuple5[Double, Double, Double, Double, Double],
    dy: Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
  inline def conv3DBackpropInput(
    xShape: js.Tuple5[Double, Double, Double, Double, Double],
    dy: Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_
  ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInput")(xShape.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
}
