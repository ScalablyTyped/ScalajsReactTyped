package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NCDHW
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NDHWC
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.same
import typingsJapgolly.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.valid
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R5
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconv3d extends StObject {
  
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same | valid,
    dataFormat: Unit,
    dilations: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R4] = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid | same, dataFormat: NDHWC | NCDHW): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid | same, dataFormat: NDHWC | NCDHW): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: valid | same,
    dataFormat: Unit,
    dilations: Double
  ): T = js.native
}
