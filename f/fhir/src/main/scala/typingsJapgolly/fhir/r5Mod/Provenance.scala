package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provenance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _occurredDateTime: js.UndefOr[Element] = js.undefined
  
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  /**
    * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
    */
  var activity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Several agents may be associated (i.e. has some responsibility for an activity) with an activity and vice-versa.
    */
  var agent: js.Array[ProvenanceAgent]
  
  /**
    * The authorization (e.g., PurposeOfUse) that was used during the event being recorded.
    */
  var authorization: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Allows tracing of authorizatino for the events and tracking whether proposals/recommendations were acted upon.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred, but some events may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter (e.g. pre-admission lab tests).
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * An entity used in this activity.
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.undefined
  
  /**
    * Where the activity occurred, if relevant.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period can be a little arbitrary; where possible, the time should correspond to human assessment of the activity time.
    */
  var occurredDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The period can be a little arbitrary; where possible, the time should correspond to human assessment of the activity time.
    */
  var occurredPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * For example: Where an OAuth token authorizes, the unique identifier from the OAuth token is placed into the policy element Where a policy engine (e.g. XACML) holds policy logic, the unique policy identifier is placed into the policy element.
    */
  var policy: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This can be a little different from the time stamp on the resource if there is a delay between recording the event and updating the provenance and target resource.
    */
  var recorded: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Provenance: typingsJapgolly.fhir.fhirStrings.Provenance
  
  /**
    * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.undefined
  
  /**
    * Target references are usually version specific, but might not be, if a version has not been assigned or if the provenance information is part of the set of resources being maintained (i.e. a document). When using the RESTful API, the identity of the resource might not be known (especially not the version specific one); the client may either submit the resource first, and then the provenance, or it may submit both using a single transaction. See the notes on transaction for further discussion.
    */
  var target: js.Array[Reference]
}
object Provenance {
  
  inline def apply(agent: js.Array[ProvenanceAgent], target: js.Array[Reference]): Provenance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], resourceType = "Provenance", target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provenance]
  }
  
  extension [Self <: Provenance](x: Self) {
    
    inline def setActivity(value: CodeableConcept): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setAgent(value: js.Array[ProvenanceAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentVarargs(value: ProvenanceAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setAuthorization(value: js.Array[CodeableReference]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setAuthorizationVarargs(value: CodeableReference*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEntity(value: js.Array[ProvenanceEntity]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEntityVarargs(value: ProvenanceEntity*): Self = StObject.set(x, "entity", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOccurredDateTime(value: String): Self = StObject.set(x, "occurredDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurredDateTimeUndefined: Self = StObject.set(x, "occurredDateTime", js.undefined)
    
    inline def setOccurredPeriod(value: Period): Self = StObject.set(x, "occurredPeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurredPeriodUndefined: Self = StObject.set(x, "occurredPeriod", js.undefined)
    
    inline def setPolicy(value: js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRecordedUndefined: Self = StObject.set(x, "recorded", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.Provenance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: js.Array[Signature]): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureVarargs(value: Signature*): Self = StObject.set(x, "signature", js.Array(value*))
    
    inline def setTarget(value: js.Array[Reference]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: Reference*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_occurredDateTime(value: Element): Self = StObject.set(x, "_occurredDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurredDateTimeUndefined: Self = StObject.set(x, "_occurredDateTime", js.undefined)
    
    inline def set_policy(value: js.Array[Element]): Self = StObject.set(x, "_policy", value.asInstanceOf[js.Any])
    
    inline def set_policyUndefined: Self = StObject.set(x, "_policy", js.undefined)
    
    inline def set_policyVarargs(value: Element*): Self = StObject.set(x, "_policy", js.Array(value*))
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
  }
}
