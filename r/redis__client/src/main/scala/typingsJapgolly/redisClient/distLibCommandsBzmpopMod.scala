package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.SortedSetSide
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.ZMPopOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsZmpopMod.ZMPopRawReply
import typingsJapgolly.redisClient.distLibCommandsZmpopMod.ZMPopReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBzmpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BZMPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BZMPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 3 */ Double = js.native
  
  inline def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: RedisCommandArgument, side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: RedisCommandArgument, side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ZMPopRawReply): ZMPopReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ZMPopReply]
}
