package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsStridedSliceAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStridedSliceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StridedSlice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stridedSlice(args: AttrsStridedSliceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("stridedSlice")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/StridedSlice", "stridedSliceConfig")
  @js.native
  val stridedSliceConfig: KernelConfig = js.native
}
