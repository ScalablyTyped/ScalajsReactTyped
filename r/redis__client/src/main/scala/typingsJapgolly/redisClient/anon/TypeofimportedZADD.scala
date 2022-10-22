package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsZaddMod.ZAddOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember]): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: js.Array[ZMember], options: ZAddOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: ZMember): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, members: ZMember, options: ZAddOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: RedisCommandArgument): Double = js.native
}
