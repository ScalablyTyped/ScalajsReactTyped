package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.cancelled
import typingsJapgolly.fhir.fhirStrings.finished
import typingsJapgolly.fhir.fhirStrings.onhold
import typingsJapgolly.fhir.fhirStrings.planned
import typingsJapgolly.fhir.fhirStrings.waitlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareStatusHistory
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The period during this EpisodeOfCare that the specific status applied.
    */
  var period: Period
  
  /**
    * planned | waitlist | active | onhold | finished | cancelled.
    */
  var status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
}
object EpisodeOfCareStatusHistory {
  
  inline def apply(
    period: Period,
    status: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`
  ): EpisodeOfCareStatusHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareStatusHistory]
  }
  
  extension [Self <: EpisodeOfCareStatusHistory](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: planned | waitlist | active | onhold | finished | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
