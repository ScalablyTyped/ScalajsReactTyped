package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsReverseAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsReverseMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverse(args: AttrsReverseAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reverse", "reverseConfig")
  @js.native
  val reverseConfig: KernelConfig = js.native
}
