package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsStringSplitAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStringSplitMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringSplit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringSplit(args: AttrsStringSplitAttrs): js.Tuple3[TensorInfo, TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TensorInfo, TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StringSplit", "stringSplitConfig")
  @js.native
  val stringSplitConfig: KernelConfig = js.native
}
