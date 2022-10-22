package typingsJapgolly.redisJson

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsRespMod {
  
  @JSImport("@redis/json/dist/commands/RESP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/RESP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): RESPReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RESPReply]
  
  @js.native
  trait RESPReply
    extends StObject
       with Array[String | Double | RESPReply]
}
