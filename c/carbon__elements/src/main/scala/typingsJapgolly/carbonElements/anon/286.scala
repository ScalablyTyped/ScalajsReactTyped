package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`icon-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `286` extends StObject {
  
  var name: `icon-01`
  
  var `type`: color
}
object `286` {
  
  inline def apply(): `286` = {
    val __obj = js.Dynamic.literal(name = "icon-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`286`]
  }
  
  extension [Self <: `286`](x: Self) {
    
    inline def setName(value: `icon-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
