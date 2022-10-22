package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsMaxPoolWithArgmaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_with_argmax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
}
