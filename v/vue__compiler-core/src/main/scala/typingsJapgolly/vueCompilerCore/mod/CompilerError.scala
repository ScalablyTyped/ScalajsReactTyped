package typingsJapgolly.vueCompilerCore.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerError
  extends StObject
     with Error {
  
  var code: Double | String
  
  var loc: js.UndefOr[SourceLocation] = js.undefined
}
object CompilerError {
  
  inline def apply(code: Double | String, message: String, name: String): CompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerError]
  }
  
  extension [Self <: CompilerError](x: Self) {
    
    inline def setCode(value: Double | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
