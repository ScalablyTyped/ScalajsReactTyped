package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.ASTValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ExecutableDefinitions", JSImport.Namespace)
@js.native
object executableDefinitionsMod extends js.Object {
  def ExecutableDefinitions(context: ASTValidationContext): ASTVisitor = js.native
  def nonExecutableDefinitionMessage(defName: String): String = js.native
}

