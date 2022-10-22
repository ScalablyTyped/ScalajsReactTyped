package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.InputsNegInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsNegMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Neg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def neg(args: InputsNegInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Neg", "negConfig")
  @js.native
  val negConfig: KernelConfig = js.native
}
