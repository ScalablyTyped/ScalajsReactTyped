package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike5D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensor5dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor5d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor5d(values: TensorLike5D): Tensor5D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: Unit, dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
}
