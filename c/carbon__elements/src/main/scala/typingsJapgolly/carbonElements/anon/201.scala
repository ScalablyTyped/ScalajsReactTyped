package typingsJapgolly.carbonElements.anon

import typingsJapgolly.carbonElements.carbonElementsStrings.`tag-background-green`
import typingsJapgolly.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var name: `tag-background-green`
  
  var `type`: color
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal(name = "tag-background-green")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`201`]
  }
  
  extension [Self <: `201`](x: Self) {
    
    inline def setName(value: `tag-background-green`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
