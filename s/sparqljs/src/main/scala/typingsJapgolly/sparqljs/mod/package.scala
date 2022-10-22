package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rdfjsTypes.dataModelMod.BlankNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Literal
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlankTerm = BlankNode

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.OperationExpression
  - typingsJapgolly.sparqljs.mod.FunctionCallExpression
  - typingsJapgolly.sparqljs.mod.AggregateExpression
  - typingsJapgolly.sparqljs.mod.BgpPattern
  - typingsJapgolly.sparqljs.mod.GraphPattern
  - typingsJapgolly.sparqljs.mod.GroupPattern
  - typingsJapgolly.sparqljs.mod.Tuple
  - typingsJapgolly.sparqljs.mod.Term
*/
type Expression = _Expression | Term

type IriTerm = NamedNode[String]

type LiteralTerm = Literal

type QuadTerm = Quad

type Term = VariableTerm | IriTerm | LiteralTerm | BlankTerm | QuadTerm

type ValuePatternRow = StringDictionary[js.UndefOr[IriTerm | BlankTerm | LiteralTerm]]

type Variable = VariableExpression | VariableTerm

type VariableTerm = typingsJapgolly.rdfjsTypes.dataModelMod.Variable
