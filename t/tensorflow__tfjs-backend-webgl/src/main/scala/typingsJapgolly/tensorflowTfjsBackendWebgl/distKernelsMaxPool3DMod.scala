package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsMaxPool3DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPool3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool3D", "maxPool3DConfig")
  @js.native
  val maxPool3DConfig: KernelConfig = js.native
  
  inline def maxPool3d(args: AttrsMaxPool3DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3d")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
