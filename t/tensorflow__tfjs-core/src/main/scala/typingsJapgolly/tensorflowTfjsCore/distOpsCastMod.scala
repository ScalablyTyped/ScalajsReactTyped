package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsCastMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/cast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast[T /* <: Tensor[Rank] */](x: T | TensorLike, dtype: DataType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[T]
}
