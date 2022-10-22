package typingsJapgolly.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var `type`: ModuleType
}
object Module {
  
  inline def apply(`type`: ModuleType): Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setType(value: ModuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
