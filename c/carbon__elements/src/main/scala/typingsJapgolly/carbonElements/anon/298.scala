package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`inverse-support-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `298` extends StObject {
  
  var name: `inverse-support-01`
  
  var `type`: color
}
object `298` {
  
  inline def apply(): `298` = {
    val __obj = js.Dynamic.literal(name = "inverse-support-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`298`]
  }
  
  extension [Self <: `298`](x: Self) {
    
    inline def setName(value: `inverse-support-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
