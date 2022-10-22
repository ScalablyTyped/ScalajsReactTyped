package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`expressive-heading-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var name: `expressive-heading-01`
  
  var `type`: typingsJapgolly.carbonElements.carbonElementsStrings.`type`
}
object `234` {
  
  inline def apply(): `234` = {
    val __obj = js.Dynamic.literal(name = "expressive-heading-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`234`]
  }
  
  extension [Self <: `234`](x: Self) {
    
    inline def setName(value: `expressive-heading-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
