package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbroadcastArgs extends StObject {
  
  def apply[R /* <: Rank */](
    s0: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    s1: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank], s1: TensorLike): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: TensorLike, s1: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def apply[R /* <: Rank */](s0: TensorLike, s1: TensorLike): typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
}
