package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`hover-primary`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `306` extends StObject {
  
  var name: `hover-primary`
  
  var `type`: color
}
object `306` {
  
  inline def apply(): `306` = {
    val __obj = js.Dynamic.literal(name = "hover-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`306`]
  }
  
  extension [Self <: `306`](x: Self) {
    
    inline def setName(value: `hover-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
