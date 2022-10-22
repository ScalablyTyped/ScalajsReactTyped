package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsZerosLikeInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsZerosLikeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ZerosLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zerosLike(args: InputsZerosLikeInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/ZerosLike", "zerosLikeConfig")
  @js.native
  val zerosLikeConfig: KernelConfig = js.native
}
