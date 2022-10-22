package typingsJapgolly.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserMessage extends StObject {
  
  /**
    * The ID of the user.
    */
  var UserId: typingsJapgolly.awsSdk.clientsElasticacheMod.UserId
}
object DeleteUserMessage {
  
  inline def apply(UserId: UserId): DeleteUserMessage = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserMessage]
  }
  
  extension [Self <: DeleteUserMessage](x: Self) {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
