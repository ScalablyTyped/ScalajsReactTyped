package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsArgMinMaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/arg_min_max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMinMaxReduce(backend: MathBackendWebGL, x: TensorInfo, axis: Double, reduceType: min | max): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("argMinMaxReduce")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], reduceType.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
