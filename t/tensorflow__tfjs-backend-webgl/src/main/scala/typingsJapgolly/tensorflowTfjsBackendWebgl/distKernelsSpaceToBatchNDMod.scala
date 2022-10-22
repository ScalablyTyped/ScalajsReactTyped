package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsSpaceToBatchNDAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSpaceToBatchNDMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SpaceToBatchND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spaceToBatchND(args: AttrsSpaceToBatchNDAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("spaceToBatchND")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SpaceToBatchND", "spaceToBatchNDConfig")
  @js.native
  val spaceToBatchNDConfig: KernelConfig = js.native
}
