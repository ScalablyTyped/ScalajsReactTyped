package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsConv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2D", "conv2DConfig")
  @js.native
  val conv2DConfig: KernelConfig = js.native
  
  inline def conv2d(args: AttrsConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
