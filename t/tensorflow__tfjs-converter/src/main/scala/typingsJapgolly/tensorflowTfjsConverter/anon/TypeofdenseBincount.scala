package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdenseBincount extends StObject {
  
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double,
    binaryOutput: Boolean
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: TensorLike,
    size: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    weights: TensorLike,
    size: Double,
    binaryOutput: Boolean
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: TensorLike,
    weights: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply(
    x: TensorLike,
    weights: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1 | R2],
    size: Double,
    binaryOutput: Boolean
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  def apply[T /* <: Tensor1D | Tensor2D */](x: TensorLike, weights: TensorLike, size: Double): T = js.native
  def apply[T /* <: Tensor1D | Tensor2D */](x: TensorLike, weights: TensorLike, size: Double, binaryOutput: Boolean): T = js.native
}
