package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.asap
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.routine
import typingsJapgolly.fhir.fhirStrings.stat
import typingsJapgolly.fhir.fhirStrings.suspended
import typingsJapgolly.fhir.fhirStrings.unknown
import typingsJapgolly.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When the request was made.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * Plan/proposal/order fulfilled by this request.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the supply is expected to come from.
    */
  var deliverFrom: js.UndefOr[Reference] = js.undefined
  
  /**
    * Where the supply is destined to go.
    */
  var deliverTo: js.UndefOr[Reference] = js.undefined
  
  /**
    * The identifier.type element is used to distinguish between the identifiers assigned by the requester/placer and the performer/filler.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Note that there's a difference between a prescription - an instruction to take a medication, along with a (sometimes) implicit supply, and an explicit request to supply, with no explicit instructions.
    */
  var item: CodeableReference
  
  /**
    * When the request should be fulfilled.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Specific parameters for the ordered item.  For example, the size of the indicated item.
    */
  var parameter: js.UndefOr[js.Array[SupplyRequestParameter]] = js.undefined
  
  /**
    * Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * The amount that is being ordered of the indicated item.
    */
  var quantity: Quantity
  
  /**
    * The reason why the supply item was requested.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The device, practitioner, etc. who initiated the request.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SupplyRequest: typingsJapgolly.fhir.fhirStrings.SupplyRequest
  
  /**
    * Status of the supply request.
    */
  var status: js.UndefOr[
    draft | active | suspended | cancelled | completed | `entered-in-error` | unknown
  ] = js.undefined
  
  /**
    * Who is intended to fulfill the request.
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
}
object SupplyRequest {
  
  inline def apply(item: CodeableReference, quantity: Quantity): SupplyRequest = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], resourceType = "SupplyRequest")
    __obj.asInstanceOf[SupplyRequest]
  }
  
  extension [Self <: SupplyRequest](x: Self) {
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDeliverFrom(value: Reference): Self = StObject.set(x, "deliverFrom", value.asInstanceOf[js.Any])
    
    inline def setDeliverFromUndefined: Self = StObject.set(x, "deliverFrom", js.undefined)
    
    inline def setDeliverTo(value: Reference): Self = StObject.set(x, "deliverTo", value.asInstanceOf[js.Any])
    
    inline def setDeliverToUndefined: Self = StObject.set(x, "deliverTo", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setParameter(value: js.Array[SupplyRequestParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SupplyRequestParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.SupplyRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | suspended | cancelled | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value*))
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
