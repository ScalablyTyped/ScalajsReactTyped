package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`inverse-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `293` extends StObject {
  
  var name: `inverse-02`
  
  var `type`: color
}
object `293` {
  
  inline def apply(): `293` = {
    val __obj = js.Dynamic.literal(name = "inverse-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`293`]
  }
  
  extension [Self <: `293`](x: Self) {
    
    inline def setName(value: `inverse-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
