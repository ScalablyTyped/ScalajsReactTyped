package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.redisClientStrings.NO
import typingsJapgolly.redisClient.redisClientStrings.SYNC
import typingsJapgolly.redisClient.redisClientStrings.YES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsScriptDEBUGMod {
  
  @JSImport("@redis/client/dist/lib/commands/SCRIPT_DEBUG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(mode: YES | SYNC | NO): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
