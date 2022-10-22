package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.AttrsTransposeAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTransposeMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Transpose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transpose(args: AttrsTransposeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Transpose", "transposeConfig")
  @js.native
  val transposeConfig: KernelConfig = js.native
}
