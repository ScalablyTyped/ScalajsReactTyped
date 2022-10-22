package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsBatchMatMulAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBatchMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchMatMul(args: AttrsBatchMatMulAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchMatMul")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", "batchMatMulConfig")
  @js.native
  val batchMatMulConfig: KernelConfig = js.native
}
