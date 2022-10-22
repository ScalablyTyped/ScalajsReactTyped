package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeRegulatorySchedule
  extends StObject
     with BackboneElement {
  
  /**
    * Specifies the specific drug schedule.
    */
  var schedule: CodeableConcept
}
object MedicationKnowledgeRegulatorySchedule {
  
  inline def apply(schedule: CodeableConcept): MedicationKnowledgeRegulatorySchedule = {
    val __obj = js.Dynamic.literal(schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeRegulatorySchedule]
  }
  
  extension [Self <: MedicationKnowledgeRegulatorySchedule](x: Self) {
    
    inline def setSchedule(value: CodeableConcept): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}
