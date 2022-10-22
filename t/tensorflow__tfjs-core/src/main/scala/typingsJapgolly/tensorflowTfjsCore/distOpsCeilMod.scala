package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsCeilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ceil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ceil[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}
