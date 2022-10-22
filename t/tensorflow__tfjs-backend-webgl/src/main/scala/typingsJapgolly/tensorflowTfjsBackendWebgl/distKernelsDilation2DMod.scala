package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsDilation2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDilation2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Dilation2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dilation2D(args: AttrsDilation2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("dilation2D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Dilation2D", "dilation2DConfig")
  @js.native
  val dilation2DConfig: KernelConfig = js.native
}
