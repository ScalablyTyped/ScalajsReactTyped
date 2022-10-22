package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.Inputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAddNMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AddN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addN(args: Inputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("addN")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AddN", "addNConfig")
  @js.native
  val addNConfig: KernelConfig = js.native
}
