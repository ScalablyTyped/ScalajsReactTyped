package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.AttrsCastAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCastMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast(args: AttrsCastAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cast", "castConfig")
  @js.native
  val castConfig: KernelConfig = js.native
  
  inline def castImpl(values: TypedArray, shape: js.Array[Double], inputType: DataType, dtype: DataType): js.Tuple3[js.Array[Double], DataType, TypedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("castImpl")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[Double], DataType, TypedArray]]
}
