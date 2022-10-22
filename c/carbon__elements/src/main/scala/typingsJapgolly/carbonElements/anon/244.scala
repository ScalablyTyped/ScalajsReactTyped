package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`display-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244` extends StObject {
  
  var name: `display-02`
  
  var `type`: typingsJapgolly.carbonElements.carbonElementsStrings.`type`
}
object `244` {
  
  inline def apply(): `244` = {
    val __obj = js.Dynamic.literal(name = "display-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`244`]
  }
  
  extension [Self <: `244`](x: Self) {
    
    inline def setName(value: `display-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
