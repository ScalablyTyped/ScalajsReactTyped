package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`layer-selected-inverse`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var name: `layer-selected-inverse`
  
  var `type`: color
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setName(value: `layer-selected-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
