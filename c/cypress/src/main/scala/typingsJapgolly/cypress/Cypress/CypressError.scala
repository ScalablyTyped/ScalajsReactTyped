package typingsJapgolly.cypress.Cypress

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CypressError
  extends StObject
     with Error {
  
  var codeFrame: js.UndefOr[CodeFrame] = js.undefined
  
  var docsUrl: js.UndefOr[String] = js.undefined
}
object CypressError {
  
  inline def apply(message: String, name: String): CypressError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressError]
  }
  
  extension [Self <: CypressError](x: Self) {
    
    inline def setCodeFrame(value: CodeFrame): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
    
    inline def setCodeFrameUndefined: Self = StObject.set(x, "codeFrame", js.undefined)
    
    inline def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    inline def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
  }
}
