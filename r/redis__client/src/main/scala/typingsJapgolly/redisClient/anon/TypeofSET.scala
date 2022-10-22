package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsSetMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSET extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, value: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, value: Double, options: SetOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, value: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, value: RedisCommandArgument, options: SetOptions): RedisCommandArguments = js.native
  
  def transformReply(): RedisCommandArgument | Null = js.native
}
