package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`border-subtle`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var name: `border-subtle`
  
  var `type`: color
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal(name = "border-subtle")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`155`]
  }
  
  extension [Self <: `155`](x: Self) {
    
    inline def setName(value: `border-subtle`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
