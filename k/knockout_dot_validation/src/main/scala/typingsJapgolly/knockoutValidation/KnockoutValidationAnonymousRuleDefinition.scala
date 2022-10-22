package typingsJapgolly.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationAnonymousRuleDefinition extends StObject {
  
  var validation: KnockoutValidationRuleDefinition
}
object KnockoutValidationAnonymousRuleDefinition {
  
  inline def apply(validation: KnockoutValidationRuleDefinition): KnockoutValidationAnonymousRuleDefinition = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationAnonymousRuleDefinition]
  }
  
  extension [Self <: KnockoutValidationAnonymousRuleDefinition](x: Self) {
    
    inline def setValidation(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
