package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsGatherV2ImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/GatherV2_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gatherV2Impl[R /* <: Rank */, D /* <: DataType */](xBuf: TensorBuffer[R, D], indicesBuf: TensorBuffer[R, D], flattenOutputShape: js.Array[Double]): TensorBuffer[R, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatherV2Impl")(xBuf.asInstanceOf[js.Any], indicesBuf.asInstanceOf[js.Any], flattenOutputShape.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, D]]
}
