package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsFusedMatMulAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFusedMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/_FusedMatMul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fusedMatMul(args: AttrsFusedMatMulAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("_fusedMatMul")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/_FusedMatMul", "_fusedMatMulConfig")
  @js.native
  val fusedMatMulConfig: KernelConfig = js.native
}
