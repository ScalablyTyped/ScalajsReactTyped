package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`button-tertiary-hover`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  var name: `button-tertiary-hover`
  
  var `type`: color
}
object `171` {
  
  inline def apply(): `171` = {
    val __obj = js.Dynamic.literal(name = "button-tertiary-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`171`]
  }
  
  extension [Self <: `171`](x: Self) {
    
    inline def setName(value: `button-tertiary-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
