package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.anon.CreateTime
import typingsJapgolly.redisClient.redisClientStrings.`send-buffer-allocated`
import typingsJapgolly.redisClient.redisClientStrings.`send-buffer-used`
import typingsJapgolly.redisClient.redisClientStrings.createTime
import typingsJapgolly.redisClient.redisClientStrings.direction
import typingsJapgolly.redisClient.redisClientStrings.events
import typingsJapgolly.redisClient.redisClientStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClusterLINKSMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLUSTER_LINKS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: ClusterLinksRawReply): ClusterLinksReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ClusterLinksReply]
  
  type ClusterLinksRawReply = js.Array[
    js.Tuple12[
      direction, 
      String, 
      node, 
      String, 
      createTime, 
      Double, 
      events, 
      String, 
      `send-buffer-allocated`, 
      Double, 
      `send-buffer-used`, 
      Double
    ]
  ]
  
  type ClusterLinksReply = js.Array[CreateTime]
}
