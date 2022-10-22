package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsZerosImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/zeros_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zeros(backend: MathBackendCPU, shape: js.Array[Double]): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(backend.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def zeros(backend: MathBackendCPU, shape: js.Array[Double], dtype: DataType): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(backend.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
