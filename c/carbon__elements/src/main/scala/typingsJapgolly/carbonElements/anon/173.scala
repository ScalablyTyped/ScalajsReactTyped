package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`notification-background-error`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  var name: `notification-background-error`
  
  var `type`: color
}
object `173` {
  
  inline def apply(): `173` = {
    val __obj = js.Dynamic.literal(name = "notification-background-error")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`173`]
  }
  
  extension [Self <: `173`](x: Self) {
    
    inline def setName(value: `notification-background-error`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
