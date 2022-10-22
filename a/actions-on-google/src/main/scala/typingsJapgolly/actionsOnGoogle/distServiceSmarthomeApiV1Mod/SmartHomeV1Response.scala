package typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse
  - typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse
  - typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse
  - typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectResponse
*/
trait SmartHomeV1Response extends StObject
object SmartHomeV1Response {
  
  inline def SmartHomeV1ExecuteResponse(payload: SmartHomeV1ExecutePayload, requestId: String): typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteResponse]
  }
  
  inline def SmartHomeV1QueryResponse(payload: SmartHomeV1QueryPayload, requestId: String): typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryResponse]
  }
  
  inline def SmartHomeV1SyncResponse(payload: SmartHomeV1SyncPayload, requestId: String): typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncResponse]
  }
}
