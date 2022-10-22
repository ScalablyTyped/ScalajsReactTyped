package typingsJapgolly.redisTimeSeries.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisTimeSeries.distCommandsMod.Filter
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeOptions
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeRawReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.MRangeReplyItem
import typingsJapgolly.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMREVRANGE extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: Filter): RedisCommandArguments = js.native
  def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: Filter, options: MRangeOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: MRangeRawReply): js.Array[MRangeReplyItem] = js.native
}
