package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.InputsDiagInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDiagMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Diag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diag(args: InputsDiagInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Diag", "diagConfig")
  @js.native
  val diagConfig: KernelConfig = js.native
}
