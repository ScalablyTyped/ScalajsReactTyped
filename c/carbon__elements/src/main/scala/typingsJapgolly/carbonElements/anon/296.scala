package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`support-03`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `296` extends StObject {
  
  var name: `support-03`
  
  var `type`: color
}
object `296` {
  
  inline def apply(): `296` = {
    val __obj = js.Dynamic.literal(name = "support-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`296`]
  }
  
  extension [Self <: `296`](x: Self) {
    
    inline def setName(value: `support-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
