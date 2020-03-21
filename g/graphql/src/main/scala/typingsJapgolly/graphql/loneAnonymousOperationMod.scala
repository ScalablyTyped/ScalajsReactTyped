package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.ASTValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneAnonymousOperation", JSImport.Namespace)
@js.native
object loneAnonymousOperationMod extends js.Object {
  def LoneAnonymousOperation(context: ASTValidationContext): ASTVisitor = js.native
  def anonOperationNotAloneMessage(): String = js.native
}

