package typingsJapgolly.tensorflowTfjsBackendCpu

import typingsJapgolly.tensorflowTfjsBackendCpu.anon.Indices
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsUniqueImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unique_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueImpl")(values.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Indices]
}
