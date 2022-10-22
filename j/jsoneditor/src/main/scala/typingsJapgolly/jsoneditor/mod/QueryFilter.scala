package typingsJapgolly.jsoneditor.mod

import typingsJapgolly.jsoneditor.jsoneditorStrings.EqualssignEqualssign
import typingsJapgolly.jsoneditor.jsoneditorStrings.ExclamationmarkEqualssign
import typingsJapgolly.jsoneditor.jsoneditorStrings.Greaterthansign
import typingsJapgolly.jsoneditor.jsoneditorStrings.GreaterthansignEqualssign
import typingsJapgolly.jsoneditor.jsoneditorStrings.Lessthansign
import typingsJapgolly.jsoneditor.jsoneditorStrings.LessthansignEqualssign
import typingsJapgolly.jsoneditor.jsoneditorStrings.`@`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilter extends StObject {
  
  var field: String | `@`
  
  var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  
  var value: String
}
object QueryFilter {
  
  inline def apply(
    field: String | `@`,
    relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    value: String
  ): QueryFilter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilter]
  }
  
  extension [Self <: QueryFilter](x: Self) {
    
    inline def setField(value: String | `@`): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setRelation(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
