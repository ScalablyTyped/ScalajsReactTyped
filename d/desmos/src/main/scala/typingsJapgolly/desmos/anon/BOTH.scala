package typingsJapgolly.desmos.anon

import typingsJapgolly.desmos.desmosStrings.NONE
import typingsJapgolly.desmos.desmosStrings.POSITIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTH extends StObject {
  
  var BOTH: typingsJapgolly.desmos.desmosStrings.BOTH
  
  var NONE: typingsJapgolly.desmos.desmosStrings.NONE
  
  var POSITIVE: typingsJapgolly.desmos.desmosStrings.POSITIVE
}
object BOTH {
  
  inline def apply(): BOTH = {
    val __obj = js.Dynamic.literal(BOTH = "BOTH", NONE = "NONE", POSITIVE = "POSITIVE")
    __obj.asInstanceOf[BOTH]
  }
  
  extension [Self <: BOTH](x: Self) {
    
    inline def setBOTH(value: typingsJapgolly.desmos.desmosStrings.BOTH): Self = StObject.set(x, "BOTH", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: NONE): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPOSITIVE(value: POSITIVE): Self = StObject.set(x, "POSITIVE", value.asInstanceOf[js.Any])
  }
}
