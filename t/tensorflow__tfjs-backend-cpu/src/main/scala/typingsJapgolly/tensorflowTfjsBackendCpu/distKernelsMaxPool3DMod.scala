package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsMaxPool3DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPool3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPool3D(args: AttrsMaxPool3DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool3D", "maxPool3DConfig")
  @js.native
  val maxPool3DConfig: KernelConfig = js.native
}
