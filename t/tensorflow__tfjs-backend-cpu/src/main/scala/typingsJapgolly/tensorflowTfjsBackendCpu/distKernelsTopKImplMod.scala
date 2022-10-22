package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.NumericDataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsJapgolly.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTopKImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/TopK_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topKImpl[T /* <: Tensor[Rank] */, R /* <: Rank */](x: TypedArray, xShape: js.Array[Double], xDtype: NumericDataType, k: Double, sorted: Boolean): js.Tuple2[TensorBuffer[R, NumericDataType], TensorBuffer[R, int32]] = (^.asInstanceOf[js.Dynamic].applyDynamic("topKImpl")(x.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TensorBuffer[R, NumericDataType], TensorBuffer[R, int32]]]
}
