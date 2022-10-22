package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPUBSUBNUMSUB extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(channels: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(channels: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(rawReply: js.Array[String | Double]): Record[String, Double] = js.native
}
