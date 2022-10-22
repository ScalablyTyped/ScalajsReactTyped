package typingsJapgolly.redisSearch.distCommandsAggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregateSteps extends StObject
@JSImport("@redis/search/dist/commands/AGGREGATE", "AggregateSteps")
@js.native
object AggregateSteps extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregateSteps & String] = js.native
  
  @js.native
  sealed trait APPLY
    extends StObject
       with AggregateSteps
  /* "APPLY" */ val APPLY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.APPLY & String = js.native
  
  @js.native
  sealed trait FILTER
    extends StObject
       with AggregateSteps
  /* "FILTER" */ val FILTER: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.FILTER & String = js.native
  
  @js.native
  sealed trait GROUPBY
    extends StObject
       with AggregateSteps
  /* "GROUPBY" */ val GROUPBY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.GROUPBY & String = js.native
  
  @js.native
  sealed trait LIMIT
    extends StObject
       with AggregateSteps
  /* "LIMIT" */ val LIMIT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.LIMIT & String = js.native
  
  @js.native
  sealed trait SORTBY
    extends StObject
       with AggregateSteps
  /* "SORTBY" */ val SORTBY: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateSteps.SORTBY & String = js.native
}
