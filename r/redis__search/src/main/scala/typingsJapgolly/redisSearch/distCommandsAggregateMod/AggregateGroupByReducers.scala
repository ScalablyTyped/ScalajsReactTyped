package typingsJapgolly.redisSearch.distCommandsAggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregateGroupByReducers extends StObject
@JSImport("@redis/search/dist/commands/AGGREGATE", "AggregateGroupByReducers")
@js.native
object AggregateGroupByReducers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregateGroupByReducers & String] = js.native
  
  @js.native
  sealed trait AVG
    extends StObject
       with AggregateGroupByReducers
  /* "AVG" */ val AVG: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG & String = js.native
  
  @js.native
  sealed trait COUNT
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT" */ val COUNT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT & String = js.native
  
  @js.native
  sealed trait COUNT_DISTINCT
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
  
  @js.native
  sealed trait COUNT_DISTINCTISH
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
  
  @js.native
  sealed trait FIRST_VALUE
    extends StObject
       with AggregateGroupByReducers
  /* "FIRST_VALUE" */ val FIRST_VALUE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
  
  @js.native
  sealed trait MAX
    extends StObject
       with AggregateGroupByReducers
  /* "MAX" */ val MAX: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX & String = js.native
  
  @js.native
  sealed trait MIN
    extends StObject
       with AggregateGroupByReducers
  /* "MIN" */ val MIN: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN & String = js.native
  
  @js.native
  sealed trait QUANTILE
    extends StObject
       with AggregateGroupByReducers
  /* "QUANTILE" */ val QUANTILE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
  
  @js.native
  sealed trait RANDOM_SAMPLE
    extends StObject
       with AggregateGroupByReducers
  /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
  
  @js.native
  sealed trait STDDEV
    extends StObject
       with AggregateGroupByReducers
  /* "STDDEV" */ val STDDEV: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with AggregateGroupByReducers
  /* "SUM" */ val SUM: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM & String = js.native
  
  @js.native
  sealed trait TOLIST
    extends StObject
       with AggregateGroupByReducers
  /* "TOLIST" */ val TOLIST: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
  
  @js.native
  sealed trait TO_LIST
    extends StObject
       with AggregateGroupByReducers
  /* "TOLIST" */ val TO_LIST: typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
}
