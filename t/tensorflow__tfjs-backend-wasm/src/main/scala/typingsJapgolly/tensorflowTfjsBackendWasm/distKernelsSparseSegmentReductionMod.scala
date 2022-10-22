package typingsJapgolly.tensorflowTfjsBackendWasm

import typingsJapgolly.tensorflowTfjsBackendWasm.anon.BackendBackendWasmInputs
import typingsJapgolly.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseSegmentReductionMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/SparseSegmentReduction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(backend: BackendWasm): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(backend.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sparseSegmentReduction(args: BackendBackendWasmInputs, isMean: Boolean): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentReduction")(args.asInstanceOf[js.Any], isMean.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
