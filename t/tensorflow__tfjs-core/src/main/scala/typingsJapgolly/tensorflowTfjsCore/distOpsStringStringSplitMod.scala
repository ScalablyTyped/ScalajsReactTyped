package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Scalar
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsStringStringSplitMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/string/string_split", "stringSplit")
  @js.native
  val stringSplit: js.Function3[
    /* input */ Tensor1D | TensorLike, 
    /* delimiter */ Scalar | ScalarLike, 
    /* skipEmpty */ js.UndefOr[Boolean], 
    NamedTensorMap
  ] = js.native
}
