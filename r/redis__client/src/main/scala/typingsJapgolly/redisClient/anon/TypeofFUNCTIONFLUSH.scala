package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.ASYNC
import typingsJapgolly.redisClient.redisClientStrings.OK
import typingsJapgolly.redisClient.redisClientStrings.SYNC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONFLUSH extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(mode: ASYNC | SYNC): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
