package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsStrings.UO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L extends StObject {
  
  var H: typingsJapgolly.screeps.screepsStrings.UH
  
  var L: typingsJapgolly.screeps.screepsStrings.UL
  
  var O: UO
}
object L {
  
  inline def apply(): L = {
    val __obj = js.Dynamic.literal(H = "UH", L = "UL", O = "UO")
    __obj.asInstanceOf[L]
  }
  
  extension [Self <: L](x: Self) {
    
    inline def setH(value: typingsJapgolly.screeps.screepsStrings.UH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setL(value: typingsJapgolly.screeps.screepsStrings.UL): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    inline def setO(value: UO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
