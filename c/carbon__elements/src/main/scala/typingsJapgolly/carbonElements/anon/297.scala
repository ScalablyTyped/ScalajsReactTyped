package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`support-04`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `297` extends StObject {
  
  var name: `support-04`
  
  var `type`: color
}
object `297` {
  
  inline def apply(): `297` = {
    val __obj = js.Dynamic.literal(name = "support-04")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`297`]
  }
  
  extension [Self <: `297`](x: Self) {
    
    inline def setName(value: `support-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
