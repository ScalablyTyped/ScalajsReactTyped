package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`decorative-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `328` extends StObject {
  
  var name: `decorative-01`
  
  var `type`: color
}
object `328` {
  
  inline def apply(): `328` = {
    val __obj = js.Dynamic.literal(name = "decorative-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`328`]
  }
  
  extension [Self <: `328`](x: Self) {
    
    inline def setName(value: `decorative-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
