package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.AttrsReshapeAttrs
import typingsJapgolly.tensorflowTfjsBackendWasm.anon.DataId
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsReshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reshape(args: AttrsReshapeAttrs): DataId = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[DataId]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Reshape", "reshapeConfig")
  @js.native
  val reshapeConfig: KernelConfig = js.native
}
