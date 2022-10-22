package typingsJapgolly.searchIndex.mod

import typingsJapgolly.searchIndex.anon.EXCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  inline def AND(AND: js.Array[Token]): typingsJapgolly.searchIndex.mod.AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.AND]
  }
  
  inline def FieldOnlyObject(FIELD: Field): typingsJapgolly.searchIndex.mod.FieldOnlyObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.FieldOnlyObject]
  }
  
  inline def FieldValueObject(FIELD: Field, VALUE: String | RangeValueObject): typingsJapgolly.searchIndex.mod.FieldValueObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.FieldValueObject]
  }
  
  inline def NOT(NOT: EXCLUDE): typingsJapgolly.searchIndex.mod.NOT = {
    val __obj = js.Dynamic.literal(NOT = NOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.NOT]
  }
  
  inline def OR(OR: js.Array[Token]): typingsJapgolly.searchIndex.mod.OR = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.OR]
  }
  
  inline def SEARCH(SEARCH: js.Array[Token]): typingsJapgolly.searchIndex.mod.SEARCH = {
    val __obj = js.Dynamic.literal(SEARCH = SEARCH.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.SEARCH]
  }
}
