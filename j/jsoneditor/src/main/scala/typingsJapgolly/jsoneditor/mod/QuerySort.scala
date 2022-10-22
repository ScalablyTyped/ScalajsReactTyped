package typingsJapgolly.jsoneditor.mod

import typingsJapgolly.jsoneditor.jsoneditorStrings.`@`
import typingsJapgolly.jsoneditor.jsoneditorStrings.asc
import typingsJapgolly.jsoneditor.jsoneditorStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySort extends StObject {
  
  var direction: asc | desc
  
  var field: String | `@`
}
object QuerySort {
  
  inline def apply(direction: asc | desc, field: String | `@`): QuerySort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySort]
  }
  
  extension [Self <: QuerySort](x: Self) {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
