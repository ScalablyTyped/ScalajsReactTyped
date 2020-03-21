package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.validationContextMod.ValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownArgumentNames", JSImport.Namespace)
@js.native
object knownArgumentNamesMod extends js.Object {
  def KnownArgumentNames(context: ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesOnDirectives(context: SDLValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesOnDirectives(context: ValidationContext): ASTVisitor = js.native
  def unknownArgMessage(argName: String, fieldName: String, typeName: String, suggestedArgs: js.Array[String]): String = js.native
  def unknownDirectiveArgMessage(argName: String, directiveName: String, suggestedArgs: js.Array[String]): String = js.native
}

