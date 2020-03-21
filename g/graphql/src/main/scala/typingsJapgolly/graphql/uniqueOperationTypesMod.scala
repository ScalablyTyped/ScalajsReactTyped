package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationTypes", JSImport.Namespace)
@js.native
object uniqueOperationTypesMod extends js.Object {
  def UniqueOperationTypes(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateOperationTypeMessage(operation: String): String = js.native
  def existedOperationTypeMessage(operation: String): String = js.native
}

