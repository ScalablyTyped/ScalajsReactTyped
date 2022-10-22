package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.shexj.mod.EachOf
  - typingsJapgolly.shexj.mod.OneOf
  - typingsJapgolly.shexj.mod.TripleConstraint
*/
trait tripleExpr extends StObject
object tripleExpr {
  
  inline def EachOf(expressions: js.Array[tripleExprOrRef]): typingsJapgolly.shexj.mod.EachOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EachOf")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.EachOf]
  }
  
  inline def OneOf(expressions: js.Array[tripleExprOrRef]): typingsJapgolly.shexj.mod.OneOf = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OneOf")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.OneOf]
  }
  
  inline def TripleConstraint(predicate: IRIREF): typingsJapgolly.shexj.mod.TripleConstraint = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TripleConstraint")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.TripleConstraint]
  }
}
