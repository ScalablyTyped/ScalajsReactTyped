package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`link-secondary`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  var name: `link-secondary`
  
  var `type`: color
}
object `114` {
  
  inline def apply(): `114` = {
    val __obj = js.Dynamic.literal(name = "link-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`114`]
  }
  
  extension [Self <: `114`](x: Self) {
    
    inline def setName(value: `link-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
