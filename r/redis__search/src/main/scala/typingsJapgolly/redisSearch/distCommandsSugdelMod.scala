package typingsJapgolly.redisSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSugdelMod {
  
  @JSImport("@redis/search/dist/commands/SUGDEL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(key: String, string: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
