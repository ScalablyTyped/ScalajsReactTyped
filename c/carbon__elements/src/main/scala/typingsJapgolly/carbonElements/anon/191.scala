package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`tag-hover-purple`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  var name: `tag-hover-purple`
  
  var `type`: color
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-purple")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setName(value: `tag-hover-purple`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
