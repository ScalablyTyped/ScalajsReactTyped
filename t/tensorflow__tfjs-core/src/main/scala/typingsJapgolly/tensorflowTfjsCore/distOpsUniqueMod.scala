package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.anon.Values
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsUniqueMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unique[T /* <: Tensor[Rank] */](x: T | TensorLike): Values[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any]).asInstanceOf[Values[T]]
  inline def unique[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): Values[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Values[T]]
}
