package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsEinsumAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsEinsumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Einsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def einsum(args: AttrsEinsumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("einsum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Einsum", "einsumConfig")
  @js.native
  val einsumConfig: KernelConfig = js.native
}
