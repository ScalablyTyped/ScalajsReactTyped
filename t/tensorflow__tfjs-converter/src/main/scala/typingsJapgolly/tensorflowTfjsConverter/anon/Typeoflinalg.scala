package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflinalg extends StObject {
  
  def bandPart[T /* <: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = js.native
  
  def gramSchmidt(xs: js.Array[Tensor1D]): Tensor2D | js.Array[Tensor1D] = js.native
  def gramSchmidt(xs: Tensor2D): Tensor2D | js.Array[Tensor1D] = js.native
  
  def qr(x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Tuple2[
    typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
  def qr(x: typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank], fullMatrices: Boolean): js.Tuple2[
    typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
    typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ] = js.native
}
