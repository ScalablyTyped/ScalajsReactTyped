package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`skeleton-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `329` extends StObject {
  
  var name: `skeleton-01`
  
  var `type`: color
}
object `329` {
  
  inline def apply(): `329` = {
    val __obj = js.Dynamic.literal(name = "skeleton-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`329`]
  }
  
  extension [Self <: `329`](x: Self) {
    
    inline def setName(value: `skeleton-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
