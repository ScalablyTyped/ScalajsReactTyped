package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.ASYNC
import typingsJapgolly.redisClient.redisClientStrings.OK
import typingsJapgolly.redisClient.redisClientStrings.SYNC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionFLUSHMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_FLUSH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(mode: ASYNC | SYNC): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
