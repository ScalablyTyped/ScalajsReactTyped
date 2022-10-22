package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsLeakyReluAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLeakyReluMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LeakyRelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LeakyRelu", "LEAKYRELU")
  @js.native
  val LEAKYRELU_ : /* "return (a < 0.) ? b * a : a;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LeakyRelu", "LEAKYRELU_PACKED")
  @js.native
  val LEAKYRELU_PACKED: /* "\n  vec4 aLessThanZero = vec4(lessThan(a, vec4(0.)));\n  return (aLessThanZero * (b * a)) + ((vec4(1.0) - aLessThanZero) * a);\n" */ String = js.native
  
  inline def leakyRelu(args: AttrsLeakyReluAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LeakyRelu", "leakyReluConfig")
  @js.native
  val leakyReluConfig: KernelConfig = js.native
}
