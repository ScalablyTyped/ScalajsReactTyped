package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.AttrsLeakyReluAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLeakyReluMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LeakyRelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def leakyRelu(args: AttrsLeakyReluAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/LeakyRelu", "leakyReluConfig")
  @js.native
  val leakyReluConfig: KernelConfig = js.native
}
