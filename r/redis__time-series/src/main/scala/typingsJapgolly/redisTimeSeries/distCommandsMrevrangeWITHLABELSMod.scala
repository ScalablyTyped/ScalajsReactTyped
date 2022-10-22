package typingsJapgolly.redisTimeSeries

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisTimeSeries.distCommandsMod.Filter
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeRawReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeWithLabelsOptions
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeWithLabelsReplyItem
import typingsJapgolly.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsMrevrangeWITHLABELSMod {
  
  @JSImport("@redis/time-series/dist/commands/MREVRANGE_WITHLABELS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/MREVRANGE_WITHLABELS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: Filter): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    fromTimestamp: Timestamp,
    toTimestamp: Timestamp,
    filters: Filter,
    options: MRangeWithLabelsOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: MRangeRawReply): js.Array[MRangeWithLabelsReplyItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MRangeWithLabelsReplyItem]]
}
