package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`support-caution-major`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var name: `support-caution-major`
  
  var `type`: color
}
object `133` {
  
  inline def apply(): `133` = {
    val __obj = js.Dynamic.literal(name = "support-caution-major")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`133`]
  }
  
  extension [Self <: `133`](x: Self) {
    
    inline def setName(value: `support-caution-major`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
