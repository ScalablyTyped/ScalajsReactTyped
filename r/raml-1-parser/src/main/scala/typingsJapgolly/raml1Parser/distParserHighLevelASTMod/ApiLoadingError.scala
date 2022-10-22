package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiLoadingError
  extends StObject
     with Error {
  
  var parserErrors: js.Array[RamlParserError]
}
object ApiLoadingError {
  
  inline def apply(message: String, name: String, parserErrors: js.Array[RamlParserError]): ApiLoadingError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parserErrors = parserErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiLoadingError]
  }
  
  extension [Self <: ApiLoadingError](x: Self) {
    
    inline def setParserErrors(value: js.Array[RamlParserError]): Self = StObject.set(x, "parserErrors", value.asInstanceOf[js.Any])
    
    inline def setParserErrorsVarargs(value: RamlParserError*): Self = StObject.set(x, "parserErrors", js.Array(value*))
  }
}
