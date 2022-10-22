package typingsJapgolly.nodeZendesk.mod.Requests

import typingsJapgolly.nodeZendesk.mod.AuditableModel
import typingsJapgolly.nodeZendesk.mod.Tickets.Field
import typingsJapgolly.nodeZendesk.mod.Tickets.Priority
import typingsJapgolly.nodeZendesk.mod.Tickets.Status
import typingsJapgolly.nodeZendesk.mod.Tickets.TicketType
import typingsJapgolly.nodeZendesk.mod.Tickets.Via
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#json-format|Zendesk Requests JSON Format}
  */
trait ResponseModel
  extends StObject
     with AuditableModel {
  
  val assignee_id: ZendeskID | Null
  
  val can_be_solved_by_me: js.UndefOr[Boolean] = js.undefined
  
  val collaborator_ids: js.Array[ZendeskID]
  
  val custom_fields: js.Array[Field] | Null
  
  val description: String
  
  val due_at: String | Null
  
  val email_cc_ids: js.Array[ZendeskID]
  
  val fields: js.Array[Field] | Null
  
  val followup_source_id: String | Null
  
  val group_id: js.UndefOr[ZendeskID | Null] = js.undefined
  
  val is_public: Boolean
  
  val organization_id: ZendeskID | Null
  
  val priority: Priority | Null
  
  val recipient: String | Null
  
  val requester_id: ZendeskID
  
  val solved: js.UndefOr[Boolean] = js.undefined
  
  val status: Status
  
  val subject: String
  
  val ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  
  val `type`: TicketType | Null
  
  val url: String
  
  val via: Via
}
object ResponseModel {
  
  inline def apply(
    collaborator_ids: js.Array[ZendeskID],
    created_at: String,
    description: String,
    email_cc_ids: js.Array[ZendeskID],
    id: ZendeskID,
    is_public: Boolean,
    requester_id: ZendeskID,
    status: Status,
    subject: String,
    url: String,
    via: Via
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any], assignee_id = null, custom_fields = null, due_at = null, fields = null, followup_source_id = null, organization_id = null, priority = null, recipient = null, updated_at = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ResponseModel]
  }
  
  extension [Self <: ResponseModel](x: Self) {
    
    inline def setAssignee_id(value: ZendeskID): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
    
    inline def setAssignee_idNull: Self = StObject.set(x, "assignee_id", null)
    
    inline def setCan_be_solved_by_me(value: Boolean): Self = StObject.set(x, "can_be_solved_by_me", value.asInstanceOf[js.Any])
    
    inline def setCan_be_solved_by_meUndefined: Self = StObject.set(x, "can_be_solved_by_me", js.undefined)
    
    inline def setCollaborator_ids(value: js.Array[ZendeskID]): Self = StObject.set(x, "collaborator_ids", value.asInstanceOf[js.Any])
    
    inline def setCollaborator_idsVarargs(value: ZendeskID*): Self = StObject.set(x, "collaborator_ids", js.Array(value*))
    
    inline def setCustom_fields(value: js.Array[Field]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    inline def setCustom_fieldsVarargs(value: Field*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    inline def setEmail_cc_ids(value: js.Array[ZendeskID]): Self = StObject.set(x, "email_cc_ids", value.asInstanceOf[js.Any])
    
    inline def setEmail_cc_idsVarargs(value: ZendeskID*): Self = StObject.set(x, "email_cc_ids", js.Array(value*))
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFollowup_source_id(value: String): Self = StObject.set(x, "followup_source_id", value.asInstanceOf[js.Any])
    
    inline def setFollowup_source_idNull: Self = StObject.set(x, "followup_source_id", null)
    
    inline def setGroup_id(value: ZendeskID): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_idNull: Self = StObject.set(x, "group_id", null)
    
    inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
    
    inline def setIs_public(value: Boolean): Self = StObject.set(x, "is_public", value.asInstanceOf[js.Any])
    
    inline def setOrganization_id(value: ZendeskID): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    inline def setRequester_id(value: ZendeskID): Self = StObject.set(x, "requester_id", value.asInstanceOf[js.Any])
    
    inline def setSolved(value: Boolean): Self = StObject.set(x, "solved", value.asInstanceOf[js.Any])
    
    inline def setSolvedUndefined: Self = StObject.set(x, "solved", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTicket_form_id(value: Double): Self = StObject.set(x, "ticket_form_id", value.asInstanceOf[js.Any])
    
    inline def setTicket_form_idNull: Self = StObject.set(x, "ticket_form_id", null)
    
    inline def setTicket_form_idUndefined: Self = StObject.set(x, "ticket_form_id", js.undefined)
    
    inline def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
  }
}
