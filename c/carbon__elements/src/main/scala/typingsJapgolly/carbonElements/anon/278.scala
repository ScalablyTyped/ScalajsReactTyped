package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`ui-03`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `278` extends StObject {
  
  var name: `ui-03`
  
  var `type`: color
}
object `278` {
  
  inline def apply(): `278` = {
    val __obj = js.Dynamic.literal(name = "ui-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`278`]
  }
  
  extension [Self <: `278`](x: Self) {
    
    inline def setName(value: `ui-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
