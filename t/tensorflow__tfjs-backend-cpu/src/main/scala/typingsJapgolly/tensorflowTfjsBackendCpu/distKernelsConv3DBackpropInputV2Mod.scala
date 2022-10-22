package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsConv3DBackpropInputV2Attrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv3DBackpropInputV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3DBackpropInputV2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3DBackpropInputV2(args: AttrsConv3DBackpropInputV2Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInputV2")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3DBackpropInputV2", "conv3DBackpropInputV2Config")
  @js.native
  val conv3DBackpropInputV2Config: KernelConfig = js.native
}
