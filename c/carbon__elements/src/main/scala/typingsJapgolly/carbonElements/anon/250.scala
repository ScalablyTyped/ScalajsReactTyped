package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`spacing-04`
import typingsJapgolly.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  var name: `spacing-04`
  
  var `type`: layout
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal(name = "spacing-04")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`250`]
  }
  
  extension [Self <: `250`](x: Self) {
    
    inline def setName(value: `spacing-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
