package typingsJapgolly.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.NthChild
  - typingsJapgolly.esquery.mod.NthLastChild
*/
trait NthSelector
  extends StObject
     with SubjectSelector
object NthSelector {
  
  inline def NthChild(index: NumericLiteral): typingsJapgolly.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.NthChild]
  }
  
  inline def NthLastChild(index: NumericLiteral): typingsJapgolly.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[typingsJapgolly.esquery.mod.NthLastChild]
  }
}
