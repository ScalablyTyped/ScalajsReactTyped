package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse-hover`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  var name: `notification-action-tertiary-inverse-hover`
  
  var `type`: color
}
object `180` {
  
  inline def apply(): `180` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`180`]
  }
  
  extension [Self <: `180`](x: Self) {
    
    inline def setName(value: `notification-action-tertiary-inverse-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
