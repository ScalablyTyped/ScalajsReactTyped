package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedPersonCommunication
  extends StObject
     with BackboneElement {
  
  var _preferred: js.UndefOr[Element] = js.undefined
  
  /**
    * The structure aa-BB with this exact casing is one the most widely used notations for locale. However not all systems actually code this but instead have it as free text. Hence CodeableConcept instead of code as the data type.
    */
  var language: CodeableConcept
  
  /**
    * This language is specifically identified for communicating healthcare information.
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
}
object RelatedPersonCommunication {
  
  inline def apply(language: CodeableConcept): RelatedPersonCommunication = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedPersonCommunication]
  }
  
  extension [Self <: RelatedPersonCommunication](x: Self) {
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
  }
}
