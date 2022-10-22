package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBatchnormUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xAs4D[R /* <: Rank */](x: Tensor[R]): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("xAs4D")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
}
