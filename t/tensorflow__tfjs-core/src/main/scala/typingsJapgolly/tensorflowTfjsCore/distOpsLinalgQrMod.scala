package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLinalgQrMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/linalg/qr", "qr")
  @js.native
  val qr: js.Function2[
    /* x */ Tensor[Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[Tensor[Rank], Tensor[Rank]]
  ] = js.native
}
