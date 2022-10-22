package typingsJapgolly.psl

import typingsJapgolly.psl.pslStrings.DOMAIN_TOO_LONG
import typingsJapgolly.psl.pslStrings.DOMAIN_TOO_SHORT
import typingsJapgolly.psl.pslStrings.LABEL_ENDS_WITH_DASH
import typingsJapgolly.psl.pslStrings.LABEL_INVALID_CHARS
import typingsJapgolly.psl.pslStrings.LABEL_STARTS_WITH_DASH
import typingsJapgolly.psl.pslStrings.LABEL_TOO_LONG
import typingsJapgolly.psl.pslStrings.LABEL_TOO_SHORT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS
    
    var message: String
  }
  object Code {
    
    inline def apply(
      code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS,
      message: String
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(
        value: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS
      ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
