package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsScatterNdMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
