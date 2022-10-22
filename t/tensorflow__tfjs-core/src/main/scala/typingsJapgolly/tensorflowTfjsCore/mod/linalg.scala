package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linalg {
  
  @JSImport("@tensorflow/tfjs-core", "linalg")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bandPart[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def gramSchmidt(xs: js.Array[Tensor1D]): Tensor2D | js.Array[Tensor1D] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor2D | js.Array[Tensor1D]]
  inline def gramSchmidt(xs: Tensor2D): Tensor2D | js.Array[Tensor1D] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor2D | js.Array[Tensor1D]]
  
  inline def qr(x: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]): js.Tuple2[
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
  inline def qr(x: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], fullMatrices: Boolean): js.Tuple2[
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any], fullMatrices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ]]
}
