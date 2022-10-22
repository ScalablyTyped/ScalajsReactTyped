package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsUnsortedSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: Tensor1D, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: TensorLike, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
}
