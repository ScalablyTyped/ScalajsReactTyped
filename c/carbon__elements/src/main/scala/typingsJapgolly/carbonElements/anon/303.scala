package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`danger-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `303` extends StObject {
  
  var name: `danger-01`
  
  var `type`: color
}
object `303` {
  
  inline def apply(): `303` = {
    val __obj = js.Dynamic.literal(name = "danger-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`303`]
  }
  
  extension [Self <: `303`](x: Self) {
    
    inline def setName(value: `danger-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
