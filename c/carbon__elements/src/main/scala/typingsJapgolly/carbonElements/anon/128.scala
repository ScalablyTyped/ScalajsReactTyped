package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`support-info`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var name: `support-info`
  
  var `type`: color
}
object `128` {
  
  inline def apply(): `128` = {
    val __obj = js.Dynamic.literal(name = "support-info")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setName(value: `support-info`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
