package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.anon.Element
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBlpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BLPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BLPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(keys: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: BLPopRawReply): BLPopReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[BLPopReply]
  
  type BLPopRawReply = Null | (js.Tuple2[RedisCommandArgument, RedisCommandArgument])
  
  type BLPopReply = Null | Element
}
