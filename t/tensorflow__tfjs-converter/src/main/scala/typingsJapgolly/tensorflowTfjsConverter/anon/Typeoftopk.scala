package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.anon.Indices
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftopk extends StObject {
  
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike): Indices[T] = js.native
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Double): Indices[T] = js.native
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, k: Unit, sorted: Boolean): Indices[T] = js.native
}
