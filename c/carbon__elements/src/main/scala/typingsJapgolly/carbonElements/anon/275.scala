package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`ui-background`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `275` extends StObject {
  
  var name: `ui-background`
  
  var `type`: color
}
object `275` {
  
  inline def apply(): `275` = {
    val __obj = js.Dynamic.literal(name = "ui-background")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`275`]
  }
  
  extension [Self <: `275`](x: Self) {
    
    inline def setName(value: `ui-background`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
