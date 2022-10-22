package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.anon.Consumers
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXinfoGROUPSMod {
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_GROUPS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_GROUPS", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XINFO_GROUPS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(rawReply: js.Array[Any]): XInfoGroupsReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[XInfoGroupsReply]
  
  type XInfoGroupsReply = js.Array[Consumers]
}
