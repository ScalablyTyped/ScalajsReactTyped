package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.inactive
import typingsJapgolly.fhir.fhirStrings.proposed
import typingsJapgolly.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CareTeam
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * There may be multiple axis of categorization and one team may serve multiple purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization responsible for the care team.
    */
  var managingOrganization: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The meaning/purpose of the team is conveyed in CareTeam.category.  This element may also convey semantics of the team (e.g. "Red trauma team"), but its primary purpose is to distinguish between identical teams in a human-friendly way.  ("Team 18735" isn't as friendly.).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Comments made about the CareTeam.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Identifies all people and organizations who are expected to be involved in the care team.
    */
  var participant: js.UndefOr[js.Array[CareTeamParticipant]] = js.undefined
  
  /**
    * Indicates when the team did (or is intended to) come into effect and end.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Describes why the care team exists.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CareTeam: typingsJapgolly.fhir.fhirStrings.CareTeam
  
  /**
    * This element is labeled as a modifier because the status contains the code entered-in-error that marks the care team as not currently valid.
    */
  var status: js.UndefOr[proposed | active | suspended | inactive | `entered-in-error`] = js.undefined
  
  /**
    * Identifies the patient or group whose intended care is handled by the team.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The ContactPoint.use code of home is not appropriate to use. These contacts are not the contact details of individual care team members.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object CareTeam {
  
  inline def apply(): CareTeam = {
    val __obj = js.Dynamic.literal(resourceType = "CareTeam")
    __obj.asInstanceOf[CareTeam]
  }
  
  extension [Self <: CareTeam](x: Self) {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManagingOrganization(value: js.Array[Reference]): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setManagingOrganizationVarargs(value: Reference*): Self = StObject.set(x, "managingOrganization", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setParticipant(value: js.Array[CareTeamParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: CareTeamParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.CareTeam): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: proposed | active | suspended | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
