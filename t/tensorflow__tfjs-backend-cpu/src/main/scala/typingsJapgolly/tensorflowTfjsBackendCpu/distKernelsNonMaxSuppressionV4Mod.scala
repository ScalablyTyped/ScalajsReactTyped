package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsNonMaxSuppressionV4Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsNonMaxSuppressionV4Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV4(args: AttrsNonMaxSuppressionV4Attrs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV4")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV4", "nonMaxSuppressionV4Config")
  @js.native
  val nonMaxSuppressionV4Config: KernelConfig = js.native
}
