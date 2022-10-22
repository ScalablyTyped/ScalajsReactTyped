package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.fri
import typingsJapgolly.fhir.fhirStrings.mon
import typingsJapgolly.fhir.fhirStrings.sat
import typingsJapgolly.fhir.fhirStrings.sun
import typingsJapgolly.fhir.fhirStrings.thu
import typingsJapgolly.fhir.fhirStrings.tue
import typingsJapgolly.fhir.fhirStrings.wed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PractitionerRoleAvailableTime
  extends StObject
     with BackboneElement {
  
  var _allDay: js.UndefOr[Element] = js.undefined
  
  var _availableEndTime: js.UndefOr[Element] = js.undefined
  
  var _availableStartTime: js.UndefOr[Element] = js.undefined
  
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Is this always available? (hence times are irrelevant) e.g. 24 hour service.
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The timezone is expected to be for where this HealthcareService is provided at.
    */
  var availableEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timezone is expected to be for where this HealthcareService is provided at.
    */
  var availableStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates which days of the week are available between the start and end Times.
    */
  var daysOfWeek: js.UndefOr[js.Array[mon | tue | wed | thu | fri | sat | sun]] = js.undefined
}
object PractitionerRoleAvailableTime {
  
  inline def apply(): PractitionerRoleAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRoleAvailableTime]
  }
  
  extension [Self <: PractitionerRoleAvailableTime](x: Self) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    inline def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    inline def setDaysOfWeek(value: js.Array[mon | tue | wed | thu | fri | sat | sun]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setDaysOfWeekVarargs(value: (mon | tue | wed | thu | fri | sat | sun)*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
    
    inline def set_allDay(value: Element): Self = StObject.set(x, "_allDay", value.asInstanceOf[js.Any])
    
    inline def set_allDayUndefined: Self = StObject.set(x, "_allDay", js.undefined)
    
    inline def set_availableEndTime(value: Element): Self = StObject.set(x, "_availableEndTime", value.asInstanceOf[js.Any])
    
    inline def set_availableEndTimeUndefined: Self = StObject.set(x, "_availableEndTime", js.undefined)
    
    inline def set_availableStartTime(value: Element): Self = StObject.set(x, "_availableStartTime", value.asInstanceOf[js.Any])
    
    inline def set_availableStartTimeUndefined: Self = StObject.set(x, "_availableStartTime", js.undefined)
    
    inline def set_daysOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def set_daysOfWeekUndefined: Self = StObject.set(x, "_daysOfWeek", js.undefined)
    
    inline def set_daysOfWeekVarargs(value: Element*): Self = StObject.set(x, "_daysOfWeek", js.Array(value*))
  }
}
