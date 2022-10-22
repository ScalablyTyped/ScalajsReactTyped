package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbatchNorm extends StObject {
  
  def apply[R /* <: Rank */](
    x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] | TensorLike,
    mean: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    variance: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[
      typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
    ],
    scale: js.UndefOr[
      typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] | Tensor1D | TensorLike
    ],
    varianceEpsilon: js.UndefOr[Double]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
