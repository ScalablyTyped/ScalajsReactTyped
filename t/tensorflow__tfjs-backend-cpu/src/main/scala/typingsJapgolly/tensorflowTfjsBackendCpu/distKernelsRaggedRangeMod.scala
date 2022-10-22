package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsRaggedRangeInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedRangeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedRange(args: InputsRaggedRangeInputs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("raggedRange")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedRange", "raggedRangeConfig")
  @js.native
  val raggedRangeConfig: KernelConfig = js.native
}
