package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`tag-color-green`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202` extends StObject {
  
  var name: `tag-color-green`
  
  var `type`: color
}
object `202` {
  
  inline def apply(): `202` = {
    val __obj = js.Dynamic.literal(name = "tag-color-green")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`202`]
  }
  
  extension [Self <: `202`](x: Self) {
    
    inline def setName(value: `tag-color-green`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
