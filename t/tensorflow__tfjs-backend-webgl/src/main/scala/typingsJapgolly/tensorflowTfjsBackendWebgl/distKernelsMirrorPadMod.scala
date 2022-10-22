package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsMirrorPadAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MirrorPad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MirrorPad", "mirrorPadConfig")
  @js.native
  val mirrorPadConfig: KernelConfig = js.native
  
  inline def mirrorPadKernelFunc(params: AttrsMirrorPadAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPadKernelFunc")(params.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
