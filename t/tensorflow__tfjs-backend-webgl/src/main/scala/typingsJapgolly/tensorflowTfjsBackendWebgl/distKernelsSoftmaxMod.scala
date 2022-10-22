package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsSoftmaxAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSoftmaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Softmax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def softmax(args: AttrsSoftmaxAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Softmax", "softmaxConfig")
  @js.native
  val softmaxConfig: KernelConfig = js.native
}
