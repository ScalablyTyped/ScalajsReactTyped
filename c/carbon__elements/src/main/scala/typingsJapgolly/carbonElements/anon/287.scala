package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`icon-02`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `287` extends StObject {
  
  var name: `icon-02`
  
  var `type`: color
}
object `287` {
  
  inline def apply(): `287` = {
    val __obj = js.Dynamic.literal(name = "icon-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`287`]
  }
  
  extension [Self <: `287`](x: Self) {
    
    inline def setName(value: `icon-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
