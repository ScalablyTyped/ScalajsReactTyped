package typingsJapgolly.graphql

import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.validationContextMod.ValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUndefinedVariables", JSImport.Namespace)
@js.native
object noUndefinedVariablesMod extends js.Object {
  def NoUndefinedVariables(context: ValidationContext): ASTVisitor = js.native
  def undefinedVarMessage(varName: String, opName: Maybe[String]): String = js.native
}

