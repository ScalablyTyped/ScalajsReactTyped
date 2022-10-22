package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.screepsStrings.GO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HO extends StObject {
  
  var H: typingsJapgolly.screeps.screepsStrings.GH
  
  var O: GO
}
object HO {
  
  inline def apply(): HO = {
    val __obj = js.Dynamic.literal(H = "GH", O = "GO")
    __obj.asInstanceOf[HO]
  }
  
  extension [Self <: HO](x: Self) {
    
    inline def setH(value: typingsJapgolly.screeps.screepsStrings.GH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: GO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
