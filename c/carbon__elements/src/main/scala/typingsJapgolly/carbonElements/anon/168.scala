package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`button-danger-hover`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var name: `button-danger-hover`
  
  var `type`: color
}
object `168` {
  
  inline def apply(): `168` = {
    val __obj = js.Dynamic.literal(name = "button-danger-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`168`]
  }
  
  extension [Self <: `168`](x: Self) {
    
    inline def setName(value: `button-danger-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
