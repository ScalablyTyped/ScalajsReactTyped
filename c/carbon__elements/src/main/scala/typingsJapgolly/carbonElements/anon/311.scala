package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`hover-tertiary`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `311` extends StObject {
  
  var name: `hover-tertiary`
  
  var `type`: color
}
object `311` {
  
  inline def apply(): `311` = {
    val __obj = js.Dynamic.literal(name = "hover-tertiary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`311`]
  }
  
  extension [Self <: `311`](x: Self) {
    
    inline def setName(value: `hover-tertiary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
