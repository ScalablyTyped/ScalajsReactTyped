package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsStrings.LO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait O extends StObject {
  
  var H: typingsJapgolly.screeps.screepsStrings.LH
  
  var O: LO
  
  var U: typingsJapgolly.screeps.screepsStrings.UL
}
object O {
  
  inline def apply(): O = {
    val __obj = js.Dynamic.literal(H = "LH", O = "LO", U = "UL")
    __obj.asInstanceOf[O]
  }
  
  extension [Self <: O](x: Self) {
    
    inline def setH(value: typingsJapgolly.screeps.screepsStrings.LH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: LO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.screeps.screepsStrings.UL): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
  }
}
