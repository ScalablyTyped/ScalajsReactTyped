package typingsJapgolly.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeSeriesDuplicatePolicies extends StObject
@JSImport("@redis/time-series/dist/commands", "TimeSeriesDuplicatePolicies")
@js.native
object TimeSeriesDuplicatePolicies extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimeSeriesDuplicatePolicies & String] = js.native
  
  @js.native
  sealed trait BLOCK
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "BLOCK" */ val BLOCK: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.BLOCK & String = js.native
  
  @js.native
  sealed trait FIRST
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "FIRST" */ val FIRST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.FIRST & String = js.native
  
  @js.native
  sealed trait LAST
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "LAST" */ val LAST: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.LAST & String = js.native
  
  @js.native
  sealed trait MAX
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "MAX" */ val MAX: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MAX & String = js.native
  
  @js.native
  sealed trait MIN
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "MIN" */ val MIN: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MIN & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with TimeSeriesDuplicatePolicies
  /* "SUM" */ val SUM: typingsJapgolly.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.SUM & String = js.native
}
