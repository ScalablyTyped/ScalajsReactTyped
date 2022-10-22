package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsTransformAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTransformMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(args: AttrsTransformAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Transform", "transformConfig")
  @js.native
  val transformConfig: KernelConfig = js.native
}
