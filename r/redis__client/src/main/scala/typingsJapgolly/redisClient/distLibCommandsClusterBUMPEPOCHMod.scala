package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.redisClientStrings.BUMPED
import typingsJapgolly.redisClient.redisClientStrings.STILL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterBUMPEPOCHMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_BUMPEPOCH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(): BUMPED | STILL = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[BUMPED | STILL]
}
