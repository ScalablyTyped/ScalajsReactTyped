package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationAdministrationPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The device, practitioner, etc. who performed the action.
    */
  var actor: Reference
  
  /**
    * The organization the device or practitioner was acting on behalf of.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}
object MedicationAdministrationPerformer {
  
  inline def apply(actor: Reference): MedicationAdministrationPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministrationPerformer]
  }
  
  extension [Self <: MedicationAdministrationPerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
  }
}
