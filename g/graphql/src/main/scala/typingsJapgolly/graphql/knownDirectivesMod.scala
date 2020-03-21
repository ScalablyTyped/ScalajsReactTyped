package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.validationContextMod.ValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownDirectives", JSImport.Namespace)
@js.native
object knownDirectivesMod extends js.Object {
  def KnownDirectives(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectives(context: ValidationContext): ASTVisitor = js.native
  def misplacedDirectiveMessage(directiveName: String, location: String): String = js.native
  def unknownDirectiveMessage(directiveName: String): String = js.native
}

