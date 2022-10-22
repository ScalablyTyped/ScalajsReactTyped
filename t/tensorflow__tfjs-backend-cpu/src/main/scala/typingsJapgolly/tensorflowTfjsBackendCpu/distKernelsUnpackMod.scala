package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsUnpackAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsUnpackMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unpack(args: AttrsUnpackAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unpack", "unpackConfig")
  @js.native
  val unpackConfig: KernelConfig = js.native
}
