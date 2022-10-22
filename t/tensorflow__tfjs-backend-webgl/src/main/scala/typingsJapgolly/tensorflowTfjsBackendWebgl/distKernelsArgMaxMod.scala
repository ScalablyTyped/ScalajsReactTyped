package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.BackendInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsArgMaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMax(args: BackendInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ArgMax", "argMaxConfig")
  @js.native
  val argMaxConfig: KernelConfig = js.native
}
