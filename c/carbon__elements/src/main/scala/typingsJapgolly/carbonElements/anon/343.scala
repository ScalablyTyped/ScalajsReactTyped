package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`layout-07`
import typingsJapgolly.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `343` extends StObject {
  
  var name: `layout-07`
  
  var `type`: layout
}
object `343` {
  
  inline def apply(): `343` = {
    val __obj = js.Dynamic.literal(name = "layout-07")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`343`]
  }
  
  extension [Self <: `343`](x: Self) {
    
    inline def setName(value: `layout-07`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
