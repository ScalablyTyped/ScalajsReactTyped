package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.color
import typingsJapgolly.carbonElements.carbonElementsStrings.layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var name: layer
  
  var `type`: color
}
object `145` {
  
  inline def apply(): `145` = {
    val __obj = js.Dynamic.literal(name = "layer")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`145`]
  }
  
  extension [Self <: `145`](x: Self) {
    
    inline def setName(value: layer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
