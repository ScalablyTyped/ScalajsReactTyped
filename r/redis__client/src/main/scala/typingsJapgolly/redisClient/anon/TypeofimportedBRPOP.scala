package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsBlpopMod.BLPopRawReply
import typingsJapgolly.redisClient.distLibCommandsBlpopMod.BLPopReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedBRPOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, timeout: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: BLPopRawReply): BLPopReply = js.native
}
