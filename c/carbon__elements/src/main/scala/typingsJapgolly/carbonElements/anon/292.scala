package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`inverse-01`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `292` extends StObject {
  
  var name: `inverse-01`
  
  var `type`: color
}
object `292` {
  
  inline def apply(): `292` = {
    val __obj = js.Dynamic.literal(name = "inverse-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`292`]
  }
  
  extension [Self <: `292`](x: Self) {
    
    inline def setName(value: `inverse-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
