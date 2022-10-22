package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsAvgPoolGradMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/avg_pool_grad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](dy: T | TensorLike, input: T | TensorLike, filterSize: Double, strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPoolGrad[T /* <: Tensor3D | Tensor4D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPoolGrad")(dy.asInstanceOf[js.Any], input.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
}
