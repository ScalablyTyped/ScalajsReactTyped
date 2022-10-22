package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.`on-hold`
import typingsJapgolly.fhir.fhirStrings.accepted
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.planned
import typingsJapgolly.fhir.fhirStrings.proposed
import typingsJapgolly.fhir.fhirStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Goal
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _continuous: js.UndefOr[Element] = js.undefined
  
  var _lifecycleStatus: js.UndefOr[Element] = js.undefined
  
  var _startDate: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  var _statusReason: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the progression, or lack thereof, towards the goal against the target.
    */
  var achievementStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The identified conditions and other health record elements that are intended to be addressed by the goal.
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates a category the goal falls within.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example, getting a yellow fever vaccination for a planned trip is a goal that is designed to be completed (continuous = false).  A goal to sustain HbA1c levels would not be a one-time goal (continuous = true).
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If no code is available, use CodeableConcept.text.
    */
  var description: CodeableConcept
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the lifecycleStatus contains codes that mark the resource as not currently valid.
    */
  var lifecycleStatus: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected
  
  /**
    * May be used for progress notes, concerns or other related information that doesn't actually describe the goal itself.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Note that this should not duplicate the goal status; The goal outcome is independent of the outcome of the related activities.  For example, if the Goal is to achieve a target body weight of 150 lb and a care plan activity is defined to diet, then the care plan’s activity outcome could be calories consumed whereas goal outcome is an observation for the actual body weight measured.
    */
  var outcome: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Extensions are available to track priorities as established by each participant (i.e. Priority from the patient's perspective, different practitioners' perspectives, family member's perspectives)
    * The ordinal extension on Coding can be used to convey a numerically comparable ranking to priority.  (Keep in mind that different coding systems may use a "low value=important".
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Goal: typingsJapgolly.fhir.fhirStrings.Goal
  
  /**
    * This is the individual or team responsible for establishing the goal, not necessarily who recorded it.  (For that, use the Provenance resource.).
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date or event after which the goal should begin being pursued.
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date or event after which the goal should begin being pursued.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * To see the date for past statuses, query history.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be captured for statuses such as rejected, on-hold or cancelled, but could be present for others.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the patient, group or organization for whom the goal is being established.
    */
  var subject: Reference
  
  /**
    * When multiple targets are present for a single goal instance, all targets must be met for the overall goal to be met.
    */
  var target: js.UndefOr[js.Array[GoalTarget]] = js.undefined
}
object Goal {
  
  inline def apply(
    description: CodeableConcept,
    lifecycleStatus: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected,
    subject: Reference
  ): Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], lifecycleStatus = lifecycleStatus.asInstanceOf[js.Any], resourceType = "Goal", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Goal]
  }
  
  extension [Self <: Goal](x: Self) {
    
    inline def setAchievementStatus(value: CodeableConcept): Self = StObject.set(x, "achievementStatus", value.asInstanceOf[js.Any])
    
    inline def setAchievementStatusUndefined: Self = StObject.set(x, "achievementStatus", js.undefined)
    
    inline def setAddresses(value: js.Array[Reference]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Reference*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLifecycleStatus(
      value: proposed | planned | accepted | active | `on-hold` | completed | cancelled | `entered-in-error` | rejected
    ): Self = StObject.set(x, "lifecycleStatus", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutcome(value: js.Array[CodeableReference]): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setOutcomeVarargs(value: CodeableReference*): Self = StObject.set(x, "outcome", js.Array(value*))
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.Goal): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "startCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStartCodeableConceptUndefined: Self = StObject.set(x, "startCodeableConcept", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[GoalTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: GoalTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_continuous(value: Element): Self = StObject.set(x, "_continuous", value.asInstanceOf[js.Any])
    
    inline def set_continuousUndefined: Self = StObject.set(x, "_continuous", js.undefined)
    
    inline def set_lifecycleStatus(value: Element): Self = StObject.set(x, "_lifecycleStatus", value.asInstanceOf[js.Any])
    
    inline def set_lifecycleStatusUndefined: Self = StObject.set(x, "_lifecycleStatus", js.undefined)
    
    inline def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    inline def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_statusReason(value: Element): Self = StObject.set(x, "_statusReason", value.asInstanceOf[js.Any])
    
    inline def set_statusReasonUndefined: Self = StObject.set(x, "_statusReason", js.undefined)
  }
}
