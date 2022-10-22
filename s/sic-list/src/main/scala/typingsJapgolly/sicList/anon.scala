package typingsJapgolly.sicList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var description: String
  }
  object Code {
    
    inline def apply(code: String, description: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
}
