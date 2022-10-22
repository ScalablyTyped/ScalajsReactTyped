package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsRaggedTensorToTensorAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedTensorToTensorMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/RaggedTensorToTensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedTensorToTensor(args: AttrsRaggedTensorToTensorAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("raggedTensorToTensor")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/RaggedTensorToTensor", "raggedTensorToTensorConfig")
  @js.native
  val raggedTensorToTensorConfig: KernelConfig = js.native
}
