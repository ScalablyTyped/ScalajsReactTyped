package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.queryDefinitionMod.NgQueryDefinition
import typingsJapgolly.angularCore.queryDefinitionMod.QueryTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: Null, createTodo: Boolean): TransformedQueryResult = js.native
  def getTransformedQueryCallExpr(query: NgQueryDefinition, timing: QueryTiming, createTodo: Boolean): TransformedQueryResult = js.native
  type TransformedQueryResult = Null | AnonFailureMessage
}

