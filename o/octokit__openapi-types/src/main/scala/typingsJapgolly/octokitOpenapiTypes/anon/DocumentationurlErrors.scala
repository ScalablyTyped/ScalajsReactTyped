package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationurlErrors extends StObject {
  
  var documentation_url: js.UndefOr[String] = js.undefined
  
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object DocumentationurlErrors {
  
  inline def apply(): DocumentationurlErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationurlErrors]
  }
  
  extension [Self <: DocumentationurlErrors](x: Self) {
    
    inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    inline def setDocumentation_urlUndefined: Self = StObject.set(x, "documentation_url", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
