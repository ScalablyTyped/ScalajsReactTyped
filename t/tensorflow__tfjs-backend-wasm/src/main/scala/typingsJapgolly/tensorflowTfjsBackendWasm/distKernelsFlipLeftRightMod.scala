package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.BackendBackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFlipLeftRightMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipLeftRight(args: BackendBackendWasm): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/FlipLeftRight", "flipLeftRightConfig")
  @js.native
  val flipLeftRightConfig: KernelConfig = js.native
}
