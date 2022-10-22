package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.Axes
import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsKernelUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/kernel_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def permuteAxesAndTranspose(x: TensorInfo, axis: js.Array[Double], backend: BackendWasm): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("permuteAxesAndTranspose")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Axes]
  inline def permuteAxesAndTranspose(x: TensorInfo, axis: Double, backend: BackendWasm): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("permuteAxesAndTranspose")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Axes]
}
