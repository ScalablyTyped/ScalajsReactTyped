package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`layer-accent-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var name: `layer-accent-02`
  
  var `type`: color
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setName(value: `layer-accent-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
