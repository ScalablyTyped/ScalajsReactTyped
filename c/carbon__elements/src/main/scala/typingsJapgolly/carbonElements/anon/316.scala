package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`active-ui`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `316` extends StObject {
  
  var name: `active-ui`
  
  var `type`: color
}
object `316` {
  
  inline def apply(): `316` = {
    val __obj = js.Dynamic.literal(name = "active-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`316`]
  }
  
  extension [Self <: `316`](x: Self) {
    
    inline def setName(value: `active-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
