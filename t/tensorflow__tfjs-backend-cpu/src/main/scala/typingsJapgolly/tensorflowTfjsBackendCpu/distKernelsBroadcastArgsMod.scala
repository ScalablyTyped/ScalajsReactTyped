package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.BackendMathBackendCPU
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBroadcastArgsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BroadcastArgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastArgs(args: BackendMathBackendCPU): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BroadcastArgs", "broadcastArgsConfig")
  @js.native
  val broadcastArgsConfig: KernelConfig = js.native
}
