package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXautoclaimMod.XAutoClaimOptions
import typingsJapgolly.redisClient.distLibCommandsXautoclaimMod.XAutoClaimRawReply
import typingsJapgolly.redisClient.distLibCommandsXautoclaimMod.XAutoClaimReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXAUTOCLAIMFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String,
    options: XAutoClaimOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: XAutoClaimRawReply): XAutoClaimReply = js.native
}
