package typingsJapgolly.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsModuleUNLOADMod {
  
  @JSImport("@redis/client/dist/lib/commands/MODULE_UNLOAD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
