package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.ValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoFragmentCycles", JSImport.Namespace)
@js.native
object noFragmentCyclesMod extends js.Object {
  def NoFragmentCycles(context: ValidationContext): ASTVisitor = js.native
  def cycleErrorMessage(fragName: String, spreadNames: js.Array[String]): String = js.native
}

