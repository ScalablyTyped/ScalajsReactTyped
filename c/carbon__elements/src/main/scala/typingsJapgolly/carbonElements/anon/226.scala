package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`productive-heading-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var name: `productive-heading-01`
  
  var `type`: typingsJapgolly.carbonElements.carbonElementsStrings.`type`
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal(name = "productive-heading-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setName(value: `productive-heading-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
