package typingsJapgolly.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait propagate extends StObject
@JSImport("grpc", "propagate")
@js.native
object propagate extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[propagate & Double] = js.native
  
  @js.native
  sealed trait CANCELLATION
    extends StObject
       with propagate
  /* 3 */ val CANCELLATION: typingsJapgolly.grpc.mod.propagate.CANCELLATION & Double = js.native
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT
    extends StObject
       with propagate
  /* 1 */ val CENSUS_STATS_CONTEXT: typingsJapgolly.grpc.mod.propagate.CENSUS_STATS_CONTEXT & Double = js.native
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT
    extends StObject
       with propagate
  /* 2 */ val CENSUS_TRACING_CONTEXT: typingsJapgolly.grpc.mod.propagate.CENSUS_TRACING_CONTEXT & Double = js.native
  
  @js.native
  sealed trait DEADLINE
    extends StObject
       with propagate
  /* 0 */ val DEADLINE: typingsJapgolly.grpc.mod.propagate.DEADLINE & Double = js.native
  
  @js.native
  sealed trait DEFAULTS
    extends StObject
       with propagate
  /* 4 */ val DEFAULTS: typingsJapgolly.grpc.mod.propagate.DEFAULTS & Double = js.native
}
