package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`field-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var name: `field-02`
  
  var `type`: color
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal(name = "field-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setName(value: `field-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
