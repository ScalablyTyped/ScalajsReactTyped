package typingsJapgolly.symphonyApiClientNode

import typingsJapgolly.symphonyApiClientNode.connectionsClientMod.Connection
import typingsJapgolly.symphonyApiClientNode.messagesClientMod.Message
import typingsJapgolly.symphonyApiClientNode.streamsClientMod.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oboclientMod {
  
  @JSImport("symphony-api-client-node/OBOClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "MESSAGEML_FORMAT")
  @js.native
  val MESSAGEML_FORMAT: String = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "PRESENTATIONML_FORMAT")
  @js.native
  val PRESENTATIONML_FORMAT: String = js.native
  
  inline def oboGetAllConnections(status: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboGetAllConnections")(status.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def oboGetConnection(userId: String): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboGetConnection")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
  
  inline def oboGetUserIMStreamId(userToken: String, userIds: js.Array[Double]): js.Promise[UserId] = (^.asInstanceOf[js.Dynamic].applyDynamic("oboGetUserIMStreamId")(userToken.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserId]]
  
  inline def oboSendMessage(userToken: String, conversationId: String, message: String, data: Any, format: String): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("oboSendMessage")(userToken.asInstanceOf[js.Any], conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  trait OboUser extends StObject {
    
    var displayName: String
    
    var email: String
    
    var firstName: String
    
    var lastName: String
    
    var userId: String
    
    var username: String
  }
  object OboUser {
    
    inline def apply(
      displayName: String,
      email: String,
      firstName: String,
      lastName: String,
      userId: String,
      username: String
    ): OboUser = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[OboUser]
    }
    
    extension [Self <: OboUser](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
