package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`brand-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `332` extends StObject {
  
  var name: `brand-02`
  
  var `type`: color
}
object `332` {
  
  inline def apply(): `332` = {
    val __obj = js.Dynamic.literal(name = "brand-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`332`]
  }
  
  extension [Self <: `332`](x: Self) {
    
    inline def setName(value: `brand-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
