package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`focus-inset`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var name: `focus-inset`
  
  var `type`: color
}
object `141` {
  
  inline def apply(): `141` = {
    val __obj = js.Dynamic.literal(name = "focus-inset")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`141`]
  }
  
  extension [Self <: `141`](x: Self) {
    
    inline def setName(value: `focus-inset`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
