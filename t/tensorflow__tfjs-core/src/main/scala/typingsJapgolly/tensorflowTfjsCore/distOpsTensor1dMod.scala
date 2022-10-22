package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensor1dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor1d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor1d(values: TensorLike1D): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
  inline def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
}
