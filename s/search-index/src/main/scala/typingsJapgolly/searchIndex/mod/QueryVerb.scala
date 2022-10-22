package typingsJapgolly.searchIndex.mod

import typingsJapgolly.searchIndex.anon.EXCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.searchIndex.mod.AND
  - typingsJapgolly.searchIndex.mod.NOT
  - typingsJapgolly.searchIndex.mod.OR
  - typingsJapgolly.searchIndex.mod.SEARCH
*/
trait QueryVerb
  extends StObject
     with _Token
object QueryVerb {
  
  inline def AND(AND: js.Array[Token]): typingsJapgolly.searchIndex.mod.AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.searchIndex.mod.AND]
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
