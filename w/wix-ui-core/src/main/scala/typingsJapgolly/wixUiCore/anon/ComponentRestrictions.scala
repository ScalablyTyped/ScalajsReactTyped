package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRestrictions extends StObject {
  
  var componentRestrictions: js.UndefOr[Country] = js.undefined
  
  var input: String
}
object ComponentRestrictions {
  
  inline def apply(input: String): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRestrictions]
  }
  
  extension [Self <: ComponentRestrictions](x: Self) {
    
    inline def setComponentRestrictions(value: Country): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
