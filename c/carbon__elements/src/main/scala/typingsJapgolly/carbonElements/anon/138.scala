package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`toggle-off`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  var name: `toggle-off`
  
  var `type`: color
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal(name = "toggle-off")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setName(value: `toggle-off`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
