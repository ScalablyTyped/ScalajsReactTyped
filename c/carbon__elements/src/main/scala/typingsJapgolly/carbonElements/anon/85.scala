package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`field-03`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var name: `field-03`
  
  var `type`: color
}
object `85` {
  
  inline def apply(): `85` = {
    val __obj = js.Dynamic.literal(name = "field-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`85`]
  }
  
  extension [Self <: `85`](x: Self) {
    
    inline def setName(value: `field-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
