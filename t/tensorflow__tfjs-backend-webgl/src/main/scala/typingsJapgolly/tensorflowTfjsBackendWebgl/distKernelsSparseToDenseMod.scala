package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsSparseToDenseAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseToDenseMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseToDense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseToDense(args: AttrsSparseToDenseAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseToDense", "sparseToDenseConfig")
  @js.native
  val sparseToDenseConfig: KernelConfig = js.native
}
