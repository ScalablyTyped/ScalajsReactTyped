package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsEluGradInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsEluGradMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/EluGrad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eluGrad(args: InputsEluGradInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("eluGrad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/EluGrad", "eluGradConfig")
  @js.native
  val eluGradConfig: KernelConfig = js.native
}
