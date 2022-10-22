package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.ceil
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.floor
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.round
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofavgPool extends StObject {
  
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: same | valid,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3 | R4],
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R3] = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: valid | same,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: ExplicitPadding): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: floor | round | ceil
  ): T = js.native
}
