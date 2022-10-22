package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXaddMod.XAddOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, id: RedisCommandArgument, message: Record[String, RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    id: RedisCommandArgument,
    message: Record[String, RedisCommandArgument],
    options: XAddOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
