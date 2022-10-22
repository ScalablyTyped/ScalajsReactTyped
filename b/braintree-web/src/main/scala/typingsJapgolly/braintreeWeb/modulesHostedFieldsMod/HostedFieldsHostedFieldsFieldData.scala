package typingsJapgolly.braintreeWeb.modulesHostedFieldsMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsHostedFieldsFieldData extends StObject {
  
  var container: HTMLElement
  
  var isEmpty: Boolean
  
  var isFocused: Boolean
  
  var isPotentiallyValid: Boolean
  
  var isValid: Boolean
}
object HostedFieldsHostedFieldsFieldData {
  
  inline def apply(
    container: HTMLElement,
    isEmpty: Boolean,
    isFocused: Boolean,
    isPotentiallyValid: Boolean,
    isValid: Boolean
  ): HostedFieldsHostedFieldsFieldData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsHostedFieldsFieldData]
  }
  
  extension [Self <: HostedFieldsHostedFieldsFieldData](x: Self) {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsPotentiallyValid(value: Boolean): Self = StObject.set(x, "isPotentiallyValid", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
