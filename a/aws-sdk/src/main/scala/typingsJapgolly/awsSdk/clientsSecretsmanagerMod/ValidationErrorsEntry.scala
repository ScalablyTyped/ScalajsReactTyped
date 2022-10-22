package typingsJapgolly.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationErrorsEntry extends StObject {
  
  /**
    * Checks the name of the policy.
    */
  var CheckName: js.UndefOr[NameType] = js.undefined
  
  /**
    * Displays error messages if validation encounters problems during validation of the resource policy.
    */
  var ErrorMessage: js.UndefOr[typingsJapgolly.awsSdk.clientsSecretsmanagerMod.ErrorMessage] = js.undefined
}
object ValidationErrorsEntry {
  
  inline def apply(): ValidationErrorsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationErrorsEntry]
  }
  
  extension [Self <: ValidationErrorsEntry](x: Self) {
    
    inline def setCheckName(value: NameType): Self = StObject.set(x, "CheckName", value.asInstanceOf[js.Any])
    
    inline def setCheckNameUndefined: Self = StObject.set(x, "CheckName", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
