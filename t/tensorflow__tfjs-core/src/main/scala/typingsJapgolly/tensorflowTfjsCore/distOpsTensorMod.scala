package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.WebGLData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTensorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: TensorLike, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGLData): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGLData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGLData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGLData, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
