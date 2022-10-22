package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeOptions
import typingsJapgolly.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeRawReply
import typingsJapgolly.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXPENDINGRANGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, start: String, end: String, count: Double): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    start: String,
    end: String,
    count: Double,
    options: XPendingRangeOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: XPendingRangeRawReply): XPendingRangeReply = js.native
}
