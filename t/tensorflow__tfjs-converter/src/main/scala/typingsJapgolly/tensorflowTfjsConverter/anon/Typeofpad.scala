package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpad extends StObject {
  
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
}
