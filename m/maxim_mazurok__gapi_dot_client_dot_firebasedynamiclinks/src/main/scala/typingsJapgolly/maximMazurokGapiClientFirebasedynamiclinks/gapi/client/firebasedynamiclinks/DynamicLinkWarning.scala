package typingsJapgolly.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicLinkWarning extends StObject {
  
  /** The warning code. */
  var warningCode: js.UndefOr[String] = js.undefined
  
  /** The document describing the warning, and helps resolve. */
  var warningDocumentLink: js.UndefOr[String] = js.undefined
  
  /** The warning message to help developers improve their requests. */
  var warningMessage: js.UndefOr[String] = js.undefined
}
object DynamicLinkWarning {
  
  inline def apply(): DynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkWarning]
  }
  
  extension [Self <: DynamicLinkWarning](x: Self) {
    
    inline def setWarningCode(value: String): Self = StObject.set(x, "warningCode", value.asInstanceOf[js.Any])
    
    inline def setWarningCodeUndefined: Self = StObject.set(x, "warningCode", js.undefined)
    
    inline def setWarningDocumentLink(value: String): Self = StObject.set(x, "warningDocumentLink", value.asInstanceOf[js.Any])
    
    inline def setWarningDocumentLinkUndefined: Self = StObject.set(x, "warningDocumentLink", js.undefined)
    
    inline def setWarningMessage(value: String): Self = StObject.set(x, "warningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "warningMessage", js.undefined)
  }
}
