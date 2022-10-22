package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsConv2DBackpropInputAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv2DBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2DBackpropInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2DBackpropInput(args: AttrsConv2DBackpropInputAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropInput")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2DBackpropInput", "conv2DBackpropInputConfig")
  @js.native
  val conv2DBackpropInputConfig: KernelConfig = js.native
}
