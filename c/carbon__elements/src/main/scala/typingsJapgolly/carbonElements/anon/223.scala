package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`code-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var name: `code-01`
  
  var `type`: typingsJapgolly.carbonElements.carbonElementsStrings.`type`
}
object `223` {
  
  inline def apply(): `223` = {
    val __obj = js.Dynamic.literal(name = "code-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`223`]
  }
  
  extension [Self <: `223`](x: Self) {
    
    inline def setName(value: `code-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
