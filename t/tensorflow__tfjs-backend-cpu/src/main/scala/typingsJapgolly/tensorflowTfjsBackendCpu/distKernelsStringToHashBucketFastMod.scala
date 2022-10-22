package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsStringToHashBucketFastAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStringToHashBucketFastMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringToHashBucketFast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringToHashBucketFast(args: AttrsStringToHashBucketFastAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringToHashBucketFast", "stringToHashBucketFastConfig")
  @js.native
  val stringToHashBucketFastConfig: KernelConfig = js.native
}
