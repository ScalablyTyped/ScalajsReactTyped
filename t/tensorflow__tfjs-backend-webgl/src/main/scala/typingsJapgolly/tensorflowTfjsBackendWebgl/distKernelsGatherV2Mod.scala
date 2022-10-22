package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsGatherV2Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsGatherV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/GatherV2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gatherV2(args: AttrsGatherV2Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("gatherV2")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/GatherV2", "gatherV2Config")
  @js.native
  val gatherV2Config: KernelConfig = js.native
}
