package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`spacing-07`
import typingsJapgolly.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  var name: `spacing-07`
  
  var `type`: layout
}
object `253` {
  
  inline def apply(): `253` = {
    val __obj = js.Dynamic.literal(name = "spacing-07")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`253`]
  }
  
  extension [Self <: `253`](x: Self) {
    
    inline def setName(value: `spacing-07`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
