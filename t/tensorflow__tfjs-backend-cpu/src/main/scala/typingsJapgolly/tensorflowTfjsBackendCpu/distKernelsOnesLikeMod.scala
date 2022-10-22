package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsOnesLikeInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsOnesLikeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/OnesLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onesLike(args: InputsOnesLikeInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/OnesLike", "onesLikeConfig")
  @js.native
  val onesLikeConfig: KernelConfig = js.native
}
