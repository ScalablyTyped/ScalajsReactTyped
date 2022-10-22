package typingsJapgolly.intlifyCoreBase.mod

import typingsJapgolly.intlifyMessageCompiler.mod.CompileError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreError
  extends StObject
     with CompileError {
  
  @JSName("code")
  var code_CoreError: CoreErrorCodes
}
object CoreError {
  
  inline def apply(code: CoreErrorCodes, message: String, name: String): CoreError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreError]
  }
  
  extension [Self <: CoreError](x: Self) {
    
    inline def setCode(value: CoreErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
