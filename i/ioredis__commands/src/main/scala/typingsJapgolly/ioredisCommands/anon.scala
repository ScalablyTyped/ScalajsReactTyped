package typingsJapgolly.ioredisCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ParseExternalKey extends StObject {
    
    var parseExternalKey: Boolean
  }
  object ParseExternalKey {
    
    inline def apply(parseExternalKey: Boolean): ParseExternalKey = {
      val __obj = js.Dynamic.literal(parseExternalKey = parseExternalKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseExternalKey]
    }
    
    extension [Self <: ParseExternalKey](x: Self) {
      
      inline def setParseExternalKey(value: Boolean): Self = StObject.set(x, "parseExternalKey", value.asInstanceOf[js.Any])
    }
  }
}
