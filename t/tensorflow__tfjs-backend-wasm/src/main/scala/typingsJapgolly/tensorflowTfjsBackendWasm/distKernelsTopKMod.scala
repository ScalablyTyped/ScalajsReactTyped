package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.AttrsTopKAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTopKMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/TopK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/TopK", "topKConfig")
  @js.native
  val topKConfig: KernelConfig = js.native
  
  inline def topk(args: AttrsTopKAttrs): js.Array[TensorInfo] | TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("topk")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo] | TensorInfo]
}
