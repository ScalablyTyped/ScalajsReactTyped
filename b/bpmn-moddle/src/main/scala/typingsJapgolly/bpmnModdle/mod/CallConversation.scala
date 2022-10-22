package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallConversation
  extends StObject
     with ConversationNode {
  
  var calledCollaborationRef: Collaboration
  
  var participantAssociations: js.Array[ParticipantAssociation]
}
object CallConversation {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    calledCollaborationRef: Collaboration,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRefs: js.Array[Participant]
  ): CallConversation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], calledCollaborationRef = calledCollaborationRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallConversation]
  }
  
  extension [Self <: CallConversation](x: Self) {
    
    inline def setCalledCollaborationRef(value: Collaboration): Self = StObject.set(x, "calledCollaborationRef", value.asInstanceOf[js.Any])
    
    inline def setParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = StObject.set(x, "participantAssociations", value.asInstanceOf[js.Any])
    
    inline def setParticipantAssociationsVarargs(value: ParticipantAssociation*): Self = StObject.set(x, "participantAssociations", js.Array(value*))
  }
}
