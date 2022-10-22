package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsMeanAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMeanMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mean(args: AttrsMeanAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Mean", "meanConfig")
  @js.native
  val meanConfig: KernelConfig = js.native
}
