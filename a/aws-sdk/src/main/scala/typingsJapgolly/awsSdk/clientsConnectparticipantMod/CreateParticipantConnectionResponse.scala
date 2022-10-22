package typingsJapgolly.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParticipantConnectionResponse extends StObject {
  
  /**
    * Creates the participant's connection credentials. The authentication token associated with the participant's connection.
    */
  var ConnectionCredentials: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectparticipantMod.ConnectionCredentials] = js.undefined
  
  /**
    * Creates the participant's websocket connection.
    */
  var Websocket: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectparticipantMod.Websocket] = js.undefined
}
object CreateParticipantConnectionResponse {
  
  inline def apply(): CreateParticipantConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParticipantConnectionResponse]
  }
  
  extension [Self <: CreateParticipantConnectionResponse](x: Self) {
    
    inline def setConnectionCredentials(value: ConnectionCredentials): Self = StObject.set(x, "ConnectionCredentials", value.asInstanceOf[js.Any])
    
    inline def setConnectionCredentialsUndefined: Self = StObject.set(x, "ConnectionCredentials", js.undefined)
    
    inline def setWebsocket(value: Websocket): Self = StObject.set(x, "Websocket", value.asInstanceOf[js.Any])
    
    inline def setWebsocketUndefined: Self = StObject.set(x, "Websocket", js.undefined)
  }
}
