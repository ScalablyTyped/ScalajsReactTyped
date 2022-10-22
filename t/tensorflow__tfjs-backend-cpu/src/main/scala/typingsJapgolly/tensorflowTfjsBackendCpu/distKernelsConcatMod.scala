package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsConcatAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConcatMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(args: AttrsConcatAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Concat", "concatConfig")
  @js.native
  val concatConfig: KernelConfig = js.native
}
