package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.`filler-order`
import typingsJapgolly.fhir.fhirStrings.`instance-order`
import typingsJapgolly.fhir.fhirStrings.`on-hold`
import typingsJapgolly.fhir.fhirStrings.`original-order`
import typingsJapgolly.fhir.fhirStrings.`reflex-order`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.asap
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.directive
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.option
import typingsJapgolly.fhir.fhirStrings.order_
import typingsJapgolly.fhir.fhirStrings.plan
import typingsJapgolly.fhir.fhirStrings.proposal
import typingsJapgolly.fhir.fhirStrings.revoked
import typingsJapgolly.fhir.fhirStrings.routine
import typingsJapgolly.fhir.fhirStrings.stat
import typingsJapgolly.fhir.fhirStrings.unknown
import typingsJapgolly.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommunicationRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Don't use CommunicationRequest.about element when a more specific element exists, such as basedOn, reasonReference, or replaces.
    */
  var about: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For draft requests, indicates the date of initial creation.  For requests with other statuses, indicates the date of activation.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * A plan or proposal that is fulfilled in whole or in part by this request.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * There may be multiple axes of categorization and one communication request may serve multiple purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The attributes provided with the request qualify what is not to be done.
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another) or by having a common requisition.  Requests that are part of the same requisition are generally treated independently from the perspective of changing their state or maintaining them after initial creation.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The entity (e.g. person, organization, clinical information system, or device) which is to be the source of the communication.
    */
  var informationProvider: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is expected to be immutable.  E.g. A "proposal" instance should never change to be a "plan" instance or "order" instance.  Instead, a new instance 'basedOn' the prior instance should be created with the new 'intent' value.
    * One exception to this is that the granularity of CommunicationRequest.intent is allowed to change.  For example, a Request identified as an "order" might later be clarified to be a "filler-order".  Or, in rarer cases (to meet recipient constraints), the reverse might also occur.
    */
  var intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * A channel that was used for this communication (e.g. email, fax).
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Comments made about the request by the requester, sender, recipient, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The time when this communication is to occur.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time when this communication is to occur.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Text, attachment(s), or resource(s) to be communicated to the recipient.
    */
  var payload: js.UndefOr[js.Array[CommunicationRequestPayload]] = js.undefined
  
  /**
    * Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat, urgent, routine.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * Textual reasons can be captured using reasonCode.text.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The replacement could be because the initial request was immediately rejected (due to an issue) or because the previous request was completed, but the need for the action described by the request remains ongoing.
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The device, individual, or organization who asks for the information to be shared.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CommunicationRequest: typingsJapgolly.fhir.fhirStrings.CommunicationRequest
  
  /**
    * The status of the proposal or order.
    */
  var status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  
  /**
    * This is generally only used for "exception" statuses such as "on-hold" or "revoked".  The reason why the CommunicationRequest was created at all is captured in reasonCode, not here.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The patient or group that is the focus of this communication request.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object CommunicationRequest {
  
  inline def apply(
    intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  ): CommunicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "CommunicationRequest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommunicationRequest]
  }
  
  extension [Self <: CommunicationRequest](x: Self) {
    
    inline def setAbout(value: js.Array[Reference]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAboutVarargs(value: Reference*): Self = StObject.set(x, "about", js.Array(value*))
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    inline def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationProvider(value: js.Array[Reference]): Self = StObject.set(x, "informationProvider", value.asInstanceOf[js.Any])
    
    inline def setInformationProviderUndefined: Self = StObject.set(x, "informationProvider", js.undefined)
    
    inline def setInformationProviderVarargs(value: Reference*): Self = StObject.set(x, "informationProvider", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: js.Array[CodeableConcept]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setMediumVarargs(value: CodeableConcept*): Self = StObject.set(x, "medium", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setPayload(value: js.Array[CommunicationRequestPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: CommunicationRequestPayload*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value*))
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.CommunicationRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_doNotPerform(value: Element): Self = StObject.set(x, "_doNotPerform", value.asInstanceOf[js.Any])
    
    inline def set_doNotPerformUndefined: Self = StObject.set(x, "_doNotPerform", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
