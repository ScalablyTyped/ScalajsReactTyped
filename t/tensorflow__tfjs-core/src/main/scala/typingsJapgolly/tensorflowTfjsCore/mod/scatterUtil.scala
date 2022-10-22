package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distOpsScatterNdUtilMod.ScatterShapeInfo
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterUtil {
  
  @JSImport("@tensorflow/tfjs-core", "scatter_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateShapes")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[ScatterShapeInfo]
  
  inline def validateInput(
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUpdateShape")(shape.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
