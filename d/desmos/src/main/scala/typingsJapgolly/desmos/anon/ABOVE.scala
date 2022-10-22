package typingsJapgolly.desmos.anon

import typingsJapgolly.desmos.desmosStrings.BELOW
import typingsJapgolly.desmos.desmosStrings.DEFAULT
import typingsJapgolly.desmos.desmosStrings.LEFT
import typingsJapgolly.desmos.desmosStrings.RIGHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABOVE extends StObject {
  
  var ABOVE: typingsJapgolly.desmos.desmosStrings.ABOVE
  
  var BELOW: typingsJapgolly.desmos.desmosStrings.BELOW
  
  var DEFAULT: typingsJapgolly.desmos.desmosStrings.DEFAULT
  
  var LEFT: typingsJapgolly.desmos.desmosStrings.LEFT
  
  var RIGHT: typingsJapgolly.desmos.desmosStrings.RIGHT
}
object ABOVE {
  
  inline def apply(): ABOVE = {
    val __obj = js.Dynamic.literal(ABOVE = "ABOVE", BELOW = "BELOW", DEFAULT = "DEFAULT", LEFT = "LEFT", RIGHT = "RIGHT")
    __obj.asInstanceOf[ABOVE]
  }
  
  extension [Self <: ABOVE](x: Self) {
    
    inline def setABOVE(value: typingsJapgolly.desmos.desmosStrings.ABOVE): Self = StObject.set(x, "ABOVE", value.asInstanceOf[js.Any])
    
    inline def setBELOW(value: BELOW): Self = StObject.set(x, "BELOW", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: DEFAULT): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: LEFT): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: RIGHT): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
  }
}
