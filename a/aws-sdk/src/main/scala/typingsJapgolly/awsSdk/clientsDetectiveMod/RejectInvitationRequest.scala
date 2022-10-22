package typingsJapgolly.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInvitationRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to reject the invitation to. The member account's current member status in the behavior graph must be INVITED.
    */
  var GraphArn: typingsJapgolly.awsSdk.clientsDetectiveMod.GraphArn
}
object RejectInvitationRequest {
  
  inline def apply(GraphArn: GraphArn): RejectInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInvitationRequest]
  }
  
  extension [Self <: RejectInvitationRequest](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
