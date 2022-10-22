package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsSumAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sum(args: AttrsSumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sum", "sumConfig")
  @js.native
  val sumConfig: KernelConfig = js.native
}
