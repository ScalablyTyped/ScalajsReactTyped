package typingsJapgolly.desmos.anon

import typingsJapgolly.desmos.desmosStrings.MEDIUM
import typingsJapgolly.desmos.desmosStrings.SMALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LARGE extends StObject {
  
  var LARGE: typingsJapgolly.desmos.desmosStrings.LARGE
  
  var MEDIUM: typingsJapgolly.desmos.desmosStrings.MEDIUM
  
  var SMALL: typingsJapgolly.desmos.desmosStrings.SMALL
}
object LARGE {
  
  inline def apply(): LARGE = {
    val __obj = js.Dynamic.literal(LARGE = "LARGE", MEDIUM = "MEDIUM", SMALL = "SMALL")
    __obj.asInstanceOf[LARGE]
  }
  
  extension [Self <: LARGE](x: Self) {
    
    inline def setLARGE(value: typingsJapgolly.desmos.desmosStrings.LARGE): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
    
    inline def setMEDIUM(value: MEDIUM): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    
    inline def setSMALL(value: SMALL): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
  }
}
