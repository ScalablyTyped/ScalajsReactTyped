package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`link-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `289` extends StObject {
  
  var name: `link-01`
  
  var `type`: color
}
object `289` {
  
  inline def apply(): `289` = {
    val __obj = js.Dynamic.literal(name = "link-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`289`]
  }
  
  extension [Self <: `289`](x: Self) {
    
    inline def setName(value: `link-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
