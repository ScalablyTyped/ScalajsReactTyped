package typingsJapgolly.redisTimeSeries.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisTimeSeries.distCommandsMod.RangeOptions
import typingsJapgolly.redisTimeSeries.distCommandsMod.SampleRawReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.SampleReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRANGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments = js.native
  def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp, options: RangeOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[SampleRawReply]): js.Array[SampleReply] = js.native
}
