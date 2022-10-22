package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.APPEND
import typingsJapgolly.redisClient.redisClientStrings.FLUSH
import typingsJapgolly.redisClient.redisClientStrings.OK
import typingsJapgolly.redisClient.redisClientStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONRESTORE extends StObject {
  
  def transformArguments(dump: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(dump: RedisCommandArgument, mode: FLUSH | APPEND | REPLACE): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
