package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`ui-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `276` extends StObject {
  
  var name: `ui-01`
  
  var `type`: color
}
object `276` {
  
  inline def apply(): `276` = {
    val __obj = js.Dynamic.literal(name = "ui-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`276`]
  }
  
  extension [Self <: `276`](x: Self) {
    
    inline def setName(value: `ui-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
