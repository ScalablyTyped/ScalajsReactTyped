package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`heading-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var name: `heading-02`
  
  var `type`: typingsJapgolly.carbonElements.carbonElementsStrings.`type`
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal(name = "heading-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`227`]
  }
  
  extension [Self <: `227`](x: Self) {
    
    inline def setName(value: `heading-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
