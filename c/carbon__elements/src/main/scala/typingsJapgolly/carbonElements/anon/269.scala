package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`icon-size-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `269` extends StObject {
  
  var name: `icon-size-01`
  
  var `type`: layout
}
object `269` {
  
  inline def apply(): `269` = {
    val __obj = js.Dynamic.literal(name = "icon-size-01")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`269`]
  }
  
  extension [Self <: `269`](x: Self) {
    
    inline def setName(value: `icon-size-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
