package typingsJapgolly.fhir.r2Mod

import typingsJapgolly.fhir.fhirStrings.`in-progress`
import typingsJapgolly.fhir.fhirStrings.accepted
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.failed
import typingsJapgolly.fhir.fhirStrings.planned
import typingsJapgolly.fhir.fhirStrings.proposed
import typingsJapgolly.fhir.fhirStrings.received
import typingsJapgolly.fhir.fhirStrings.rejected
import typingsJapgolly.fhir.fhirStrings.requested
import typingsJapgolly.fhir.fhirStrings.review
import typingsJapgolly.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticOrderEvent
  extends StObject
     with BackboneElement {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The person responsible for performing or recording the action.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date/time at which the event occurred.
    */
  var dateTime: String
  
  /**
    * Additional information about the event that occurred - e.g. if the status remained unchanged.
    */
  var description: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The status for the event.
    */
  var status: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
}
object DiagnosticOrderEvent {
  
  inline def apply(
    dateTime: String,
    status: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
  ): DiagnosticOrderEvent = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticOrderEvent]
  }
  
  extension [Self <: DiagnosticOrderEvent](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: CodeableConcept): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(
      value: proposed | draft | planned | requested | received | accepted | `in-progress` | review | completed | cancelled | suspended | rejected | failed
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
