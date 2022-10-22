package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsMinAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMinMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min(args: AttrsMinAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Min", "minConfig")
  @js.native
  val minConfig: KernelConfig = js.native
}
