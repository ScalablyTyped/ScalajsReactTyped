package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse-active`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var name: `notification-action-tertiary-inverse-active`
  
  var `type`: color
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setName(value: `notification-action-tertiary-inverse-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
