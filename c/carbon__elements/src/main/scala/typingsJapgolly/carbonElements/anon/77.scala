package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`layer-accent-03`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var name: `layer-accent-03`
  
  var `type`: color
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setName(value: `layer-accent-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
