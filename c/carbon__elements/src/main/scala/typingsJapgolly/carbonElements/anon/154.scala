package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`field-hover`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var name: `field-hover`
  
  var `type`: color
}
object `154` {
  
  inline def apply(): `154` = {
    val __obj = js.Dynamic.literal(name = "field-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`154`]
  }
  
  extension [Self <: `154`](x: Self) {
    
    inline def setName(value: `field-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
