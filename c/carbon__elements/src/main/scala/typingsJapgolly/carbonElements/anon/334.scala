package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`active-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `334` extends StObject {
  
  var name: `active-01`
  
  var `type`: color
}
object `334` {
  
  inline def apply(): `334` = {
    val __obj = js.Dynamic.literal(name = "active-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`334`]
  }
  
  extension [Self <: `334`](x: Self) {
    
    inline def setName(value: `active-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
