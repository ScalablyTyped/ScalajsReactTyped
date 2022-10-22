package typingsJapgolly.nodeZendesk.mod.Tickets

import typingsJapgolly.nodeZendesk.mod.Requests.RequesterAnonymous
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#create-ticket|Zendesk Tickets Create}
  */
trait CreateModel extends StObject {
  
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.undefined
  
  var brand_id: js.UndefOr[Double | Null] = js.undefined
  
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var collaborators: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var comment: typingsJapgolly.nodeZendesk.mod.Requests.Comments.CreateModel
  
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  
  var due_at: js.UndefOr[String | Null] = js.undefined
  
  var email_cc_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var external_id: js.UndefOr[String | Null] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  
  var follower_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var forum_topic_id: js.UndefOr[Double | Null] = js.undefined
  
  var group_id: js.UndefOr[Double | Null] = js.undefined
  
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var organization_id: js.UndefOr[Double | Null] = js.undefined
  
  var priority: js.UndefOr[Priority | Null] = js.undefined
  
  var problem_id: js.UndefOr[Double | Null] = js.undefined
  
  var raw_subject: js.UndefOr[String | Null] = js.undefined
  
  var recipient: js.UndefOr[String | Null] = js.undefined
  
  var requester: js.UndefOr[RequesterAnonymous] = js.undefined
  
  var requester_id: js.UndefOr[ZendeskID] = js.undefined
  
  var status: js.UndefOr[Status | Null] = js.undefined
  
  var subject: js.UndefOr[String | Null] = js.undefined
  
  var submitter_id: js.UndefOr[ZendeskID | Null] = js.undefined
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: js.UndefOr[TicketType | Null] = js.undefined
  
  var via_followup_source_id: js.UndefOr[Double | Null] = js.undefined
}
object CreateModel {
  
  inline def apply(comment: typingsJapgolly.nodeZendesk.mod.Requests.Comments.CreateModel): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
  
  extension [Self <: CreateModel](x: Self) {
    
    inline def setAssignee_id(value: ZendeskID): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
    
    inline def setAssignee_idNull: Self = StObject.set(x, "assignee_id", null)
    
    inline def setAssignee_idUndefined: Self = StObject.set(x, "assignee_id", js.undefined)
    
    inline def setBrand_id(value: Double): Self = StObject.set(x, "brand_id", value.asInstanceOf[js.Any])
    
    inline def setBrand_idNull: Self = StObject.set(x, "brand_id", null)
    
    inline def setBrand_idUndefined: Self = StObject.set(x, "brand_id", js.undefined)
    
    inline def setCollaborator_ids(value: js.Array[Double]): Self = StObject.set(x, "collaborator_ids", value.asInstanceOf[js.Any])
    
    inline def setCollaborator_idsNull: Self = StObject.set(x, "collaborator_ids", null)
    
    inline def setCollaborator_idsUndefined: Self = StObject.set(x, "collaborator_ids", js.undefined)
    
    inline def setCollaborator_idsVarargs(value: Double*): Self = StObject.set(x, "collaborator_ids", js.Array(value*))
    
    inline def setCollaborators(value: js.Array[Any]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsNull: Self = StObject.set(x, "collaborators", null)
    
    inline def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    inline def setCollaboratorsVarargs(value: Any*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setComment(value: typingsJapgolly.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCustom_fields(value: js.Array[Field]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setCustom_fieldsVarargs(value: Field*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
    
    inline def setEmail_cc_ids(value: js.Array[Double]): Self = StObject.set(x, "email_cc_ids", value.asInstanceOf[js.Any])
    
    inline def setEmail_cc_idsNull: Self = StObject.set(x, "email_cc_ids", null)
    
    inline def setEmail_cc_idsUndefined: Self = StObject.set(x, "email_cc_ids", js.undefined)
    
    inline def setEmail_cc_idsVarargs(value: Double*): Self = StObject.set(x, "email_cc_ids", js.Array(value*))
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFollower_ids(value: js.Array[Double]): Self = StObject.set(x, "follower_ids", value.asInstanceOf[js.Any])
    
    inline def setFollower_idsNull: Self = StObject.set(x, "follower_ids", null)
    
    inline def setFollower_idsUndefined: Self = StObject.set(x, "follower_ids", js.undefined)
    
    inline def setFollower_idsVarargs(value: Double*): Self = StObject.set(x, "follower_ids", js.Array(value*))
    
    inline def setForum_topic_id(value: Double): Self = StObject.set(x, "forum_topic_id", value.asInstanceOf[js.Any])
    
    inline def setForum_topic_idNull: Self = StObject.set(x, "forum_topic_id", null)
    
    inline def setForum_topic_idUndefined: Self = StObject.set(x, "forum_topic_id", js.undefined)
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_idNull: Self = StObject.set(x, "group_id", null)
    
    inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
    
    inline def setMacro_ids(value: js.Array[Double]): Self = StObject.set(x, "macro_ids", value.asInstanceOf[js.Any])
    
    inline def setMacro_idsNull: Self = StObject.set(x, "macro_ids", null)
    
    inline def setMacro_idsUndefined: Self = StObject.set(x, "macro_ids", js.undefined)
    
    inline def setMacro_idsVarargs(value: Double*): Self = StObject.set(x, "macro_ids", js.Array(value*))
    
    inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    inline def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProblem_id(value: Double): Self = StObject.set(x, "problem_id", value.asInstanceOf[js.Any])
    
    inline def setProblem_idNull: Self = StObject.set(x, "problem_id", null)
    
    inline def setProblem_idUndefined: Self = StObject.set(x, "problem_id", js.undefined)
    
    inline def setRaw_subject(value: String): Self = StObject.set(x, "raw_subject", value.asInstanceOf[js.Any])
    
    inline def setRaw_subjectNull: Self = StObject.set(x, "raw_subject", null)
    
    inline def setRaw_subjectUndefined: Self = StObject.set(x, "raw_subject", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRequester(value: RequesterAnonymous): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRequester_id(value: ZendeskID): Self = StObject.set(x, "requester_id", value.asInstanceOf[js.Any])
    
    inline def setRequester_idUndefined: Self = StObject.set(x, "requester_id", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubmitter_id(value: ZendeskID): Self = StObject.set(x, "submitter_id", value.asInstanceOf[js.Any])
    
    inline def setSubmitter_idNull: Self = StObject.set(x, "submitter_id", null)
    
    inline def setSubmitter_idUndefined: Self = StObject.set(x, "submitter_id", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTicket_form_id(value: Double): Self = StObject.set(x, "ticket_form_id", value.asInstanceOf[js.Any])
    
    inline def setTicket_form_idNull: Self = StObject.set(x, "ticket_form_id", null)
    
    inline def setTicket_form_idUndefined: Self = StObject.set(x, "ticket_form_id", js.undefined)
    
    inline def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVia_followup_source_id(value: Double): Self = StObject.set(x, "via_followup_source_id", value.asInstanceOf[js.Any])
    
    inline def setVia_followup_source_idNull: Self = StObject.set(x, "via_followup_source_id", null)
    
    inline def setVia_followup_source_idUndefined: Self = StObject.set(x, "via_followup_source_id", js.undefined)
  }
}
