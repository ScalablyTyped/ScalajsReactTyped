package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsSparseSegmentMeanInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseSegmentMeanMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseSegmentMean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseSegmentMean(args: InputsSparseSegmentMeanInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseSegmentMean", "sparseSegmentMeanConfig")
  @js.native
  val sparseSegmentMeanConfig: KernelConfig = js.native
}
