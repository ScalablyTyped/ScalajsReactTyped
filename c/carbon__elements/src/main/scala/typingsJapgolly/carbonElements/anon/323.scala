package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`hover-row`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `323` extends StObject {
  
  var name: `hover-row`
  
  var `type`: color
}
object `323` {
  
  inline def apply(): `323` = {
    val __obj = js.Dynamic.literal(name = "hover-row")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`323`]
  }
  
  extension [Self <: `323`](x: Self) {
    
    inline def setName(value: `hover-row`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
