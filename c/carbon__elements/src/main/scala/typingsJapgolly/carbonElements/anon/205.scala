package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`tag-color-gray`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  var name: `tag-color-gray`
  
  var `type`: color
}
object `205` {
  
  inline def apply(): `205` = {
    val __obj = js.Dynamic.literal(name = "tag-color-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def setName(value: `tag-color-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
