package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.`filler-order`
import typingsJapgolly.fhir.fhirStrings.`in-progress`
import typingsJapgolly.fhir.fhirStrings.`instance-order`
import typingsJapgolly.fhir.fhirStrings.`on-hold`
import typingsJapgolly.fhir.fhirStrings.`original-order`
import typingsJapgolly.fhir.fhirStrings.`reflex-order`
import typingsJapgolly.fhir.fhirStrings.accepted
import typingsJapgolly.fhir.fhirStrings.asap
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.failed
import typingsJapgolly.fhir.fhirStrings.option
import typingsJapgolly.fhir.fhirStrings.order_
import typingsJapgolly.fhir.fhirStrings.plan
import typingsJapgolly.fhir.fhirStrings.proposal
import typingsJapgolly.fhir.fhirStrings.ready
import typingsJapgolly.fhir.fhirStrings.received
import typingsJapgolly.fhir.fhirStrings.rejected
import typingsJapgolly.fhir.fhirStrings.requested
import typingsJapgolly.fhir.fhirStrings.routine
import typingsJapgolly.fhir.fhirStrings.stat
import typingsJapgolly.fhir.fhirStrings.unknown
import typingsJapgolly.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[Element] = js.undefined
  
  var _instantiatesUri: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date and time this task was created.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contains business-specific nuances of the business state.
    */
  var businessStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The title (eg "My Tasks", "Outstanding Tasks for Patient X") should go into the code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A free-text description of what is to be performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
    */
  var executionPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If multiple resources need to be manipulated, use sub-tasks.  (This ensures that status can be tracked independently for each referenced resource.).
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
  /**
    * The entity who benefits from the performance of the service specified in the task (e.g., the patient).
    */
  var `for`: js.UndefOr[Reference] = js.undefined
  
  /**
    * An identifier that links together multiple tasks and other requests that were created in the same context.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The business identifier for this task.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information that may be needed in the execution of the task.
    */
  var input: js.UndefOr[js.Array[TaskInput]] = js.undefined
  
  /**
    * The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
    */
  var instantiatesCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Task.
    */
  var instantiatesUri: js.UndefOr[String] = js.undefined
  
  /**
    * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.
    */
  var insurance: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is immutable.  Proposed tasks, planned tasks, etc. must be distinct instances.
    * In most cases, Tasks will have an intent of "order".
    */
  var intent: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * The date and time of last modification to this task.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Principal physical location where the this task is performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Free-text information captured about the task as it progresses.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Outputs produced by the Task.
    */
  var output: js.UndefOr[js.Array[TaskOutput]] = js.undefined
  
  /**
    * Tasks may be created with an owner not yet identified.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * This should usually be 0..1.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The kind of participant that should perform the task.
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates how quickly the Task should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * This should only be included if there is no focus or if it differs from the reason indicated on the focus.
    */
  var reasonCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Tasks might be justified based on an Observation, a Condition, a past or planned procedure, etc.   This should only be included if there is no focus or if it differs from the reason indicated on the focus.    Use the CodeableConcept text element in `Task.reasonCode` if the data is free (uncoded) text.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element does not point to the Provenance associated with the *current* version of the resource - as it would be created after this version existed.  The Provenance for the current version can be retrieved with a _revinclude.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The creator of the task.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Task: typingsJapgolly.fhir.fhirStrings.Task
  
  /**
    * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
    */
  var restriction: js.UndefOr[TaskRestriction] = js.undefined
  
  /**
    * The current status of the task.
    */
  var status: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
  
  /**
    * This applies to the current status.  Look at the history of the task to see reasons for past statuses.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}
object Task {
  
  inline def apply(
    intent: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
  ): Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "Task", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBusinessStatus(value: CodeableConcept): Self = StObject.set(x, "businessStatus", value.asInstanceOf[js.Any])
    
    inline def setBusinessStatusUndefined: Self = StObject.set(x, "businessStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setExecutionPeriod(value: Period): Self = StObject.set(x, "executionPeriod", value.asInstanceOf[js.Any])
    
    inline def setExecutionPeriodUndefined: Self = StObject.set(x, "executionPeriod", js.undefined)
    
    inline def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFor(value: Reference): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInput(value: js.Array[TaskInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: TaskInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: String): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesUri(value: String): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInsurance(value: js.Array[Reference]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: Reference*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setIntent(
      value: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutput(value: js.Array[TaskOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: TaskOutput*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformerType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "performerType", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: CodeableConcept): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.Task): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRestriction(value: TaskRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setStatus(
      value: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_instantiatesCanonical(value: Element): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesUri(value: Element): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_lastModified(value: Element): Self = StObject.set(x, "_lastModified", value.asInstanceOf[js.Any])
    
    inline def set_lastModifiedUndefined: Self = StObject.set(x, "_lastModified", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
