package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.`in-progress`
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.onhold
import typingsJapgolly.fhir.fhirStrings.planned
import typingsJapgolly.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterStatusHistory
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The time that the episode was in the specified status.
    */
  var period: Period
  
  /**
    * planned | in-progress | onhold | completed | cancelled | entered-in-error | unknown.
    */
  var status: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown
}
object EncounterStatusHistory {
  
  inline def apply(
    period: Period,
    status: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown
  ): EncounterStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterStatusHistory]
  }
  
  extension [Self <: EncounterStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | `in-progress` | onhold | completed | cancelled | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
