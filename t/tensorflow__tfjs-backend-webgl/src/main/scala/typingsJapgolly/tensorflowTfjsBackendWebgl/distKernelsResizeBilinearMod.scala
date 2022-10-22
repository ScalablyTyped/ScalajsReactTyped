package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsResizeBilinearAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsResizeBilinearMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeBilinear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeBilinear(args: AttrsResizeBilinearAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ResizeBilinear", "resizeBilinearConfig")
  @js.native
  val resizeBilinearConfig: KernelConfig = js.native
}
