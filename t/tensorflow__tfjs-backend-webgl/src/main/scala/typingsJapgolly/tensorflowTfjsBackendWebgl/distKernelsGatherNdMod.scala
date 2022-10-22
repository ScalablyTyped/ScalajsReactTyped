package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.InputsGatherNdInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsGatherNdMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/GatherNd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gatherNd(args: InputsGatherNdInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("gatherNd")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/GatherNd", "gatherNdConfig")
  @js.native
  val gatherNdConfig: KernelConfig = js.native
}
