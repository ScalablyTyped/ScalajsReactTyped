package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsMirrorPadAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mirrorPad(args: AttrsMirrorPadAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MirrorPad", "mirrorPadConfig")
  @js.native
  val mirrorPadConfig: KernelConfig = js.native
}
