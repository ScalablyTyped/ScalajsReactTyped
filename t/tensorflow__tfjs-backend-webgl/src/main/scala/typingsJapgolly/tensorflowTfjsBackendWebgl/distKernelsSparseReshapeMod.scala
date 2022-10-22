package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.InputsSparseReshapeInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseReshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseReshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseReshape(args: InputsSparseReshapeInputs): js.Tuple2[TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseReshape", "sparseReshapeConfig")
  @js.native
  val sparseReshapeConfig: KernelConfig = js.native
}
