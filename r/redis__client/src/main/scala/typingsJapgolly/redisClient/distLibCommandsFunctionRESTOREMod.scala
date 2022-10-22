package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.APPEND
import typingsJapgolly.redisClient.redisClientStrings.FLUSH
import typingsJapgolly.redisClient.redisClientStrings.OK
import typingsJapgolly.redisClient.redisClientStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionRESTOREMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_RESTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(dump: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dump.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(dump: RedisCommandArgument, mode: FLUSH | APPEND | REPLACE): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dump.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
