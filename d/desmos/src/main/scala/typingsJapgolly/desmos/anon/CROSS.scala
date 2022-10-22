package typingsJapgolly.desmos.anon

import typingsJapgolly.desmos.desmosStrings.DASHED
import typingsJapgolly.desmos.desmosStrings.DOTTED
import typingsJapgolly.desmos.desmosStrings.OPEN
import typingsJapgolly.desmos.desmosStrings.POINT
import typingsJapgolly.desmos.desmosStrings.SOLID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CROSS extends StObject {
  
  var CROSS: typingsJapgolly.desmos.desmosStrings.CROSS
  
  var DASHED: typingsJapgolly.desmos.desmosStrings.DASHED
  
  var DOTTED: typingsJapgolly.desmos.desmosStrings.DOTTED
  
  var OPEN: typingsJapgolly.desmos.desmosStrings.OPEN
  
  var POINT: typingsJapgolly.desmos.desmosStrings.POINT
  
  var SOLID: typingsJapgolly.desmos.desmosStrings.SOLID
}
object CROSS {
  
  inline def apply(): CROSS = {
    val __obj = js.Dynamic.literal(CROSS = "CROSS", DASHED = "DASHED", DOTTED = "DOTTED", OPEN = "OPEN", POINT = "POINT", SOLID = "SOLID")
    __obj.asInstanceOf[CROSS]
  }
  
  extension [Self <: CROSS](x: Self) {
    
    inline def setCROSS(value: typingsJapgolly.desmos.desmosStrings.CROSS): Self = StObject.set(x, "CROSS", value.asInstanceOf[js.Any])
    
    inline def setDASHED(value: DASHED): Self = StObject.set(x, "DASHED", value.asInstanceOf[js.Any])
    
    inline def setDOTTED(value: DOTTED): Self = StObject.set(x, "DOTTED", value.asInstanceOf[js.Any])
    
    inline def setOPEN(value: OPEN): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    
    inline def setPOINT(value: POINT): Self = StObject.set(x, "POINT", value.asInstanceOf[js.Any])
    
    inline def setSOLID(value: SOLID): Self = StObject.set(x, "SOLID", value.asInstanceOf[js.Any])
  }
}
