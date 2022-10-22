package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandRawReply
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.CommandReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsCommandMod {
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[CommandRawReply]): js.Array[CommandReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[CommandReply]]
}
