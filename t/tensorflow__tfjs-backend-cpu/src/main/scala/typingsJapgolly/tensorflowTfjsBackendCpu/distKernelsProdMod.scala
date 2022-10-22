package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsProdAttrs
import typingsJapgolly.tensorflowTfjsBackendCpu.anon.OutDtype
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsProdMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prod(args: AttrsProdAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Prod", "prodConfig")
  @js.native
  val prodConfig: KernelConfig = js.native
  
  inline def prodImpl(xShape: js.Array[Double], xDtype: DataType, xVals: TypedArray, reductionAxes: js.Array[Double]): OutDtype = (^.asInstanceOf[js.Dynamic].applyDynamic("prodImpl")(xShape.asInstanceOf[js.Any], xDtype.asInstanceOf[js.Any], xVals.asInstanceOf[js.Any], reductionAxes.asInstanceOf[js.Any])).asInstanceOf[OutDtype]
}
