package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.ScanOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsSscanMod.SScanRawReply
import typingsJapgolly.redisClient.distLibCommandsSscanMod.SScanReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSSCAN extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, cursor: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, cursor: Double, options: ScanOptions): RedisCommandArguments = js.native
  
  def transformReply(hasCursorMembers: SScanRawReply): SScanReply = js.native
}
