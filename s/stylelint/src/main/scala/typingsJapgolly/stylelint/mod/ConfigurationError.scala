package typingsJapgolly.stylelint.mod

import typingsJapgolly.std.Error
import typingsJapgolly.stylelint.stylelintInts.`78`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationError
  extends StObject
     with Error {
  
  var code: `78`
}
object ConfigurationError {
  
  inline def apply(message: String, name: String): ConfigurationError = {
    val __obj = js.Dynamic.literal(code = 78, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationError]
  }
  
  extension [Self <: ConfigurationError](x: Self) {
    
    inline def setCode(value: `78`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
