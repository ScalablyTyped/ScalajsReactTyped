package typingsJapgolly.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssistantAssociationRequest extends StObject {
  
  /**
    * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantAssociationId: UuidOrArn
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
}
object DeleteAssistantAssociationRequest {
  
  inline def apply(assistantAssociationId: UuidOrArn, assistantId: UuidOrArn): DeleteAssistantAssociationRequest = {
    val __obj = js.Dynamic.literal(assistantAssociationId = assistantAssociationId.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssistantAssociationRequest]
  }
  
  extension [Self <: DeleteAssistantAssociationRequest](x: Self) {
    
    inline def setAssistantAssociationId(value: UuidOrArn): Self = StObject.set(x, "assistantAssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
  }
}
