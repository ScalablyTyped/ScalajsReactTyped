package typingsJapgolly.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeartbeatMessageType extends StObject
@JSImport("node-forge", "tls.HeartbeatMessageType")
@js.native
object HeartbeatMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeartbeatMessageType & Double] = js.native
  
  @js.native
  sealed trait heartbeat_request
    extends StObject
       with HeartbeatMessageType
  /* 1 */ val heartbeat_request: typingsJapgolly.nodeForge.mod.tls.HeartbeatMessageType.heartbeat_request & Double = js.native
  
  @js.native
  sealed trait heartbeat_response
    extends StObject
       with HeartbeatMessageType
  /* 2 */ val heartbeat_response: typingsJapgolly.nodeForge.mod.tls.HeartbeatMessageType.heartbeat_response & Double = js.native
}
