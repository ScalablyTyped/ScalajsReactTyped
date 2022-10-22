package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZrandmemberCOUNTWITHSCORESMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZRANDMEMBER_COUNT_WITHSCORES", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZRANDMEMBER_COUNT_WITHSCORES", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZRANDMEMBER_COUNT_WITHSCORES", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformZRandMemberCountArguments> is not an array type */ args: Parameters[
      js.Function2[/* key */ RedisCommandArgument, /* count */ Double, RedisCommandArguments]
    ]
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZMember]]
}
