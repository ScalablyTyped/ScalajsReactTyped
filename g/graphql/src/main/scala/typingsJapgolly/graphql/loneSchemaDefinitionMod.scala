package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.SDLValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneSchemaDefinition", JSImport.Namespace)
@js.native
object loneSchemaDefinitionMod extends js.Object {
  def LoneSchemaDefinition(context: SDLValidationContext): ASTVisitor = js.native
  def canNotDefineSchemaWithinExtensionMessage(): String = js.native
  def schemaDefinitionNotAloneMessage(): String = js.native
}

