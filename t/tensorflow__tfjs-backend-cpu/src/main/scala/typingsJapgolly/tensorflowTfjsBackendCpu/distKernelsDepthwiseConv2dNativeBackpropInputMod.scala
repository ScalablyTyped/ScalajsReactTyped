package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsDepthwiseConv2dNativeBackpropInputAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDepthwiseConv2dNativeBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNativeBackpropInput(args: AttrsDepthwiseConv2dNativeBackpropInputAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropInput")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropInput", "depthwiseConv2dNativeBackpropInputConfig")
  @js.native
  val depthwiseConv2dNativeBackpropInputConfig: KernelConfig = js.native
}
