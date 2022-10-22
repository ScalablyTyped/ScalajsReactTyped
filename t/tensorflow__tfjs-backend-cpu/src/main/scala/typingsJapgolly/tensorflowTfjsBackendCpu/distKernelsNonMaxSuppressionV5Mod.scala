package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsNonMaxSuppressionV5Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsNonMaxSuppressionV5Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV5(args: AttrsNonMaxSuppressionV5Attrs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV5")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NonMaxSuppressionV5", "nonMaxSuppressionV5Config")
  @js.native
  val nonMaxSuppressionV5Config: KernelConfig = js.native
}
