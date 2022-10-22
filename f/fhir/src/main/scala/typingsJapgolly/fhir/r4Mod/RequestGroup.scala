package typingsJapgolly.fhir.r4Mod

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

trait RequestGroup
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The actions, if any, produced by the evaluation of the artifact.
    */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.undefined
  
  /**
    * Provides a reference to the author of the request group.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates when the request group was created.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this request.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element can be used to provide a code that captures the meaning of the request group as a whole, as opposed to the code of the action element, which captures the meaning of the individual actions within the request group.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the context of the request group, if any.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another) or by having a common requisition.  Requests that are part of the same requisition are generally treated independently from the perspective of changing their state or maintaining them after initial creation.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Allows a service to provide a unique, business identifier for the request.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A canonical URL referencing a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A URL referencing an externally defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow chain.
    */
  var intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * Provides a mechanism to communicate additional information about the response.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Indicates how quickly the request should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * Describes the reason for the request group in coded or textual form.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates another resource whose existence justifies this request group.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The replacement could be because the initial request was immediately rejected (due to an issue) or because the previous request was completed, but the need for the action described by the request remains ongoing.
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RequestGroup: typingsJapgolly.fhir.fhirStrings.RequestGroup
  
  /**
    * The current state of the request. For request groups, the status reflects the status of all the requests in the group.
    */
  var status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  
  /**
    * The subject for which the request group was created.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object RequestGroup {
  
  inline def apply(
    intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  ): RequestGroup = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "RequestGroup", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroup]
  }
  
  extension [Self <: RequestGroup](x: Self) {
    
    inline def setAction(value: js.Array[RequestGroupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: RequestGroupAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value*))
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.RequestGroup): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
