package typingsJapgolly.redisClient

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClientCACHINGMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_CACHING", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(value: Boolean): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(value.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK | Buffer]
}
