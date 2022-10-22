package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXtrimMod.XTrimOptions
import typingsJapgolly.redisClient.redisClientStrings.MAXLEN
import typingsJapgolly.redisClient.redisClientStrings.MINID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXTRIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double, options: XTrimOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
