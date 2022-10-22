package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.`non-document-error`
import typingsJapgolly.htmlValidator.htmlValidatorStrings.internal
import typingsJapgolly.htmlValidator.htmlValidatorStrings.io
import typingsJapgolly.htmlValidator.htmlValidatorStrings.schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicNonDocumentErrorObject extends StObject {
  
  var subType: js.UndefOr[internal | io | schema] = js.undefined
  
  var `type`: `non-document-error`
}
object ValidationMessageBasicNonDocumentErrorObject {
  
  inline def apply(): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("non-document-error")
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
  
  extension [Self <: ValidationMessageBasicNonDocumentErrorObject](x: Self) {
    
    inline def setSubType(value: internal | io | schema): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setType(value: `non-document-error`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
