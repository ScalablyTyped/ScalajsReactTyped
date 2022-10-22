package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.InputsUnaryInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsNegMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Neg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def neg(args: InputsUnaryInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Neg", "negConfig")
  @js.native
  val negConfig: KernelConfig = js.native
  
  inline def negImpl(xVals: TypedArray, xShape: js.Array[Double], xDtype: DataType): js.Tuple2[TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("negImpl")(xVals.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, js.Array[Double]]]
}
