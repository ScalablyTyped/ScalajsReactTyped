package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`border-interactive`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var name: `border-interactive`
  
  var `type`: color
}
object `101` {
  
  inline def apply(): `101` = {
    val __obj = js.Dynamic.literal(name = "border-interactive")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`101`]
  }
  
  extension [Self <: `101`](x: Self) {
    
    inline def setName(value: `border-interactive`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
