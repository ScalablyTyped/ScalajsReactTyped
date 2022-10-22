package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.GT
import typingsJapgolly.redisClient.redisClientStrings.LT
import typingsJapgolly.redisClient.redisClientStrings.XX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedPEXPIRE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, milliseconds: Double): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    milliseconds: Double,
    mode: typingsJapgolly.redisClient.redisClientStrings.NX | XX | GT | LT
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: Double): Boolean = js.native
}
