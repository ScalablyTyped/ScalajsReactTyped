package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`tag-hover-cool-gray`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  var name: `tag-hover-cool-gray`
  
  var `type`: color
}
object `209` {
  
  inline def apply(): `209` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-cool-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`209`]
  }
  
  extension [Self <: `209`](x: Self) {
    
    inline def setName(value: `tag-hover-cool-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
