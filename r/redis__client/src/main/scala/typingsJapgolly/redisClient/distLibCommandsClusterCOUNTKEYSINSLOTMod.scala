package typingsJapgolly.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterCOUNTKEYSINSLOTMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_COUNTKEYSINSLOT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(slot: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(slot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}
