package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`icon-03`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `288` extends StObject {
  
  var name: `icon-03`
  
  var `type`: color
}
object `288` {
  
  inline def apply(): `288` = {
    val __obj = js.Dynamic.literal(name = "icon-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`288`]
  }
  
  extension [Self <: `288`](x: Self) {
    
    inline def setName(value: `icon-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
