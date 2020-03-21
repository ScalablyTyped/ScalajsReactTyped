package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNames", JSImport.Namespace)
@js.native
object uniqueDirectiveNamesMod extends js.Object {
  def UniqueDirectiveNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateDirectiveNameMessage(directiveName: String): String = js.native
  def existedDirectiveNameMessage(directiveName: String): String = js.native
}

