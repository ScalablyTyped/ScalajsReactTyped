package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`layer-accent-active`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var name: `layer-accent-active`
  
  var `type`: color
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setName(value: `layer-accent-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
