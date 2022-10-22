package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.left
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSearchSortedMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/search_sorted", "searchSorted")
  @js.native
  val searchSorted: js.Function3[
    /* sortedSequence */ Tensor[Rank] | TensorLike, 
    /* values */ Tensor[Rank] | TensorLike, 
    /* side */ js.UndefOr[left | right], 
    Tensor[Rank]
  ] = js.native
}
