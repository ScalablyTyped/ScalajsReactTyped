package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.InputsSelectInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSelectMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def select(args: InputsSelectInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Select", "selectConfig")
  @js.native
  val selectConfig: KernelConfig = js.native
}
