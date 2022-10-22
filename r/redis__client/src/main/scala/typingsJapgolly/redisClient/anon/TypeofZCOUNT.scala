package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZCOUNT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, min: Double, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: Double, max: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
