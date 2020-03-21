package typingsJapgolly.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sparqljs.mod.OperationExpression
    - typingsJapgolly.sparqljs.mod.FunctionCallExpression
    - typingsJapgolly.sparqljs.mod.AggregateExpression
    - typingsJapgolly.sparqljs.mod.BgpPattern
    - typingsJapgolly.sparqljs.mod.GroupPattern
    - typingsJapgolly.sparqljs.mod.Tuple
    - typingsJapgolly.sparqljs.mod.Term
  */
  type Expression = typingsJapgolly.sparqljs.mod._Expression | typingsJapgolly.sparqljs.mod.Term
  type Term = java.lang.String with typingsJapgolly.sparqljs.AnonTermBrand
  type ValuePatternRow = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sparqljs.mod.Term]
  type Variable = typingsJapgolly.sparqljs.mod.VariableExpression | typingsJapgolly.sparqljs.mod.Term
}
