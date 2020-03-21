package typingsJapgolly.graphql

import typingsJapgolly.graphql.validationContextMod.ValidationContext
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedFragments", JSImport.Namespace)
@js.native
object noUnusedFragmentsMod extends js.Object {
  def NoUnusedFragments(context: ValidationContext): ASTVisitor = js.native
  def unusedFragMessage(fragName: String): String = js.native
}

