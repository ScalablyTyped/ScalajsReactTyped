package typingsJapgolly.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossOpsUtilsMod {
  
  @js.native
  sealed trait Reduction extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops_utils", "Reduction")
  @js.native
  object Reduction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Reduction & Double] = js.native
    
    @js.native
    sealed trait MEAN
      extends StObject
         with Reduction
    /* 1 */ val MEAN: typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction.MEAN & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Reduction
    /* 0 */ val NONE: typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction.NONE & Double = js.native
    
    @js.native
    sealed trait SUM
      extends StObject
         with Reduction
    /* 2 */ val SUM: typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction.SUM & Double = js.native
    
    @js.native
    sealed trait SUM_BY_NONZERO_WEIGHTS
      extends StObject
         with Reduction
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typingsJapgolly.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction.SUM_BY_NONZERO_WEIGHTS & Double = js.native
  }
}
