package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`inverse-link`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `291` extends StObject {
  
  var name: `inverse-link`
  
  var `type`: color
}
object `291` {
  
  inline def apply(): `291` = {
    val __obj = js.Dynamic.literal(name = "inverse-link")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`291`]
  }
  
  extension [Self <: `291`](x: Self) {
    
    inline def setName(value: `inverse-link`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
